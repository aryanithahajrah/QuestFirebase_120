package com.example.prak9new.repository

import com.example.prak9new.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MhsRepository {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>
    fun getMhs (nim: String): Flow<Mahasiswa>
    suspend fun deleteMhs(mahasiswa: Mahasiswa)
    suspend fun updateMhs(mahasiswa: Mahasiswa)
}