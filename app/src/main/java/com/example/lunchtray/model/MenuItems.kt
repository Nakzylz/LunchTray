package com.example.lunchtray.model

import java.text.NumberFormat

sealed class MenuItems(
    open val name: String,
    open val description: String,
    open val price: Double
) {

    data class EntreeItems(
        override val name: String,
        override val description: String,
        override val price: Double
    ) : MenuItems(name, description, price)

    data class SideDishItems(
        override val name: String,
        override val description: String,
        override val price: Double
    ) : MenuItems(name, description, price)

    data class AccompanimentItems(
        override val name: String,
        override val description: String,
        override val price: Double
    ) : MenuItems(name, description, price)

    fun getFormattedPrice(): String = NumberFormat.getCurrencyInstance().format(price)
}