package com.z9.countries.presentation

import com.z9.countries.domain.Country

data class CountriesState(
    val countries: List<Country> = emptyList(),
)
