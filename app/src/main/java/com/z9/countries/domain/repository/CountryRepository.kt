package com.z9.countries.domain.repository

import com.z9.countries.domain.model.Country

interface CountryRepository {
    suspend fun getCountries() : List<Country>
}