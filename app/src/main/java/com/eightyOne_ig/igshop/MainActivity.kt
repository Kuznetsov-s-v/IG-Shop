package com.eightyOne_ig.igshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eightyOne_ig.igshop.ui.theme.IGShopTheme
import com.eightyOne_ig.igshop.ui.theme.components.JetSearchField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IGShopTheme(darkTheme = false, dynamicColor = false) {
                    Box(modifier = Modifier.padding(start = 50.dp, end = 50.dp, top = 100.dp)) {
                        JetSearchField(
                            hint = "text_1",
                            value = "text_2",
                            modifier = Modifier
                        )
                    }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    IGShopTheme {
        Greeting("Android")
    }
}