package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun BlocoCadernoVirtual(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(35.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Caderno Vitual")

        Column(
            modifier = Modifier
                .padding(25.dp),
        ) {
            Text(
                text = "Todas as notas",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFFE9CE03),
                modifier = Modifier
                    .fillMaxWidth() // Faz com que o Text ocupe toda a largura disponível
                    .padding(start = 10.dp) // Adiciona um pequeno padding, se necessário

            )

            Text(
                text = "Organize suas ideias e mantenha tudo em um só lugar\n",
                fontSize = 15.sp,
                textAlign = TextAlign.Center, // Alinha o texto ao centro horizontalmente
                fontFamily = poppinsFontFamily,
                color = Color(0xFFF9B9B9B),
                fontWeight = FontWeight.Light,
                modifier = Modifier
                    .fillMaxWidth() // Faz com que o Text ocupe toda a largura disponível
                    .padding(start = 10.dp) // Adiciona um pequeno padding, se necessário
            )
        }

        Box() {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.lupacaderno),
                    contentDescription = "",
                    modifier = Modifier
                        .size(30.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.ordem),
                    contentDescription = "",
                    modifier = Modifier
                        .size(30.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.trespontosconfig),
                    contentDescription = "",
                    modifier = Modifier
                        .size(30.dp)
                )
            }
        }

        Box(modifier = Modifier
            .height(192.dp)
            .width(298.dp)
            .border(2.dp, Color.Black, RoundedCornerShape(20.dp))
        ){
            Column {
                Box(){
                    Text(text = "blablablablabla")
                    Text(text = "21 de mar.")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun BlocoCadernoVirtualPreview() {
    BlocoCadernoVirtual()
}