package com.z9.countries.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class CountriesViewModel(): ViewModel() {
    private val _state = MutableStateFlow(CountriesState())
    val state = _state.asStateFlow()
}
