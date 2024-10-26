package com.z9.countries.di

import com.z9.countries.data.repository.CountryRepositoryImpl
import com.z9.countries.domain.repository.CountryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideCountryRepository(
    ): CountryRepository {
        return CountryRepositoryImpl()
    }
}