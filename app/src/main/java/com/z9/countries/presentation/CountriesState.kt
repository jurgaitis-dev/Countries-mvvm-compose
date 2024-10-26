package com.z9.countries.presentation

import com.z9.countries.domain.model.Country

data class CountriesState(
    val countries: List<Country> = emptyList(),
)
