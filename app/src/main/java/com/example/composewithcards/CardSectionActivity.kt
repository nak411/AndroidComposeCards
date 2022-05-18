package com.example.composewithcards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composewithcards.data.Data
import com.example.composewithcards.data.data
import com.example.composewithcards.ui.theme.ComposeWithCardsTheme

class CardSectionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeWithCardsTheme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.primary
                ) {
                    SectionsScreen(items = data)
                }
            }
        }
    }
}

@Composable
fun SectionsScreen(
    items: List<Data>
) {
    LazyColumn(
        modifier = Modifier.padding(horizontal = 32.dp),
        contentPadding = PaddingValues(vertical = 32.dp)
    ) {
        items(items = items) { item ->
            when (item) {
                is Data.Header -> Header(text = item.label)
                is Data.Item -> Item(text = item.text)
                is Data.Footer -> Footer(text = item.text)
            }
        }
    }
}

@Composable
private fun Header(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = MaterialTheme.shapes.medium.copy(
            bottomStart = CornerSize(0),
            bottomEnd = CornerSize(0)
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}

@Composable
private fun Item(text: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium.copy(
            all = CornerSize(0)
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}

@Composable
private fun Footer(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp),
        shape = MaterialTheme.shapes.medium.copy(
            topStart = CornerSize(0),
            topEnd = CornerSize(0)
        )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}

@Preview
@Composable
fun SectionsScreenPreview() {
    ComposeWithCardsTheme {
        SectionsScreen(data)
    }
}
