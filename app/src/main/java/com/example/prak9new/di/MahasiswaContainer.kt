package com.example.prak9new.di

import android.content.Context
import com.example.prak9new.repository.MhsRepository
import com.example.prak9new.repository.NetworkRepositoryMhs
import com.google.firebase.firestore.FirebaseFirestore

interface InterfaceContainerApp{
    val mhsRepository: MhsRepository
}

class MahasiswaContainer(private val context: Context): InterfaceContainerApp {
    private val firestore: FirebaseFirestore = FirebaseFirestore.getInstance()
    override val mhsRepository: MhsRepository by lazy {
        NetworkRepositoryMhs(firestore)
    }
}