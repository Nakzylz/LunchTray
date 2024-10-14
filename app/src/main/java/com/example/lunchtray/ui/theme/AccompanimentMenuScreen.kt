package com.example.lunchtray.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lunchtray.R
import com.example.lunchtray.datasource.DataSource
import com.example.lunchtray.model.MenuItems
import com.example.lunchtray.model.MenuItems.AccompanimentItems

@Composable
fun AccompanimentMenuScreen(
    options: List<AccompanimentItems>,
    onCancelButtonClicked: () -> Unit,
    onNextButtonClicked: () -> Unit,
    onSelectionChanged: (AccompanimentItems) -> Unit,
    modifier: Modifier = Modifier
) {
    BaseMenuScreen(
        options = options,
        onCancelButtonClicked = onCancelButtonClicked,
        onNextButtonClicked = onNextButtonClicked,
        onSelectionChanged = onSelectionChanged as (MenuItems) -> Unit,
        modifier = modifier
    )
}

@Preview
@Composable
fun AccompanimentMenuPreview(){
    AccompanimentMenuScreen(
        options = DataSource.accompanimentMenuItems,
        onNextButtonClicked = {},
        onCancelButtonClicked = {},
        onSelectionChanged = {},
        modifier = Modifier
            .padding(dimensionResource(R.dimen.padding_medium))
            .verticalScroll(rememberScrollState())
    )
}
