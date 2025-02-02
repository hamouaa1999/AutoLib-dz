package com.clovertech.autolibdz.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.clovertech.autolibdz.APIs.CouroutineFact
import com.clovertech.autolibdz.APIs.CouroutinePromo
import com.clovertech.autolibdz.DataClasses.Facture
import com.clovertech.autolibdz.DataClasses.Promo
import com.clovertech.autolibdz.repository.PromoRepository
import kotlinx.coroutines.Job

class PromoCodeViewModel(private val repository: PromoRepository): ViewModel() {
    private lateinit var job: Job
    private val myResponse= MutableLiveData<List<Promo>>()
    val promo: LiveData<List<Promo>>
        get() = myResponse
    fun getPromo(){
        job= CouroutinePromo.ioThenMain(
            {repository.getPromo()},
            {myResponse.value=it})
    }

    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized)job.cancel()
    }

}