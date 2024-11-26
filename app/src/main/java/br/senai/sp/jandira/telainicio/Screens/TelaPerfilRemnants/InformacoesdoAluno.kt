package br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.Screens.TelaPerfil
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily


@Composable
fun InformacoesdoAluno(){


    Column(
        modifier = Modifier
            .padding(start = 10.dp)
            .height(170.dp)
            .fillMaxWidth()


    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(120.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                ) {
                    Text(
                        text = "Estudando",
                        fontFamily = poppinsFontFamily,

                        fontWeight = FontWeight.Medium,

                        fontSize = 20.sp
                    )
                    Text(
                        text = "Historia",
                        fontFamily = poppinsFontFamily,

                        fontWeight = FontWeight.Medium,

                        fontSize = 15.sp
                    )
                }
            }

            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(60.dp)
            )

            Box(
                modifier = Modifier
                    .width(130.dp)
                    .height(60.dp)
            ) {
                Text(
                    text = "Aluno/Mentor",
                    fontFamily = poppinsFontFamily,

                    fontWeight = FontWeight.Medium,

                    fontSize = 18.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(170.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                ) {
                    Text(
                        text = "Série",
                        fontFamily = poppinsFontFamily,

                        fontWeight = FontWeight.Medium,

                        fontSize = 20.sp
                    )
                    Text(
                        text = "3º - fundamental 1",
                        fontFamily = poppinsFontFamily,
                  fontWeight = FontWeight.Medium,

                        fontSize = 15.sp
                    )
                }
            }

            Button(
                modifier = Modifier
                    .padding(start = 30.dp)
                    .offset(y = -10.dp)
                    .height(50.dp)
                    .width(150.dp),
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFEE101)),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Ver grupo de mentoria",
                    fontFamily = poppinsFontFamily,

                    fontWeight = FontWeight.Medium,

                    color = Color.Black,
                    fontSize = 12.sp
                )
            }
        }

        Row(
            modifier = Modifier
                .height(80.dp)
                .fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(210.dp)
            ) {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp)
                ) {
                    Text(
                        text = "Assunto no momento",
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppinsFontFamily,

                        fontSize = 20.sp
                    )
                    Text(
                        text = "Segunda Guerra Mundial",
                        fontFamily = poppinsFontFamily,
                        fontSize = 15.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InformacoesdoAlunoPreview() {
    InformacoesdoAluno()
}