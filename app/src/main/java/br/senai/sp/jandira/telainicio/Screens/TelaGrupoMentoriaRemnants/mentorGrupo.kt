package br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoriaRemnants

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun mentorGrupo(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .align(alignment = Alignment.Start)
                .padding(top = 30.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconementoria),
                contentDescription = "Mentor Image",
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                "Mentor do grupo",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                fontFamily = poppinsFontFamily,
            )

        }
    }
}

@Preview
@Composable
fun mentorGrupoPreview() {
    mentorGrupo()
}