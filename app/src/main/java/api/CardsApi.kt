package api

import com.clovertech.autolibdz.DataClass.paymentInfo
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface CardsApi {
    @GET("all")
    suspend fun getAllCards(): Response<MutableList<paymentInfo>>

    companion object{
        operator fun invoke(): CardsApi {
            return Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://54.37.87.85:7000/payment/cards/")
                    .build()
                    .create(CardsApi::class.java)

        }
    }
}