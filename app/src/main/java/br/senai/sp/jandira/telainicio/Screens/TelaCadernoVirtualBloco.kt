package br.senai.sp.jandira.telainicio.Screens

import android.system.Os.remove
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun BlocoCadernoVirtual(controledeNavegacao: NavHostController) {
    // Gerenciando a lista de notas com estado
    var notas by remember {
        mutableStateOf(
            listOf(
                "Tectonismo",
                "Geologia",
                "Estrutura da Terra",
                "Climatologia"
            )
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(35.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Cabeçalho
        Text(text = "Caderno Virtual", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Column(
            modifier = Modifier.padding(vertical = 25.dp),
        ) {
            Text(
                text = "Todas as notas",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFFE9CE03),
                modifier = Modifier.fillMaxWidth()
            )

            Text(
                text = "Organize suas ideias e mantenha tudo em um só lugar",
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                fontFamily = poppinsFontFamily,
                color = Color(0xFFF9B9B9B),
                fontWeight = FontWeight.Light,
                modifier = Modifier.fillMaxWidth()
            )
        }

        // Ícones de Ação
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.lupacaderno),
                contentDescription = "Pesquisar",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Image(
                painter = painterResource(id = R.drawable.ordem),
                contentDescription = "Ordenar",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Image(
                painter = painterResource(id = R.drawable.trespontosconfig),
                contentDescription = "Configurações",
                modifier = Modifier.size(30.dp)
            )
        }

        // Lista de Notas
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .border(2.dp, Color.Black, RoundedCornerShape(20.dp))
                .padding(10.dp)

        ) {
            LazyColumn {
                items(notas) { nota ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .background(Color(0xFFF6F6F6), RoundedCornerShape(10.dp))
                            .padding(10.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = nota,
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "21 de mar.",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.lixeira), // Adicione o ícone de lixeira no drawable
                            contentDescription = "Excluir",
                            modifier = Modifier
                                .size(24.dp)
                                .clickable {
                                    // Remove o item da lista com base no índice
                                    val index = notas.indexOf(nota)
                                    if (index != -1) {
                                        notas = notas
                                            .toMutableList()
                                            .apply { removeAt(index) }
                                    }
                                },
                            tint = Color.Black
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier
                .size(60.dp) // Define o tamanho do botão
                .clip(CircleShape) // Torna o botão redondo
                .background(Color.Yellow) // Cor de fundo do botão
                .clickable { /* Ação do botão */ } // Ação de clique

        ) {
            // Colocando o ícone dentro do botão
            Icon(
                imageVector = Icons.Default.Add, // Ícone de adicionar
                contentDescription = "Adicionar",
                tint = Color.Black, // Cor do ícone
                modifier = Modifier
                    .size(24.dp) // Tamanho do ícone
                    .align(Alignment.Center) // Alinha o ícone no centro
            )
        }
    }

    BarradeNavegacao(controledeNavegacao)
}

@Preview
@Composable
fun BlocoCadernoVirtualPreview() {
    BlocoCadernoVirtual (controledeNavegacao = rememberNavController())
}