package br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
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
import androidx.compose.ui.zIndex
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.Screens.TelaPerfil
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily


@Composable
fun NomeFoto(){

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .padding(top = 45.dp)
                .background(
                    color = Color(0xFFFEE101),
                    shape = RoundedCornerShape(8.dp)
                )
                .height(190.dp)
                .width(360.dp)
        ) {
            Image(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .offset(y = -40.dp)
                    .zIndex(1f)
                    .size(140.dp),
                painter = painterResource(id = R.drawable.usuario),
                contentDescription = "Foto de Perfil"
            )

            Column(
                modifier = Modifier
                    .offset(y = -30.dp)
                    .fillMaxWidth()
                    .height(250.dp)
            ) {
                Row(
                    modifier = Modifier
                        .height(35.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Silvia Santos",
                        fontFamily = poppinsFontFamily,

                        fontWeight = FontWeight.Medium,

                        fontSize = 30.sp,
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Entrou em 2021",
                        fontFamily = poppinsFontFamily,

                        fontWeight = FontWeight.Medium,

                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NomeFotoPreview() {
    NomeFoto()
}
