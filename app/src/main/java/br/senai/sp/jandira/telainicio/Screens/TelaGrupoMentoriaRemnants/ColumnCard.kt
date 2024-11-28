package br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoriaRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun ColumnCard(modifier: Modifier = Modifier) {

    Column(
        modifier = Modifier
            .drawBehind {
                // Configurações da sombra
                val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
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
                Color.White,
                shape = RoundedCornerShape(10.dp)
            ) // Aplica o fundo com bordas arredondadas
            .border(
                1.dp,
                color = Color(0xFFD9D9D9),
                shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
            )
    ) {

        Row {

            Box(modifier = Modifier.size(60.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.usuario),
                    contentDescription = "usuario",
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 15.dp)
                        .width(20.dp)
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box() {
                Text(
                    text = "Nome do mentor",
                    fontFamily = poppinsFontFamily,
                    modifier = Modifier
                        .padding(start = 10.dp, top = 10.dp),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = ("20 pessoas"),
                    fontFamily = poppinsFontFamily,
                    modifier = Modifier
                        .padding(top = 24.dp, start = 10.dp),
                    fontSize = 14.sp
                )

            }

            Box(


                modifier = Modifier
                    .size(160.dp)
                    .padding(start = 20.dp)
            ) {


                Image(
                    painter = painterResource(id = R.drawable.linha),
                    contentDescription = "linha",
                    modifier = Modifier
                        .height(60.dp)
                        .width(80.dp)
                        .padding(start = 2.dp, top = 10.dp, bottom = 10.dp),
                )
                Text(
                    "4.5",
                    fontFamily = poppinsFontFamily,
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .align(Alignment.TopStart),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    "(254 avaliações)",
                    fontFamily = poppinsFontFamily,
                    modifier = Modifier
                        .padding(top = 25.dp, start = 45.dp)
                        .align(Alignment.TopStart),
                    fontSize = 6.sp
                )
                Image(
                    painter = painterResource(id = R.drawable.estrelas),
                    contentDescription = "teste",
                    modifier = Modifier
                        .size(90.dp) // Ajuste o tamanho conforme necessário
                        .align(Alignment.Center)
                        .padding(
                            bottom = 20.dp,
                            start = 30.dp
                        ) // Tente alinhar ao centro para ver se é exibido corretamente
                )
            }


        }
    }

}

@Preview
@Composable
 fun  ColumnCardPreview() {
     ColumnCard()

}