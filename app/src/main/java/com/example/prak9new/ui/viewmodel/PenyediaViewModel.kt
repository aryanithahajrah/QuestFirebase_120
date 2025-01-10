package com.example.prak9new.ui.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.prak9new.MahasiswaApp

object PenyediaViewModel{
    val Factory =  viewModelFactory {
        initializer {
            HomeViewModel(
                mahasiswaApp().containerApp.mhsRepository
            )
        }
        initializer {
            InsertViewModel(
                mahasiswaApp().containerApp.mhsRepository
            )
        }
    }
}

fun CreationExtras.mahasiswaApp(): MahasiswaApp =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApp)