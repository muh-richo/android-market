package com.gunder.market.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.gunder.market.ui.theme.MarketTheme

@Composable
fun MainScreen() {
    var count by remember {
        mutableStateOf(0)
    }
    statefulComponent(count, onChange = { count++ })
}

@Composable
fun statefulComponent(count: Int, onChange: () -> Unit) {
    Column {
        Text(text = "Count: $count")
        Button(onClick = onChange) {
            Text(text = "Tambah Data")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun statefulComponentPreview() {
    MarketTheme {
        MainScreen()
    }
}