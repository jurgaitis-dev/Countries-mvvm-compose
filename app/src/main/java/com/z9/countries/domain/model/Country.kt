package com.z9.countries.domain.model

sealed class Country(
    open val name: String,
) {
    data class Title(override val name: String) : Country(name)
    data class Body(override val name: String, val code: String) : Country(name)
}
