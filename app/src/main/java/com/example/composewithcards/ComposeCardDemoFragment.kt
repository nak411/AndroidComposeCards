package com.example.composewithcards

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import com.example.composewithcards.ui.theme.ComposeWithCardsTheme

class ComposeCardDemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                ComposeWithCardsTheme {
                    Cards()
                }
            }
        }
    }

    @Composable
    fun Cards() {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Compose View",
                modifier = Modifier.padding(16.dp),
                color = Color.White
            )
            Card(modifier = Modifier.size(100.dp)) {}
            Card(modifier = Modifier.size(100.dp)) {}
            Card(modifier = Modifier.size(100.dp)) {}
        }
    }

    @Preview
    @Composable
    fun CardsPreview() {
        ComposeWithCardsTheme {
            Cards()
        }
    }

}