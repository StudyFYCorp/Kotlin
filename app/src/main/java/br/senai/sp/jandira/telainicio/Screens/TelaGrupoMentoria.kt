package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoriaRemnants.ColumnCard
import br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoriaRemnants.HeaderGrupoMentoria
import br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoriaRemnants.mentorGrupo
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily


fun DropdownMenuItem(onClick: () -> Unit, interactionSource: @Composable () -> Unit) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaGrupoMentoria(controleDeNavegacao: NavHostController) {

    var atividades = remember { mutableStateOf(false) }
    var membros = remember { mutableStateOf(false) }
    var duvidas = remember { mutableStateOf(false) }
    var selectedBox by remember { mutableStateOf(null) }

    var barraVisivel by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(802.dp)
                .padding(horizontal = 20.dp)
                .background(Color.White)
        ) {

            // QUEBRAR AQUI

        HeaderGrupoMentoria()

            //ACABA AQUI


            //MENTOR COMEÇO
    mentorGrupo()

            //MENTOR FIM
            Spacer(modifier = Modifier.height(10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween

            ) {


            }
            //COLUMN CARD
    ColumnCard()

            //FIM COLUMN CARD
            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(25.dp) // Ajuste o valor para aumentar ou diminuir o espaço
            ) {
                Box(
                    modifier = Modifier
//                        .background(Color(0xffFFF28A))
                        .height(46.dp)
                        .background(
                            if (selectedBox == "membros") Color(0xffFFF28A) else Color(
                                0xfffE9CE03
                            ), shape = RoundedCornerShape(10.dp)
                        )
                        .width(100.dp)
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xfFFF28A) // Cor da sombra sólida
                            val offsetX = 5f // Deslocamento horizontal da sombra
                            val offsetY = 10f // Deslocamento vertical da sombra
                            val cornerRadius = 30f // Raio dos cantos arredondados

                            // Desenha a sombra sólida com cantos arredondados
                            drawRoundRect(
                                color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                topLeft = Offset(
                                    -offsetX,
                                    offsetY
                                ), // Define o deslocamento da sombra (lateral e para baixo)
                                size = Size(
                                    size.width + offsetX * 2, // Aumenta a largura da sombra
                                    size.height + offsetY // Aumenta a altura da sombra
                                ), // Tamanho da sombra ajustado
                                cornerRadius = CornerRadius(
                                    cornerRadius,
                                    cornerRadius
                                ) // Define os cantos arredondados
                            )
                        }
                        .height(60.dp) // Mantém a altura desejada
                        .width(400.dp) // Mantém a largura desejada
                        .background(
                            Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp)
                        ) // Aplica o fundo com bordas arredondadas
                        .border(
                            1.dp,
                            color = Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                        )
                        .clickable {
                            atividades.value = false
                            duvidas.value = false
                            membros.value = true
                            selectedBox = null
                        },
                    contentAlignment = Alignment.Center


                ) {
                    Text(
                        text = "MEMBROS",
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp
                    )
                }


                Box(
                    modifier = Modifier
//                        .background(Color(0xFFFEE101))
                        .background(
                            if (selectedBox == "Atividades") Color(0xffFFF28A) else Color(
                                0xfffE9CE03
                            ), shape = RoundedCornerShape(10.dp)
                        )
                        .height(46.dp)
                        .width(100.dp)
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xfffE9CE03) // Cor da sombra sólida
                            val offsetX = 5f // Deslocamento horizontal da sombra
                            val offsetY = 10f // Deslocamento vertical da sombra
                            val cornerRadius = 30f // Raio dos cantos arredondados

                            // Desenha a sombra sólida com cantos arredondados
                            drawRoundRect(
                                color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                topLeft = Offset(
                                    -offsetX,
                                    offsetY
                                ), // Define o deslocamento da sombra (lateral e para baixo)
                                size = Size(
                                    size.width + offsetX * 2, // Aumenta a largura da sombra
                                    size.height + offsetY // Aumenta a altura da sombra
                                ), // Tamanho da sombra ajustado
                                cornerRadius = CornerRadius(
                                    cornerRadius,
                                    cornerRadius
                                ) // Define os cantos arredondados
                            )
                        }
                        .height(60.dp) // Mantém a altura desejada
                        .width(400.dp) // Mantém a largura desejada
                        .background(
                            Color(0xFFFEE101),
                            shape = RoundedCornerShape(10.dp)
                        ) // Aplica o fundo com bordas arredondadas
                        .border(
                            1.dp,
                            color = Color(0xFFFEE101),
                            shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                        )
                        .clickable {
                            atividades.value = true
                            duvidas.value = false
                            membros.value = false
                            selectedBox = null
                        },

                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "ATIVIDADES",
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp
                    )
                }

                Box(
                    modifier = Modifier
//                        .background(Color(0xffFFF28A), shape = RoundedCornerShape(10.dp))
                        .background(
                            if (selectedBox == "Outra") Color(0xffFFF28A) else Color(
                                0xfffE9CE03
                            ), shape = RoundedCornerShape(10.dp)
                        )
                        .height(46.dp)
                        .width(100.dp)
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xfFFF28A) // Cor da sombra sólida
                            val offsetX = 5f // Deslocamento horizontal da sombra
                            val offsetY = 10f // Deslocamento vertical da sombra
                            val cornerRadius = 30f // Raio dos cantos arredondados

                            // Desenha a sombra sólida com cantos arredondados
                            drawRoundRect(
                                color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                topLeft = Offset(
                                    -offsetX,
                                    offsetY
                                ), // Define o deslocamento da sombra (lateral e para baixo)
                                size = Size(
                                    size.width + offsetX * 2, // Aumenta a largura da sombra
                                    size.height + offsetY // Aumenta a altura da sombra
                                ), // Tamanho da sombra ajustado
                                cornerRadius = CornerRadius(
                                    cornerRadius,
                                    cornerRadius
                                ) // Define os cantos arredondados
                            )
                        }
                        .height(60.dp) // Mantém a altura desejada
                        .width(400.dp) // Mantém a largura desejada
                        .background(
                            Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp)
                        ) // Aplica o fundo com bordas arredondadas
                        .border(
                            1.dp,
                            color = Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                        )
                        .clickable {
                            atividades.value = false
                            duvidas.value = true
                            membros.value = false
                            selectedBox = null

                        },
                    contentAlignment = Alignment.Center


                ) {
                    Text(
                        text = "DUVIDA",
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = poppinsFontFamily,
                        fontSize = 12.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            //atividade//
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .heightIn(min = 230.dp, max = 315.dp)  // Define a altura mínima
                    .fillMaxWidth()
                    .border(BorderStroke(1.dp, Color(0xffD9D9D9)))
            ) {
                if (atividades.value == true) {

                    Row(
                        modifier = Modifier
                            .background(Color(0xFFFFFFFF))
                            .height(60.dp)
                            .width(400.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .width(220.dp)
                                .background(Color.White, RoundedCornerShape(10.dp))
                                .drawBehind {
                                    // Configurações da sombra
                                    val shadowColor = Color(0xFFD9D9D9) // Cor da sombra
                                    val offsetX = 5f // Deslocamento horizontal da sombra
                                    val offsetY = 5f // Deslocamento vertical da sombra
                                    val cornerRadius = 30f // Raio dos cantos arredondados

                                    // Desenha a sombra com cantos arredondados
                                    drawRoundRect(
                                        color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                        topLeft = Offset(
                                            -offsetX,
                                            -offsetY
                                        ), // Desloca a sombra para cima e para os lados
                                        size = Size(
                                            size.width + offsetX * 2, // Aumenta a largura da sombra
                                            size.height + offsetY * 2 // Aumenta a altura para cobrir tanto em cima quanto embaixo
                                        ),
                                        cornerRadius = CornerRadius(
                                            cornerRadius,
                                            cornerRadius
                                        ) // Define os cantos arredondados
                                    )
                                }
                                .height(40.dp)
                                .background(Color.White, shape = RoundedCornerShape(10.dp))
                                .padding(horizontal = 10.dp)
                                .border(
                                    1.dp,
                                    color = Color.Transparent, // Mantém a borda transparente
                                    shape = RoundedCornerShape(10.dp)
                                ),
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.pesquisa),
                                contentDescription = "Lupa",
                                modifier = Modifier
                                    .size(24.dp) // Define o tamanho da imagem, ajuste conforme necessário
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.lupa),
                            contentDescription = "Lupa",
                            modifier = Modifier
                                .size(24.dp) // Define o tamanho da imagem, ajuste conforme necessário
                        )
                    }

                    Spacer(modifier = Modifier.height(40.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xfffffffff))
                            .heightIn(min = 100.dp)
                            .width(400.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(110.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.SpaceAround,
                                modifier = Modifier
                                    .background(Color.White)
                                    .border(
                                        shape = RoundedCornerShape(10.dp),
                                        border = BorderStroke(1.dp, Color(0xFFFEE101))
                                    )
                                    .fillMaxHeight()
                                    .width(150.dp)

                                    .drawBehind {
                                        // Configurações da sombra
                                        val shadowColor = Color(0xFFFEE101) // Cor da sombra sólida
                                        val offsetX = 5f // Deslocamento horizontal da sombra
                                        val offsetY = 10f // Deslocamento vertical da sombra
                                        val cornerRadius = 30f // Raio dos cantos arredondados

                                        // Desenha a sombra sólida com cantos arredondados
                                        drawRoundRect(
                                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                            topLeft = Offset(
                                                -offsetX,
                                                offsetY
                                            ), // Define o deslocamento da sombra (lateral e para baixo)
                                            size = Size(
                                                size.width + offsetX * 2, // Aumenta a largura da sombra
                                                size.height + offsetY // Aumenta a altura da sombra
                                            ), // Tamanho da sombra ajustado
                                            cornerRadius = CornerRadius(
                                                cornerRadius,
                                                cornerRadius
                                            ) // Define os cantos arredondados
                                        )
                                    }
                                    .height(60.dp) // Mantém a altura desejada
                                    .width(400.dp) // Mantém a largura desejada
                                    .background(
                                        Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp)
                                    ) // Aplica o fundo com bordas arredondadas
                                    .border(
                                        1.dp,
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados

                                    )
//
                            ) {
                                Text(
                                    text = "Atividade complementar de multiplos.",
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp
                                )
                                Row(
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.livro),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            text = "10 questões",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.pessoas),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            modifier = Modifier.width(50.dp),
                                            text = "12 membros já fizeram",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.width(30.dp))

                            Column(
                                verticalArrangement = Arrangement.SpaceAround,
                                modifier = Modifier
                                    .background(Color.White)
                                    .border(
                                        shape = RoundedCornerShape(10.dp),
                                        border = BorderStroke(1.dp, Color(0xFFFEE101))
                                    )
                                    .fillMaxHeight()
                                    .width(150.dp)

                                    .drawBehind {
                                        // Configurações da sombra
                                        val shadowColor = Color(0xFFFEE101) // Cor da sombra sólida
                                        val offsetX = 5f // Deslocamento horizontal da sombra
                                        val offsetY = 10f // Deslocamento vertical da sombra
                                        val cornerRadius = 30f // Raio dos cantos arredondados

                                        // Desenha a sombra sólida com cantos arredondados
                                        drawRoundRect(
                                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                            topLeft = Offset(
                                                -offsetX,
                                                offsetY
                                            ), // Define o deslocamento da sombra (lateral e para baixo)
                                            size = Size(
                                                size.width + offsetX * 2, // Aumenta a largura da sombra
                                                size.height + offsetY // Aumenta a altura da sombra
                                            ), // Tamanho da sombra ajustado
                                            cornerRadius = CornerRadius(
                                                cornerRadius,
                                                cornerRadius
                                            ) // Define os cantos arredondados
                                        )
                                    }
                                    .height(60.dp) // Mantém a altura desejada
                                    .width(400.dp) // Mantém a largura desejada
                                    .background(
                                        Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp)
                                    ) // Aplica o fundo com bordas arredondadas
                                    .border(
                                        1.dp,
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados

                                    )
//
                            ) {
                                Text(
                                    text = "Atividade complementar de equações.",
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp
                                )
                                Row(
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.livro),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            text = "10 questões",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.pessoas),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            modifier = Modifier.width(60.dp),
                                            text = "12 membros já fizeram",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                }
                            }
                        }
                    }
                }

                //membros//
                else if (membros.value == true) {
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }

                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )

                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }
                    Row(
                        modifier = Modifier
                            .background(Color(0xffD9D9D9))
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()


                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color(0xffD9D9D9))
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color(0xffD9D9D9))
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = (" Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }
                } else if (duvidas.value == true) {
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(90.dp)
                                .width(205.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Dúvida: Como resolver equações?"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 12.sp
                            )


                        }

                    }
                }
            }
        }
    }
    BarradeNavegacao(controleDeNavegacao)

}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun TelaGrupoMentoriaPreview() {
    TelaGrupoMentoria(rememberNavController())
}