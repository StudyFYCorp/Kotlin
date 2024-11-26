package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants.DesempenhodoAluno
import br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants.EmblemasAlunos
import br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants.InformacoesdoAluno
import br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants.NomeFoto
import br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants.RankdeAlunoMentor
import br.senai.sp.jandira.telainicio.Screens.TelaPerfilRemnants.RankdeAlunos
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun TelaPerfil() {

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 10.dp, end = 10.dp)
            .verticalScroll(scrollState)


    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(modifier = Modifier.width(90.dp)) {}

            Text(
                modifier = Modifier
                    .padding(top = 10.dp),
                text = "Perfil",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp
            )
            Row(
                modifier = Modifier
                    .width(80.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    modifier = Modifier
                        .padding(10.dp)
                        .size(32.dp),
                    imageVector = Icons.Default.Settings,
                    contentDescription = "Configuração",
                    tint = Color.Black
                )
            }
        }

            NomeFoto()


            InformacoesdoAluno()


            Spacer(modifier = Modifier.height(40.dp))


            DesempenhodoAluno()


            Spacer(modifier = Modifier.height(60.dp))


            RankdeAlunos()


            RankdeAlunoMentor()


            EmblemasAlunos()


    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaPerfilPreview() {
        TelaPerfil()
}
