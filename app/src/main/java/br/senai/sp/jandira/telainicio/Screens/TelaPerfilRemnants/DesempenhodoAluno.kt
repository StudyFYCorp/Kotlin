package br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.Screens.TelaPerfil
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun DesempenhodoAluno() {

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        Text(
            text = "Desempenho",
            fontFamily = poppinsFontFamily,

            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier
                .padding(top = 45.dp)
                .height(110.dp)
                .fillMaxWidth()
                .border(2.dp, Color(0xFFD9D9D9), RoundedCornerShape(8.dp))
                .background(Color.Transparent, shape = RoundedCornerShape(8.dp))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(55.dp)
                    .border(
                        2.dp,
                        Color(0xFFD9D9D9),
                        RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)
                    )

            ) {
                Box(
                    modifier = Modifier
                        .height(70.dp)
                        .width(190.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(top = 3.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .height(50.dp)
                                .width(50.dp)
                        ) {
                            Image(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 5.dp)
                                    .size(25.dp),
                                painter = painterResource(id = R.drawable.primeirolugar),
                                contentDescription = "Medalha de ouro do rank"
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(140.dp)
                                .height(60.dp)
                        ) {
                            Text(
                                modifier = Modifier
                                    .padding(top = 5.dp),
                                fontSize = 18.sp,
                                text = "Rank recorde"
                            )
                            Text(
                                text = "Ouro ||",
                                fontFamily = poppinsFontFamily
                            )
                        }

                    }

                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .fillMaxWidth()
                            .border(
                                width = 2.dp,
                                color = Color(0xFFD9D9D9),
                                shape = RoundedCornerShape(topEnd = 8.dp)
                            )
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(top = 3.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(50.dp)
                            ) {
                                Image(
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 5.dp)
                                        .size(25.dp),
                                    painter = painterResource(id = R.drawable.pontos),
                                    contentDescription = "Pontos do perfil"
                                )
                            }

                            Column(
                                modifier = Modifier
                                    .width(140.dp)
                                    .height(60.dp)
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(top = 5.dp),
                                    fontSize = 18.sp,
                                    text = "Pontos"
                                )
                                Text(
                                    text = "210",
                                    fontFamily = poppinsFontFamily
                                )
                            }

                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(192.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxHeight()
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(50.dp)
                            ) {
                                Image(
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 10.dp)
                                        .size(25.dp),
                                    painter = painterResource(id = R.drawable.calabreso2),
                                    contentDescription = "Sem parar"
                                )
                            }

                            Column(
                                modifier = Modifier
                                    .padding(top = 6.dp)
                                    .width(140.dp)
                                    .fillMaxHeight()
                            ) {
                                Text(
                                    fontSize = 16.sp,
                                    text = "Sem parar!"
                                )
                                Text(
                                    text = "14 dias",
                                    fontFamily = poppinsFontFamily
                                )
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .background(Color(0xFFD9D9D9))
                                    .width(2.dp)
                            )


                        }
                    }

                    Box(
                        modifier = Modifier
                            .height(100.dp)
                            .width(190.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(top = 6.dp)
                        ) {
                            Column(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(50.dp)
                            ) {
                                Image(
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 5.dp)
                                        .size(25.dp),
                                    painter = painterResource(id = R.drawable.anterior),
                                    contentDescription = "Atividades feitas"
                                )
                            }

                            Column(
                                modifier = Modifier
                                    .width(140.dp)
                                    .height(40.dp)
                            ) {
                                Text(
                                    fontSize = 16.sp,
                                    text = "Atividades feitas"
                                )
                                Text(
                                    text = "20",
                                    fontFamily = poppinsFontFamily
                                )
                            }

                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DesempenhodoAlunoPreview() {
    DesempenhodoAluno()
}
