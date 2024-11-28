package br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoriaRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoria
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun HeaderGrupoMentoria() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
    ) {

        Box(
            modifier = Modifier
                .padding(top = 15.dp)
                .height(50.dp)
                .width(200.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                color = Color(0xFF302F2F),
                text = "Grupo de mentoria",
                fontFamily = poppinsFontFamily,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 20.dp)
            )
        }

        Spacer(modifier = Modifier.height(50.dp))
        // Row com o card quadrado e descrição
        Row(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .drawBehind {
                        // Configurações da sombra
                        val shadowColor = Color(0xFFE9CE03) // Cor da sombra sólida
                        val offsetY = 15f // Deslocamento no eixo Y
                        val cornerRadius = 20f // Raio dos cantos arredondados

                        // Desenha a sombra sólida com cantos arredondados
                        drawRoundRect(
                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                            topLeft = Offset(0f, offsetY), // Define o deslocamento da sombra
                            size = Size(
                                size.width,
                                size.height
                            ), // Tamanho da sombra igual ao da Column
                            cornerRadius = CornerRadius(
                                cornerRadius,
                                cornerRadius
                            ) // Define os cantos arredondados
                        )
                    }
                    .border(
                        width = 1.dp, // Largura da borda
                        color = Color(0xFFE9CE03), // Cor da borda
                        shape = RoundedCornerShape(10.dp) // O mesmo shape para a borda
                    )
                    .fillMaxHeight()
                    .width(130.dp)
                    .background(Color(0xFFFEE101), shape = RoundedCornerShape(10.dp))
            ) {
                Image(
                    modifier = Modifier
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "Mascote"
                )
                Text(
                    text = "Membros 18/30",
                    fontFamily = poppinsFontFamily,
                    color = Color.Black,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                ) // Mudando a cor do texto para branco
            }
            Column(
                modifier = Modifier
                    .fillMaxHeight(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Descrição",
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Bold
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                            val offsetY = 15f // Deslocamento no eixo Y
                            val cornerRadius = 20f // Raio dos cantos arredondados

                            // Desenha a sombra sólida com cantos arredondados
                            drawRoundRect(
                                color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                topLeft = Offset(
                                    0f,
                                    offsetY
                                ), // Define o deslocamento da sombra
                                size = Size(
                                    size.width,
                                    size.height
                                ), // Tamanho da sombra igual ao da Column
                                cornerRadius = CornerRadius(
                                    cornerRadius,
                                    cornerRadius
                                ) // Define os cantos arredondados
                            )
                        }
                        .height(120.dp)
                        .background(Color.White, shape = RoundedCornerShape(10.dp))
                        .border(
                            1.dp,
                            color = Color(0xFFD9D9D9),
                            shape = RoundedCornerShape(5.dp)
                        )

                ) {
                    Text(
                        "Um grupo de mentoria de atividades voltado para história é uma iniciativa que promove a troca de conhecimentos ",
                        fontSize = 10.sp,
                        fontFamily = poppinsFontFamily,
                        modifier = Modifier.padding(start = 9.dp, top = 10.dp)
                    )
                }

            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = false)
@Composable
fun HeaderGrupoMentoriaPreview() {
    HeaderGrupoMentoria()
}