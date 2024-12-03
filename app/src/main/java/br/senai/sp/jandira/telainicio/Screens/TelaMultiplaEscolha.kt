import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.Screens.BarradeNavegacao
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun TelaMultiplaEscolha(controledeNavegacao: NavHostController) {
// Estados para rastrear a opção selecionada e o feedback visual
    var selectedOption by remember { mutableStateOf<String?>(null) }
    var feedbackColor by remember { mutableStateOf(Color.Transparent) }
    var feedbackMessage by remember { mutableStateOf("") }
    var showFeedback by remember { mutableStateOf(false) }
    val correctAnswer = "Brasília"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
// Barra superior
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFFD600))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Ação para sair */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.bronzei),
                    contentDescription = "Sair",
                    tint = Color.White,
                    modifier = Modifier.size(34.dp)
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Icon(
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "Imagem exemplo",
                modifier = Modifier.size(54.dp),
                tint = Color.Unspecified
            )
        }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = Alignment.TopCenter
        ) {
// Corpo da tela
            Column(horizontalAlignment = Alignment.CenterHorizontally) {


// Pergunta
                Box(
                    modifier = Modifier
                        .width(300.dp)
                        .height(100.dp)
                        .padding(8.dp)
                        .background(Color.Transparent, shape =
                        RoundedCornerShape(8.dp))
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxSize()
                            .border(
                                2.dp,
                                Color(0xFFFFD600),
                                RoundedCornerShape(8.dp)
                            ),
                        shape = RoundedCornerShape(8.dp),
                        colors =
                        CardDefaults.cardColors(containerColor = Color.White)
                    ) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxSize()
                        ) {
                            Text(
                                text = "Qual é a capital do Brasil?",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black,
                                modifier = Modifier.padding(8.dp)
                            )
                        }
                    }
                }


// Título "Múltipla escolha"
                Text(
                    text = "↔ Múltipla escolha",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(16.dp))

// Opções de resposta
                val options = listOf("Rio de Janeiro", "São Paulo",
                    "Brasília", "Salvador", "Recife")
                options.forEach { option ->
                    Button(
                        onClick = { selectedOption = option },
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (selectedOption ==
                                option) Color(0xFFFFEB3B) else Color.White
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .border(1.dp, Color.Black,
                                RoundedCornerShape(26.dp))
                    ) {
                        Text(
                            text = option,
                            fontSize = 16.sp,
                            color = Color.Black,
                            modifier = Modifier.padding(vertical = 8.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(5.dp))

         // Botão "Responder"
                Button(
                    onClick = {
                      // Define o feedback com base na resposta
                        showFeedback = true
                        if (selectedOption == correctAnswer) {
                            feedbackColor = Color(0xFF0B7513) // Verde
                            feedbackMessage = " PARABÉNS, \nVOCÊ ACERTOU!"
                        } else {
                            feedbackColor = Color(0xFFB71C1C) // Vermelho
                            feedbackMessage = " QUE PENA, \n VOCÊ ERROU!"
                        }


                    },
                    shape = RoundedCornerShape(50),
                    colors =
                    ButtonDefaults.buttonColors(containerColor = Color(0xFFFFEB3B)),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp)
                ) {
                    Text(
                        text = "Responder",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.padding(vertical = 8.dp)
                    )
                }
            }

// Feedback visual
            if (showFeedback) {
                Box(
                    modifier = Modifier
                        .width(250.dp)
                        .height(250.dp)
                        .align(Alignment.Center)
                        .background(feedbackColor.copy(alpha = 0.7f),
                            shape = RoundedCornerShape(8.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Image(
                            painter = painterResource(
                                id = if (feedbackColor ==
                                    Color(0xFF0B7513)) R.drawable.calabresofeliz else
                                    R.drawable.calabresobravo
                            ),
                            contentDescription = "Feedback Imagem",
                            modifier = Modifier.size(80.dp)
                        )
                        Text(
                            text = feedbackMessage,
                            fontSize = 20.sp,
                            fontFamily = poppinsFontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
    BarradeNavegacao(rememberNavController())
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewTelaMultiplaEscolha() {
    TelaMultiplaEscolha(rememberNavController())
}


//Text(
//text = it,
//color = if (it == "Você acertou!") Color.Green else Color.Red,
//fontSize = 18.sp,
//fontWeight = FontWeight.Bold,
//modifier = Modifier.align(Alignment.CenterHorizontally)
//)