package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable


fun TelaChatIA(controledeNavegacao: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .height(60.dp)
                .background(color = Color.White)
                .fillMaxWidth()
        ) {
            Text(
                "ChatIA",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 20.dp),
                fontSize = 20.sp,
                color = Color.Black
            )
        }
        Column(
            modifier = Modifier
                .background(Color.White)
                .height(570.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(300.dp).padding(top = 150.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "Calabreso"
            )
            Text(
                "Converse com nosso\n" +
                        "mascote para " +
                        "tirar dúvidas superficiais", modifier = Modifier
                    .padding(start = 80.dp),
                color = Color.Black,
                fontSize = 20.sp,
                fontFamily = poppinsFontFamily
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(80.dp)
                .background(Color.White)
                .padding(horizontal = 25.dp)
        ) {
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "entrar",
                            tint = Color.Black
                        )
                    }
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Gray,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color(0xFF666260),
                ),
                placeholder = {
                    Text(
                        text = "Escreva uma mensagem",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            )
        }
            }
    BarradeNavegacao(controledeNavegacao)
        }



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaChatIAPreview() {
 TelaChatIA(rememberNavController())
}
