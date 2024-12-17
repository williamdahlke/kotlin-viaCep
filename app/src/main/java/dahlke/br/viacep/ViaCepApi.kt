package dahlke.br.viacep

import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCepApi {
    @GET("ws/{cep}/json/")
    suspend fun getAdrress(@Path("cep") cep: String) : Address
}