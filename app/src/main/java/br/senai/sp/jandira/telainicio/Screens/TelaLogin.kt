package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {
    // Estado para os campos de email e senha
    val email = remember { mutableStateOf("") }
    val senha = remember { mutableStateOf("") }

    // Estado para mensagem de erro
    val mensagemErro = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFFEE101))
    ) {
        Box(
            modifier = Modifier
                .padding(top = 35.dp)
                .align(Alignment.CenterHorizontally)
                .height(200.dp)
                .width(100.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(140.dp)
                    .height(150.dp)
                    .width(150.dp),
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "Mascote"
            )
            Text(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color(0xFF302F2F),
                text = "Login",
                modifier = Modifier
                    .offset(x = 10.dp, y = 130.dp)
            )
        }
        Box(
            modifier = Modifier
                .offset(x = 0.dp, y = 280.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(0xFFEEEEEE))
                .align(Alignment.CenterHorizontally)
        )
    }
    Box(
        modifier = Modifier
            .offset(x = 30.dp, y = 250.dp)
            .background(Color.White)
            .height(500.dp)
            .width(350.dp)
            .zIndex(1f)
    ) {
        Column(
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp)
                .height(430.dp)
                .width(310.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                text = "Por favor, faça login para continuar"
            )

            // Campo de email
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email",
                            tint = Color(0xFFFEE101)
                        )
                    }
                },
                value = email.value,
                onValueChange = { email.value = it },
                modifier = Modifier
                    .padding(top = 30.dp)
                    .width(350.dp),
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedBorderColor = Color(0xFFE9CE03),
                    unfocusedBorderColor = Color(0xFFE9CE03)
                ),
                label = { Text(text = "E-mail", color = Color.Black) }
            )

            // Campo de senha
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Senha",
                            tint = Color(0xFFFEE101)
                        )
                    }
                },
                value = senha.value,
                onValueChange = { senha.value = it },
                modifier = Modifier
                    .width(350.dp),
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedBorderColor = Color(0xFFE9CE03),
                    unfocusedBorderColor = Color(0xFFE9CE03)
                ),
                label = { Text(text = "Senha", color = Color.Black) }
            )

            // Exibe mensagem de erro, se existir
            if (mensagemErro.value.isNotEmpty()) {
                Text(
                    text = mensagemErro.value,
                    color = Color.Red,
                    modifier = Modifier.padding(top = 10.dp)
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            // Botão de login
            Button(
                onClick = {
                    if (email.value == "study@gmail.com" && senha.value == "studyfy") {
                        // Limpa mensagem de erro
                        mensagemErro.value = ""
                        // Navega para a próxima tela
                        controleDeNavegacao.navigate("TeladeAtividade")
                    } else {
                        // Exibe mensagem de erro
                        mensagemErro.value = "E-mail ou senha incorretos. Tente novamente."
                    }
                },
                modifier = Modifier
                    .width(150.dp)
                    .height(35.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFEE101))
            ) {
                Text(
                    text = "Logar",
                    color = Color.Black,
                    letterSpacing = 1.sp
                )
                Icon(
                    modifier = Modifier.padding(start = 20.dp),
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "",
                    tint = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Text(
                    fontSize = 15.sp,
                    text = "Não tem uma conta?"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    modifier = Modifier
                        .clickable { controleDeNavegacao.navigate("inicio2") },
                    color = Color(0xFFFEE101),
                    fontSize = 15.sp,
                    text = "Cadastre-se"
                )
            }
        }
    }
}





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    TelaLogin(rememberNavController())
}
