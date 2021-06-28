package com.clovertech.autolibdz.repository

import com.clovertech.autolibdz.DataClass.Pay
import com.clovertech.autolibdz.DataClass.PayResponse
import com.clovertech.autolibdz.DataClass.PaymentMethod
import com.clovertech.autolibdz.DataClass.paymentResponse
import com.clovertech.autolibdz.DataClasses.SubscriptionRequest
import com.clovertech.autolibdz.DataClasses.SubscriptionResponse
import com.clovertech.autolibdz.utils.RetrofitInstance1
import repository.Repository
import retrofit2.Response

class PaymentRepository {
    suspend fun pushCard(paymentMethod: PaymentMethod) : Response<paymentResponse> {
        return RetrofitInstance1.api.pushCard(paymentMethod)
    }
    suspend fun pay(pay: Pay) : Response<PayResponse> {
        return RetrofitInstance1.api.pay(pay)
    }
    suspend fun addSub(subscriptionRequest: SubscriptionRequest) : Response<SubscriptionResponse> {
        return RetrofitInstance1.subApi.addSub(subscriptionRequest)
    }
}