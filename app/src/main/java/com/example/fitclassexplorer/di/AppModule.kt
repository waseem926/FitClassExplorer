package com.example.fitclassexplorer.di

import com.example.fitclassexplorer.data.FitnessClassRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideFitnessClassRepository() : FitnessClassRepository {
        return FitnessClassRepository()
    }
}