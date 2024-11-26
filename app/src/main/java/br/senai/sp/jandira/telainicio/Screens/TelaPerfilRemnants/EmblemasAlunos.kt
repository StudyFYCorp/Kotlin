package br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
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
fun EmblemasAlunos(){

//    val scrollState = rememberScrollState()
        val scrollState = rememberScrollState()


    Column (
        modifier = Modifier
            .height(180.dp)
            .width(350.dp),
    ) {
        Column(modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
        ) {
            Text(text = "Emblemas",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 30.sp)

            Text(text = "Ver todos",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 30.sp)

            Text(text = "Ver todos",
                fontWeight = FontWeight.Light,
                fontFamily = poppinsFontFamily,
                fontSize = 23.sp)
        }

        //ADICIONAR UMA BARRA DE ROLAGEM

        Row (modifier = Modifier
            .height(110.dp)
            .horizontalScroll(scrollState)
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                    Box(
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .background(color = Color(0xFF71DDF5), shape = RoundedCornerShape(20.dp))
                    ) {
                        Image(
                            modifier = Modifier
                                .padding(top = 10.dp)
                                .size(60.dp)
                                .align(Alignment.TopCenter),
                            painter = painterResource(id = R.drawable.primeirolugar),
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
            }
            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .width(120.dp)
                        .height(120.dp)
                        .background(color = Color(0xFF56EE9C), shape = RoundedCornerShape(20.dp))
                ) {
                    Image(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .size(60.dp)
                            .align(Alignment.TopCenter),
                        painter = painterResource(id = R.drawable.livros),
                        contentDescription = "Livros"
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
            }
            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(140.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .alpha(0.5f)
                        .width(100.dp)
                        .height(100.dp)
                        .background(color = Color(0xFFFEE101), shape = RoundedCornerShape(20.dp))
                ) {
                    Image(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .size(60.dp)
                            .align(Alignment.TopCenter),
                        painter = painterResource(id = R.drawable.calabreso2),
                        contentDescription = "Pinguim mascote"
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
            }

            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .width(100.dp)
                    .height(100.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {
                Box(
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                        .background(color = Color(0xFF71DDF5), shape = RoundedCornerShape(20.dp))
                ) {
                    Image(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .size(60.dp)
                            .align(Alignment.TopCenter),
                        painter = painterResource(id = R.drawable.primeirolugar),
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
            }


        }


        }
    }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun EmblemasAlunosPreview() {
    EmblemasAlunos()
}
