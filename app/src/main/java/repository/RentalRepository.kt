package com.clovertech.autolibdz.repository

import com.clovertech.autolibdz.DataClasses.Rental
import com.clovertech.autolibdz.utils.RetrofitInstance1
import retrofit2.Response

class RentalRepository {

    suspend fun addRental(rental: Rental):Response<Rental>{
        return RetrofitInstance1.AddRentalApi.addRental(rental)
    }
}