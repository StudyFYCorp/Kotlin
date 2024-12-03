package br.senai.sp.jandira.telainicio.Screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telainicio.R
import kotlin.math.log

@Composable
fun BarradeNavegacao(controleDeNavegacao: NavHostController) {

    var isBoxVisible by remember{ mutableStateOf(false)}

    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.weight(1f))

        Column(
            modifier = Modifier
                .align(Alignment.End)
                .height(170.dp)
                .width(70.dp)

        ) {
            if (isBoxVisible) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp)
                        .background(Color.White)
                ) {
                    Divider(
                        thickness = 2.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.TopCenter)
                    )

                    Divider(
                        thickness = 2.dp,
                        modifier = Modifier
                            .fillMaxHeight()
                            .width(2.dp)
                            .align(Alignment.CenterStart)
                    )

                    Column {
                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(35.dp)
                                    .clickable {
                                        controleDeNavegacao.navigate("GrupoMentoria")
                                    },
                                painter = painterResource(id = R.drawable.grupodementoria),
                                contentDescription = "Mentoria"
                            )
                        }

                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(35.dp)
                                    .clickable {
                                        controleDeNavegacao.navigate("TelaChatIAPrev")
                                    },
                                painter = painterResource(id = R.drawable.chatia),
                                contentDescription = "Chat IA"
                            )
                        }

                        Box(
                            modifier = Modifier
                                .height(60.dp)
                                .fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                modifier = Modifier
                                    .size(35.dp)
                                    .clickable {
                                        controleDeNavegacao.navigate("TelaChatConversa")
                                    },
                                painter = painterResource(id = R.drawable.chat),
                                contentDescription = "Chat"
                            )
                        }
                    }
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .height(60.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Divider(
                color = Color(0xFFD9D9D9),
                thickness = 3.dp,
                modifier = Modifier.fillMaxWidth()
            )
            Row (){
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(65.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                controleDeNavegacao.navigate("TeladeAtividade")
                            },
                        painter = painterResource(id = R.drawable.livros),
                        contentDescription = "Livros"
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(65.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                controleDeNavegacao.navigate("TelaCadernoVirtualBloco")
                            },
                        painter = painterResource(id = R.drawable.caderno),
                        contentDescription = "Caderno virtual"
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(65.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                controleDeNavegacao.navigate("Emblemas")
                            },
                        painter = painterResource(id = R.drawable.trofeu),
                        contentDescription = "Troféu"
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(65.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                controleDeNavegacao.navigate("TelaSuporte")
                            },
                        painter = painterResource(id = R.drawable.duvida),
                        contentDescription = "Ajuda"
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(65.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(35.dp)
                            .clickable {
                                controleDeNavegacao.navigate("TelaNotificacao")
                            },
                        painter = painterResource(id = R.drawable.sinos),
                        contentDescription = "Notificação"
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(60.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(30.dp)
                            .clickable {
                                // Altera o estado para ocultar/exibir a Box
                                isBoxVisible = !isBoxVisible
                            },
                        painter = painterResource(id = R.drawable.trespontosconfig),
                        contentDescription = "Mais opções"
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(7.dp))
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BarradeNavegacaoPreview() {
    BarradeNavegacao (controleDeNavegacao = NavHostController(LocalContext.current))
}