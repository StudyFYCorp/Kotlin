package br.senai.sp.jandira.telainicio

import TelaMultiplaEscolha
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import br.senai.sp.jandira.telainicio.Screens.BarradeNavegacao
import br.senai.sp.jandira.telainicio.Screens.BlocoCadernoVirtual
import br.senai.sp.jandira.telainicio.Screens.CadernoVirtual
import br.senai.sp.jandira.telainicio.Screens.ChatAvaliacao
import br.senai.sp.jandira.telainicio.Screens.ChatConversa
import br.senai.sp.jandira.telainicio.Screens.Emblemas
import br.senai.sp.jandira.telainicio.Screens.MudarSenha
import br.senai.sp.jandira.telainicio.Screens.Notificacao
import br.senai.sp.jandira.telainicio.Screens.RankDesceu
import br.senai.sp.jandira.telainicio.Screens.RankFicou
import br.senai.sp.jandira.telainicio.Screens.RankSubiu
import br.senai.sp.jandira.telainicio.Screens.Suporte
import br.senai.sp.jandira.telainicio.Screens.SuporteProblema
import br.senai.sp.jandira.telainicio.ui.theme.TelaInicioTheme
import br.senai.sp.jandira.telainicio.Screens.TelaInicio
import br.senai.sp.jandira.telainicio.Screens.TelaInicio2
import br.senai.sp.jandira.telainicio.Screens.TelaCadastro1
import br.senai.sp.jandira.telainicio.Screens.TelaCadastroProf
import br.senai.sp.jandira.telainicio.Screens.TelaChatConversa
import br.senai.sp.jandira.telainicio.Screens.TelaChatIA
import br.senai.sp.jandira.telainicio.Screens.TelaEsqueciASenha
import br.senai.sp.jandira.telainicio.Screens.TelaGrupoMentoria
import br.senai.sp.jandira.telainicio.Screens.TelaLogin
import br.senai.sp.jandira.telainicio.Screens.TelaPerfil
import br.senai.sp.jandira.telainicio.Screens.TelaRankeamento
import br.senai.sp.jandira.telainicio.Screens.TelaTeste
import br.senai.sp.jandira.telainicio.Screens.TeladeAtividade
import br.senai.sp.jandira.telainicio.Screens.acompanhamentoProfessor
import br.senai.sp.jandira.telainicio.Screens.chatMentorPrev
import br.senai.sp.jandira.telainicio.Screens.telaChatCMentor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TelaInicioTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                // cadastroCat()
                val controleDeNavegacao = rememberNavController()

                NavHost(navController = controleDeNavegacao, startDestination = "inicio"){

                    composable(
                        route = "cadastro1/{tipoUsuario}",
                        arguments = listOf(navArgument("tipoUsuario") { type = NavType.StringType })
                    ) { backStackEntry ->
                        // Passando o backStackEntry para a TelaCadastro1
                        TelaCadastro1(controleDeNavegacao, backStackEntry)
                    }

                    composable(route = "barradenavegacao"){
                        BarradeNavegacao(controleDeNavegacao)
                    }

                    composable(route = "Emblemas"){
                        Emblemas(controleDeNavegacao)
                    }

                    composable(route = "MudarSenha"){
                        MudarSenha(controleDeNavegacao)
                    }

                    composable(route = "TelaAcompanhamentoDoAlunoProfessor"){
                        acompanhamentoProfessor(controleDeNavegacao)
                    }

                    composable(route = "TelaCadastro"){
                        TelaCadastro1(controleDeNavegacao)
                    }

                    composable(route = "TelaCadastroProf"){
                        TelaCadastroProf(controleDeNavegacao)
                    }

                    composable(route = "TelaCadernoVirtual"){
                        CadernoVirtual(controleDeNavegacao)
                    }
                    composable(route = "TelaCadernoVirtualBloco"){
                        BlocoCadernoVirtual(controleDeNavegacao)
                    }

                    //controleDeNavegacao: NavHostController?= null

                    composable(route = "TelaChatAvaliacao"){
                        ChatAvaliacao(controleDeNavegacao)
                    }

                    composable(route = "TelaChatConversa"){
                        ChatConversa(controleDeNavegacao)
                    }
                    composable(route = "TelaChatIaConversa"){
                        TelaChatConversa(controleDeNavegacao)
                    }

                    composable(route = "TelaChatIAPrev"){
                        TelaChatIA(controleDeNavegacao)
                    }

                    composable(route = "TelaCmentor"){
                        telaChatCMentor(controleDeNavegacao)
                    }

                    composable(route = "TelaCmentorPrev"){
                        chatMentorPrev(controleDeNavegacao)
                    }

                    composable(route = "TeladeAtividade"){
                        TeladeAtividade(controleDeNavegacao)
                    }

                    composable(route = "GrupoMentoria"){
                        TelaGrupoMentoria(controleDeNavegacao)
                    }

                    composable(route = "inicio"){
                        TelaInicio(controleDeNavegacao)
                    }

                    composable(route = "inicio2"){
                        TelaInicio2(controleDeNavegacao)
                    }

                    composable(route = "login"){
                        TelaLogin(controleDeNavegacao)
                    }

                    composable(route = "TelaMultiplaEscolha"){
                        TelaMultiplaEscolha(controleDeNavegacao)
                    }

                    composable(route = "TelaNotificacao"){
                        Notificacao(controleDeNavegacao)
                    }

                    composable(route = "perfil"){
                        TelaPerfil(controleDeNavegacao)
                    }

                    composable(route = "TelaRank"){
                        TelaRankeamento(controleDeNavegacao)
                    }

                    composable(route = "TelaRankAvisoDesceu"){
                        RankDesceu(controleDeNavegacao)
                    }

                    composable(route = "TelaRankAvisoFicou"){
                        RankFicou(controleDeNavegacao)
                    }

                    composable(route = "TelaRankAvisoSubiu"){
                        RankSubiu(controleDeNavegacao)
                    }

                    composable(route = "TelaSuporte"){
                        Suporte(controleDeNavegacao)
                    }

                    composable(route = "TelaSuporteII"){
                        SuporteProblema(controleDeNavegacao)
                    }

                    composable(route = "Teste"){
                        TelaTeste(controleDeNavegacao)
                    }
                }
            }
        }
    }
}