package com.example.mono.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mono.model.ListViewModel

@Composable
fun ListViewComponent(modifier: Modifier,listViewModel: ListViewModel = viewModel()){
    Column(modifier = modifier) {
        LazyColumn {
            items(listViewModel.items){item ->
                Row {
                    Icon(imageVector = item.icon, contentDescription = null)
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(text = item.name)
                    Text(text = item.amount)
                }
            }
        }
    }
}
