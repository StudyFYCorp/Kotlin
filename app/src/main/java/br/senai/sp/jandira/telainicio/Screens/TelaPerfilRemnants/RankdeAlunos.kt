package br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily


@Composable
fun RankdeAlunos(){


    Box (
        modifier = Modifier
            .height(280.dp)
            .width(350.dp),
    ) {
        Row (modifier = Modifier
            .fillMaxWidth()
        ) {
            Text(text = "Rank - Alunos",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp)
        }
        Row (modifier = Modifier
            .padding(top = 45.dp)
            .fillMaxWidth()
            .fillMaxHeight()
        ) {

            Column (modifier = Modifier
                .fillMaxHeight()
                .width(120.dp)
            ) {
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(100.dp),
                    painter = painterResource(id = R.drawable.rank),
                    contentDescription = "Medalha de bronze"
                )

                Text(modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                    text = "Bronze ||",
                    fontFamily = poppinsFontFamily,

                    fontSize = 20.sp,
                    color = Color(0xffA96224),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(modifier = Modifier.width(20.dp))
            Column (modifier = Modifier
                .height(165.dp)
                .width(200.dp)

            ) {
                Box(
                    modifier = Modifier
                        .height(165.dp)
                        .width(200.dp)
                        .border(2.dp, Color(0xFFD9D9D9))
                ) {
                    Column {
                        Row(
                            modifier = Modifier
                                .height(55.dp)
                                .width(800.dp)
                        ) {

                            Column {
                                Row(
                                    modifier = Modifier
                                        .height(55.dp)
                                        .fillMaxWidth()
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .height(55.dp)
                                            .width(35.dp)
                                    ) {

                                        //POSICAO VINDO DO BANCO
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.Center),
                                            text = "#9",
                                            fontWeight = FontWeight.Bold,
                                            fontSize = 18.sp
                                        )
                                    }


                                    //FOTO VINDO DO BANCO
                                    Image(
                                        modifier = Modifier
                                            .padding(top = 5.dp)
                                            .size(45.dp),
                                        painter = painterResource(id = R.drawable.prataii),
                                        contentDescription = "Foto de Perfil1"
                                    )

                                    Column (modifier = Modifier
                                        .fillMaxHeight()
                                        .width(80.dp)
                                    ) {
                                        //NOME VINDO DO BANCO
                                        Text(
                                            modifier = Modifier.padding(top = 20.dp),
                                            text = "grande eweww...",
                                            fontSize = 10.sp
                                        )

                                    }


                                    //PONTOS VINDO DO BANCO
                                    Text(
                                        modifier = Modifier
                                            .padding(top = 20.dp)
                                            .height(12.dp)
                                            .width(37.dp),
                                        text = "271PTS",
                                        fontSize = 10.sp
                                    )
                                }

                            }


                        }
                        Row(
                            modifier = Modifier
                                .height(55.dp)
                                .width(800.dp)
                                .background(Color(0xFFD9D9D9))
                        ) {
                            Row(
                                modifier = Modifier
                                    .height(55.dp)
                                    .fillMaxWidth()
                            ) {
                                Box(
                                    modifier = Modifier
                                        .height(60.dp)
                                        .width(35.dp)
                                ) {

                                    //POSICAO VINDO DO BANCO
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Center),
                                        text = "#10",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp
                                    )
                                }


                                //FOTO VINDO DO BANCO
                                Image(
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                        .size(45.dp),
                                    painter = painterResource(id = R.drawable.usuario),
                                    contentDescription = "Foto de Perfil"
                                )


                                Column (modifier = Modifier
                                    .fillMaxHeight()
                                    .width(80.dp)
                                ) {
                                    //NOME VINDO DO BANCO
                                    Text(
                                        modifier = Modifier.padding(top = 20.dp),
                                        text = "Silvia Santos",
                                        fontSize = 10.sp
                                    )

                                }



                                //PONTOS VINDO DO BANCO
                                Text(
                                    modifier = Modifier
                                        .padding(top = 20.dp)
                                        .height(12.dp)
                                        .width(37.dp),
                                    text = "219PTS",
                                    fontSize = 10.sp
                                )
                            }


                        }
                        Row(
                            modifier = Modifier
                                .height(55.dp)
                                .width(800.dp)
                        ) {
                            Row(
                                modifier = Modifier
                                    .height(55.dp)
                                    .fillMaxWidth()
                            ) {
                                Box(
                                    modifier = Modifier
                                        .height(55.dp)
                                        .width(35.dp)
                                ) {

                                    //POSICAO VINDO DO BANCO
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Center),
                                        text = "#11",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 18.sp
                                    )
                                }


                                //FOTO VINDO DO BANCO
                                Image(
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                        .size(45.dp),
                                    painter = painterResource(id = R.drawable.anteriorduplo),
                                    contentDescription = "Foto de Perfil"
                                )


                                Column(modifier = Modifier
                                    .fillMaxHeight()
                                    .width(80.dp)
                                ) {
                                    //NOME VINDO DO BANCO
                                    Text(
                                        modifier = Modifier.padding(top = 20.dp),
                                        text = "Tom Holland",
                                        fontSize = 10.sp
                                    )
                                }



                                //PONTOS VINDO DO BANCO
                                Text(
                                    modifier = Modifier
                                        .padding(top = 20.dp)
                                        .height(12.dp)
                                        .width(37.dp),
                                    text = "189PTS",
                                    fontSize = 10.sp
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
fun RankdeAlunosPreview() {
    RankdeAlunos()
}