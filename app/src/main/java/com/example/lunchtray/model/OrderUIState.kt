package com.example.lunchtray.model

data class OrderUiState(
    val entree: MenuItems.EntreeItems? = null,
    val sideDish: MenuItems.SideDishItems? = null,
    val accompaniment: MenuItems.AccompanimentItems? = null,
    val itemTotalPrice: Double = 0.0,
    val orderTax: Double = 0.0,
    val orderTotalPrice: Double = 0.0
)