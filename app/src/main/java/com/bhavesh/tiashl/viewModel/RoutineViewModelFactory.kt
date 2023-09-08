package com.bhavesh.tiashl.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bhavesh.tiashl.data.repository.RoutineRepository

class RoutineViewModelFactory(private val routineRepository: RoutineRepository)  : ViewModelProvider.Factory{

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return RoutineViewModel(routineRepository) as T
    }

}