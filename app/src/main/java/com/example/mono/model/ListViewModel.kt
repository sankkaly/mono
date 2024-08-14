package com.example.mono.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ListViewModel : ViewModel() {

    private val _items = mutableStateListOf(
        ListItem(Icons.Default.ShoppingCart, "Groceries", "$150"),
//        ListItem(Icons.Default.Restaurant, "Dining", "$75"),
//        ListItem(Icons.Default.LocalGasStation, "Fuel", "$50"),
//        ListItem(Icons.Default.ShoppingBag, "Clothing", "$200"),
        ListItem(Icons.Default.Home, "Rent", "$1000"),
//        ListItem(Icons.Default.DirectionsCar, "Car Maintenance", "$300"),
//        ListItem(Icons.Default.FitnessCenter, "Gym", "$40")
    )

    // Publicly exposed immutable list
    val items: SnapshotStateList<ListItem> = _items

    // Function to add an item
    fun addItem(name: String, amount: String) {
        viewModelScope.launch {
            val newItem = ListItem(Icons.Default.ShoppingCart, name, amount)
            _items.add(newItem)
        }
    }
}
