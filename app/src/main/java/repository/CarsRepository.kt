package repository

import com.clovertech.autolibdz.APIs.CarsApi
import com.clovertech.autolibdz.APIs.SafeCarsRequest
import com.clovertech.autolibdz.DataClasses.Rental
import retrofit2.Response

class CarsRepository(
        private val apiCarsByStat :CarsApi) : SafeCarsRequest(){
    suspend fun getCarsByStat(Stat:String)=ApiCarRequest{apiCarsByStat.getCarsListByState(Stat)}
    suspend fun addRental(rental:Rental)=ApiCarRequest { apiCarsByStat.addRental(rental) }
    }
