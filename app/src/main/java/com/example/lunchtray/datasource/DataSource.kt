package com.example.lunchtray.datasource

import com.example.lunchtray.model.MenuItems.AccompanimentItems
import com.example.lunchtray.model.MenuItems.EntreeItems
import com.example.lunchtray.model.MenuItems.SideDishItems


object DataSource {

    val entreeMenuItems = listOf(
        EntreeItems(
            name = "Cauliflower",
            description = "Whole cauliflower, brined, roasted, and deep fried",
            price = 7.00,
        ),
        EntreeItems(
            name = "Three Bean Chili",
            description = "Black beans, red beans, kidney beans, slow cooked, topped with onion",
            price = 4.00,
        ),
        EntreeItems(
            name = "Mushroom Pasta",
            description = "Penne pasta, mushrooms, basil, with plum tomatoes cooked in garlic " +
                    "and olive oil",
            price = 5.50,
        ),
        EntreeItems(
            name = "Spicy Black Bean Skillet",
            description = "Seasonal vegetables, black beans, house spice blend, served with " +
                    "avocado and quick pickled onions",
            price = 5.50,
        )
    )

    val sideDishMenuItems = listOf(
        SideDishItems(
            name = "Summer Salad",
            description = "Heirloom tomatoes, butter lettuce, peaches, avocado, balsamic dressing",
            price = 2.50,
        ),
        SideDishItems(
            name = "Butternut Squash Soup",
            description = "Roasted butternut squash, roasted peppers, chili oil",
            price = 3.00,
        ),
        SideDishItems(
            name = "Spicy Potatoes",
            description = "Marble potatoes, roasted, and fried in house spice blend",
            price = 2.00,
        ),
        SideDishItems(
            name = "Coconut Rice",
            description = "Rice, coconut milk, lime, and sugar",
            price = 1.50,
        )
    )

    val accompanimentMenuItems = listOf(
        AccompanimentItems(
            name = "Lunch Roll",
            description = "Fresh baked roll made in house",
            price = 0.50,
        ),
        AccompanimentItems(
            name = "Mixed Berries",
            description = "Strawberries, blueberries, raspberries, and huckleberries",
            price = 1.00,
        ),
        AccompanimentItems(
            name = "Pickled Veggies",
            description = "Pickled cucumbers and carrots, made in house",
            price = 0.50,
        )
    )
}