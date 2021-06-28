package ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.clovertech.autolibdz.ViewModel.ViewModelCars
import repository.CarsRepository

class ViewModelCarsFactory (
        private val  repository: CarsRepository
) : ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ViewModelCars(this.repository) as T
    }

}