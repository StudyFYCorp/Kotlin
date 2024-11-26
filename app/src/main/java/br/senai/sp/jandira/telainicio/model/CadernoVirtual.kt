data class CadernoVirtualResponse(
    val status_code: Int,
    val message: String,
    val data: List<CadernoVirtual>
)

data class CadernoVirtual(
    val id: Int,
    val conteudo: String?,
    val data_criacao: String?
)
