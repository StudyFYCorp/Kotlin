package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun Notificacao(controledeNavegacao: NavHostController) {
    Column( modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Notificação",
            fontSize = 20.sp,
            fontFamily = poppinsFontFamily
        )

        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .height(190.dp)
                .width(330.dp)
                .shadow(8.dp, shape = RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .height(27.dp)
                    .width(330.dp)
                    .background(Color(0xFFFFFE944))
            ) {
                Text(
                    text = "Você subiu de rank!",
                    modifier = Modifier
                        .align(Alignment.BottomStart),
                    fontSize = 12.sp,
                    fontFamily = poppinsFontFamily
                )
            }
            Row () {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .height(200.dp)
                        .width(130.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            modifier = Modifier.height(40.dp),
                            text = "Você terminou a temporada com 420pts.",
                            fontFamily = poppinsFontFamily,
                            fontSize = 10.sp
                        )
                    }

                    Text(
                        text = "Terminou em #1 lugar",
                        fontFamily = poppinsFontFamily,
                        fontSize = 10.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "22/08/2024",
                        fontFamily = poppinsFontFamily,
                        fontSize = 8.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "icon",
                                modifier = Modifier.size(60.dp)
                            )
                            Text(text = "Bronze III")
                        }



                        Image(painter = painterResource(id = R.drawable.subiuderank),
                            contentDescription = "traço subiu de campo",
                            modifier = Modifier.size(20.dp).align(Alignment.CenterVertically))

                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "icon",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Text(text = "Bronze II")
                        }

                    }



                }


            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .height(190.dp)
                .width(330.dp)
                .shadow(8.dp, shape = RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .height(27.dp)
                    .width(330.dp)
                    .background(Color(0xFFFFFE944))
            ) {
                Text(
                    text = "Você subiu de rank!",
                    modifier = Modifier
                        .align(Alignment.BottomStart),
                    fontSize = 12.sp,
                    fontFamily = poppinsFontFamily
                )
            }
            Row () {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .fillMaxHeight()
                        .width(130.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            modifier = Modifier.height(40.dp),
                            text = "Você terminou a temporada com 420pts.",
                            fontFamily = poppinsFontFamily,
                            fontSize = 10.sp
                        )
                    }

                    Text(
                        text = "Terminou em #1 lugar",
                        fontFamily = poppinsFontFamily,
                        fontSize = 10.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "22/08/2024",
                        fontFamily = poppinsFontFamily,
                        fontSize = 8.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "icon",
                                modifier = Modifier.size(60.dp)
                            )
                            Text(text = "Bronze III")
                        }



                        Image(painter = painterResource(id = R.drawable.subiuderank),
                            contentDescription = "traço subiu de campo",
                            modifier = Modifier.size(20.dp).align(Alignment.CenterVertically))

                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "icon",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Text(text = "Bronze II")
                        }

                    }



                }


            }
        }

        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .height(190.dp)
                .width(330.dp)
                .shadow(8.dp, shape = RoundedCornerShape(8.dp))
                .clip(RoundedCornerShape(8.dp))
                .background(Color.White)
        ) {
            Box(
                modifier = Modifier
                    .height(27.dp)
                    .width(330.dp)
                    .background(Color(0xFFFFFE944))
            ) {
                Text(
                    text = "Você subiu de rank!",
                    modifier = Modifier
                        .align(Alignment.BottomStart),
                    fontSize = 12.sp,
                    fontFamily = poppinsFontFamily
                )
            }
            Row () {
                Column(
                    modifier = Modifier
                        .padding(start = 10.dp, end = 10.dp)
                        .fillMaxHeight()
                        .width(130.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .width(150.dp)
                            .height(60.dp)
                    ) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            modifier = Modifier.height(40.dp),
                            text = "Você terminou a temporada com 420pts.",
                            fontFamily = poppinsFontFamily,
                            fontSize = 10.sp
                        )
                    }

                    Text(
                        text = "Terminou em #1 lugar",
                        fontFamily = poppinsFontFamily,
                        fontSize = 10.sp
                    )
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "22/08/2024",
                        fontFamily = poppinsFontFamily,
                        fontSize = 8.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "icon",
                                modifier = Modifier.size(60.dp)
                            )
                            Text(text = "Bronze III")
                        }



                        Image(painter = painterResource(id = R.drawable.subiuderank),
                            contentDescription = "traço subiu de campo",
                            modifier = Modifier.size(20.dp).align(Alignment.CenterVertically))

                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "icon",
                                modifier = Modifier
                                    .size(60.dp)
                            )
                            Text(text = "Bronze II")
                        }
                    }

                }

            }
        }
    }
    BarradeNavegacao(controledeNavegacao)
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun NotificacaoPreview() {
    Notificacao(controledeNavegacao = NavHostController(LocalContext.current))
}