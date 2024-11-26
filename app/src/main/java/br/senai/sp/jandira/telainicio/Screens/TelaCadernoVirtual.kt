package br.senai.sp.jandira.telainicio.Screens

import CadernoVirtualResponse
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.rickandmorty.service.RetrofitFactory
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.model.Materia
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CadernoVirtual(modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") }

    val idAluno = 1 // ID do aluno ou caderno virtual que você deseja buscar
    val chamarNotas = RetrofitFactory()
        .getCadernoVirtualAluno().getCadernoVirtualByIdAluno(idAluno)

    chamarNotas.enqueue(object : Callback<CadernoVirtualResponse> {
        override fun onResponse(call: Call<CadernoVirtualResponse>, response: Response<CadernoVirtualResponse>) {
            if (response.isSuccessful) {
                val cadernoResponse = response.body()
                val cadernos = cadernoResponse?.data // Aqui você acessa a lista de cadernos
                Log.d("CadernoVirtual", "Cadernos: $cadernos")
            } else {
                Log.d("CadernoVirtual", "Erro na resposta")
            }
        }

        override fun onFailure(call: Call<CadernoVirtualResponse>, t: Throwable) {
            Log.d("CadernoVirtual", "Falha na requisição: ${t.message}")
        }
    })



    Column {
            Box(modifier = Modifier
                .background(Color(0xFFFE9CE03))
                .height(80.dp)
                . width(400.dp)){
                Row ( verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxHeight()){
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        modifier = Modifier
                            .height(40.dp)
                            .width(40.dp)
                    )
                    Text(text = "Titulo",
                        fontSize = 30.sp
                        )
                }
            }

        Box(modifier = Modifier
            .background(Color(0xFFFD9D9D9))
            .height(60.dp)
            .width(400.dp)
        ){
            Row(modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 5.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                 Image(painter = painterResource(id = R.drawable.estilotexto),
                        contentDescription = "",
                        modifier = Modifier
                            .height(50.dp)
                            .width(50.dp)
                        )
                Image(painter = painterResource(id = R.drawable.negrito),
                    contentDescription = "",
                    modifier = Modifier
                        .height(20.dp)
                        .width(20.dp)
                )
                Image(painter = painterResource(id = R.drawable.corsubliado),
                    contentDescription = "",
                    modifier = Modifier
                        .height(40.dp)
                        .width(45.dp)
                )
                Image(painter = painterResource(id = R.drawable.subliado),
                    contentDescription = "",
                    modifier = Modifier
                        .height(30.dp)
                        .width(30.dp)
                )
            }
        }

        Box(
            modifier = Modifier
                .fillMaxSize()

        ){
            OutlinedTextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("Escreva suas notas...") },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = Color.Transparent
                )
            )

        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CadernoVirtualPreview() {
    CadernoVirtual()
}