package com.example.prak9new

import android.app.Application
import com.example.prak9new.di.MahasiswaContainer

class MahasiswaApp: Application() {
    lateinit var containerApp: MahasiswaContainer
    override fun onCreate(){
        super.onCreate()
        containerApp = MahasiswaContainer(this)
    }
}