package br.senai.sp.jandira.telainicio.service

import CadernoVirtualResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

interface CadernoVirtualService {

    @GET("cadernoVirtual/{id}")
    fun getCadernoVirtualByIdAluno(@Path("id") id: Int): Call<CadernoVirtualResponse>

}
