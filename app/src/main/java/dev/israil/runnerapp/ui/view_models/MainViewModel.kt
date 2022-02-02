package dev.israil.runnerapp.ui.view_models

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.israil.runnerapp.repositories.MainRepository

class MainViewModel @ViewModelInject constructor(val mainRepository: MainRepository): ViewModel() {
}