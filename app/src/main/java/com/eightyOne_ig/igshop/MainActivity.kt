package com.eightyOne_ig.igshop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eightyOne_ig.igshop.ui.screens.home.views.AchievementsWidget
import com.eightyOne_ig.igshop.ui.screens.home.views.HomeViewDisplay
import com.eightyOne_ig.igshop.ui.screens.home.views.SpecialOfferCard
import com.eightyOne_ig.igshop.ui.screens.home.views.SpecialOffersWidget
import com.eightyOne_ig.igshop.ui.screens.home.views.SportcarCard
import com.eightyOne_ig.igshop.ui.screens.home.views.UserRatingCard
import com.eightyOne_ig.igshop.ui.theme.IGShopTheme
import com.eightyOne_ig.igshop.ui.theme.components.JetSearchField

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IGShopTheme(darkTheme = false, dynamicColor = false) {
                        /*SpecialOfferCard(
                            number = "№ 103 436",
                            selected = true,
                            modifier = Modifier,
                        )*/
                        /*JetSearchField(
                            hint = "text_1",
                            value = "text_2",
                            modifier = Modifier
                        )*/
                      //  Spacer(modifier = Modifier.padding(bottom = 20.dp))

                       /* UserRatingCard(
                            number = 1,
                            imagePath = "file:///android_asset/UserIcon.png",
                            name = "Джонни Джонсон",
                            balls = 123,
                            modifier = Modifier
                        )*/
                        /*SportcarCard(
                            carName = "Lamba-A",
                            carType = "Классический спорткар",
                            rating = 4,
                            price = 177_000,
                            modifier = Modifier
                        )*/
                        //SpecialOffersWidget2()
                        //AchievementsWidget()
                        HomeViewDisplay()

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