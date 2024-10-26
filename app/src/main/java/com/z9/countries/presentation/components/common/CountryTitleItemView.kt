package com.z9.countries.presentation.components.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.z9.countries.R
import com.z9.countries.domain.model.Country

@Composable
fun CountryTitleItemView(
    country: Country,
) {
    Row(
        modifier = Modifier
            .background(Color.White)
            .fillMaxWidth()
    ) {
        Text(
            text = country.name, modifier = Modifier
                .padding(
                    bottom = dimensionResource(id = R.dimen.padding_15),
                    top = dimensionResource(id = R.dimen.padding_15),
                    start = dimensionResource(id = R.dimen.padding_15),
                    end = dimensionResource(id = R.dimen.padding_15),
                )
        )
    }
}
