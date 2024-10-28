package com.z9.countries.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.z9.countries.R
import com.z9.countries.domain.model.Country
import com.z9.countries.presentation.components.country.CountryBodyItemView
import com.z9.countries.presentation.components.country.CountryTitleItemView
import com.z9.countries.presentation.components.common.Toolbar
import com.z9.countries.ui.theme.CountriesTheme

@ExperimentalFoundationApi
@ExperimentalMaterial3Api
@Composable
fun CountriesScreen(viewModel: CountriesViewModel = hiltViewModel()) {
    val state: CountriesState by viewModel.state.collectAsStateWithLifecycle()

    CountriesTheme {
        Scaffold(
            topBar = {
                Toolbar(stringResource(R.string.list_of_categories_screen_title))
            },
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding),
            ) {
                LazyColumn {
                    state.countries.forEach { country ->
                        when (country) {
                            is Country.Body -> item { CountryBodyItemView(country) }
                            is Country.Title -> stickyHeader { CountryTitleItemView(country) }
                        }
                    }
                }
            }
        }
    }
}
