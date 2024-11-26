package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun Emblemas() {
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxHeight()
                .width(340.dp)
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 10.dp),
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                fontFamily = poppinsFontFamily,
                text = "Emblemas"
            )

            Spacer(modifier = Modifier.height(46.dp))

            Text(
                modifier = Modifier.padding(start = 10.dp),
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppinsFontFamily,
                text = "Emblemas de aluno"
            )

            Spacer(modifier = Modifier.height(26.dp))

            Column(modifier = Modifier.fillMaxWidth()) {

                //Card de emblema

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    Row {
                        Box(
                            modifier = Modifier
                                .width(120.dp)
                                .height(120.dp)
                                .background(color = Color(0xFF71DDF5), shape = RoundedCornerShape(20.dp))
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .size(80.dp)
                                    .align(Alignment.TopCenter),
                                painter = painterResource(id = R.drawable.primeirolugar),
                                contentDescription = "Medalha"
                            )
                            Text(
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(30.dp),
                                fontWeight = FontWeight.Bold,
                                fontFamily = poppinsFontFamily,
                                text = "Nível 1"
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(200.dp)
                                .padding(start = 20.dp)
                                .fillMaxHeight()
                        ) {

                            Column (
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(200.dp)) {
                                Text(
                                    modifier = Modifier.padding(top = 10.dp),
                                    fontSize = 20.sp,
                                    fontFamily = poppinsFontFamily,
                                    text = "Engatinhando"
                                )
                                Text(
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFontFamily,
                                    text = "Realizou a primeira atividade da aplicação"
                                )


                            }




                            Box(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 20.dp)
                                    .height(15.dp)
                                    .width(200.dp)
                                    .background(color = Color(0xFFFEE101), shape = RoundedCornerShape(20.dp))
                            )
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    Row {
                        Box(
                            modifier = Modifier
                                .width(120.dp)
                                .height(120.dp)
                                .background(color = Color(0xFF71DDF5), shape = RoundedCornerShape(20.dp))
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .size(80.dp)
                                    .align(Alignment.TopCenter),
                                painter = painterResource(id = R.drawable.livros),
                                contentDescription = "Livros Emblema"
                            )
                            Text(
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(30.dp),
                                fontWeight = FontWeight.Bold,
                                fontFamily = poppinsFontFamily,
                                text = "Nível 1"
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(200.dp)
                                .padding(start = 20.dp)
                                .fillMaxHeight()
                        ) {

                            Column (
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(200.dp)) {
                                Text(
                                    modifier = Modifier.padding(top = 10.dp),
                                    fontSize = 20.sp,
                                    fontFamily = poppinsFontFamily,
                                    text = "Subindo degraus"
                                )
                                Text(
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFontFamily,
                                    text = "Realizou xxx atividades"
                                )


                            }




                            Box(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 20.dp)
                                    .height(15.dp)
                                    .width(200.dp)
                                    .background(color = Color(0xFFFEE101), shape = RoundedCornerShape(20.dp))
                            )
                        }
                    }
                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    Row {

                        //Box COMENTADA 1
                        Box(
                            modifier = Modifier
                                .alpha(0.5f) // Ajuste a opacidade aqui
                                .width(120.dp)
                                .height(120.dp)
                                .background(color = Color(0xFFFEE101), shape = RoundedCornerShape(20.dp))

                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .size(80.dp)
                                    .align(Alignment.TopCenter),
                                painter = painterResource(id = R.drawable.calabreso2),
                                contentDescription = "Penguim"
                            )
                            Text(
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(30.dp),
                                fontWeight = FontWeight.Bold,
                                fontFamily = poppinsFontFamily,
                                text = "Nível 1"
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(200.dp)
                                .padding(start = 20.dp)
                                .fillMaxHeight()
                        ) {

                            Column (
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(200.dp)) {
                                Text(
                                    modifier = Modifier.padding(top = 10.dp),
                                    fontSize = 20.sp,
                                    fontFamily = poppinsFontFamily,
                                    text = "Estudioso"
                                )
                                Text(
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    text = "Acabou uma matéria"
                                )


                            }

                            Box(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 20.dp)
                                    .height(15.dp)
                                    .width(200.dp)
                                    .background(color = Color(0xFFFEE101), shape = RoundedCornerShape(20.dp))
                            )
                        }
                    }
                }



                //Linha preta

                Box(modifier = Modifier.background(Color.Black).height(1.dp).fillMaxWidth())

                Spacer(modifier = Modifier.height(26.dp))


                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    fontSize = 26.sp,
                    fontFamily = poppinsFontFamily,
                    fontWeight = FontWeight.Medium,
                    text = "Emblemas de mentor"
                )

                Spacer(modifier = Modifier.height(15.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(140.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)
                ) {
                    Row {
                        Box(
                            modifier = Modifier
                                .width(120.dp)
                                .height(120.dp)
                                .background(color = Color(0xFF71DDF5), shape = RoundedCornerShape(20.dp))
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .size(80.dp)
                                    .align(Alignment.TopCenter),
                                painter = painterResource(id = R.drawable.bronzei),
                                contentDescription = "Medalha"
                            )
                            Text(
                                fontSize = 16.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomCenter)
                                    .height(30.dp),
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Medium,
                                text = "Nível 1"
                            )
                        }

                        Column(
                            modifier = Modifier
                                .width(200.dp)
                                .padding(start = 20.dp)
                                .fillMaxHeight()
                        ) {

                            Column (
                                modifier = Modifier
                                    .height(70.dp)
                                    .width(200.dp)) {
                                Text(
                                    modifier = Modifier.padding(top = 10.dp),
                                    fontSize = 20.sp,
                                    fontFamily = poppinsFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    text = "Engatinhando"
                                )
                                Text(
                                    fontSize = 12.sp,
                                    fontFamily = poppinsFontFamily,
                                    fontWeight = FontWeight.Medium,
                                    text = "Realizou a primeira atividade da aplicação"
                                )


                            }




                            Box(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 20.dp)
                                    .height(15.dp)
                                    .width(200.dp)
                                    .background(color = Color(0xFFFEE101), shape = RoundedCornerShape(20.dp))
                            )
                        }
                    }
                }


            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EmblemasPreview() {
    Emblemas()
}
