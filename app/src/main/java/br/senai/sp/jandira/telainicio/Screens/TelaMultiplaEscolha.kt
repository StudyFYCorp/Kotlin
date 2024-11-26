import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun TelaMultiplaEscolha() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally // Centraliza no eixo horizontal
    ) {
        Spacer(modifier = Modifier.height(60.dp))

        // Pergunta (Usando Card com borda amarela e sombra colorida)
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
                .padding(8.dp) // Padding interno para o texto
                .background(Color(0xFF42A5F5).copy(alpha = 0.2f), shape = RoundedCornerShape(8.dp)) // Simula sombra azul
                .shadow(4.dp, shape = RoundedCornerShape(8.dp)) // Sombra normal
        ) {
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .border(2.dp, Color(0xFFFFD600), RoundedCornerShape(8.dp)), // Borda amarela
                shape = RoundedCornerShape(8.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Box(
                    contentAlignment = Alignment.Center, // Centraliza o texto
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(
                        text = "Qual é a capital do Brasil?",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black,
                        modifier = Modifier.padding(8.dp) // Padding ao redor do texto
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(36.dp))

        // Subtítulo
        Text(
            text = "↔ Múltipla escolha",
            fontSize = 18.sp,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(horizontal = 4.dp)
        )

        Spacer(modifier = Modifier.height(46.dp))

        // Opções de resposta com fundo branco, borda preta e bordas arredondadas
        val options = listOf("Rio de Janeiro", "São Paulo", "Brasília", "Salvador", "Recife")

        options.forEach { option ->
            Button(
                onClick = { /* Ação ao selecionar */ },
                shape = RoundedCornerShape(16.dp), // Aumentando o arredondamento
                colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp) // Aumentando o espaço entre as alternativas
                    .border(1.dp, Color.Black, RoundedCornerShape(26.dp)) // Bordas mais arredondadas
            ) {
                Text(
                    text = option,
                    fontSize = 16.sp,
                    color = Color.Black,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        // Botão Responder
        Button(
            onClick = { /* Ação do botão */ },
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFEB3B)),
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
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun PreviewTelaMultiplaEscolha() {
    TelaMultiplaEscolha()
}
