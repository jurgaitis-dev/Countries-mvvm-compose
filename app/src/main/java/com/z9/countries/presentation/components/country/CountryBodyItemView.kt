package com.z9.countries.presentation.components.country

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.z9.countries.R
import com.z9.countries.domain.model.Country

@Composable
fun CountryBodyItemView(
    country: Country,
) {
    Column(
        modifier = Modifier
            .padding(
                bottom = dimensionResource(id = R.dimen.padding_10),
                top = dimensionResource(id = R.dimen.padding_10),
                start = dimensionResource(id = R.dimen.padding_10),
                end = dimensionResource(id = R.dimen.padding_10),
            )
            .fillMaxWidth()
    ) {
        Text(country.name)
    }
}
