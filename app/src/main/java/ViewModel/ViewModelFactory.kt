package ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.clovertech.autolibdz.repository.PaymentRepository

class ViewModelFactory (private val  repository: PaymentRepository) : ViewModelProvider.Factory{


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ViewModelCard(repository) as T
    }
}