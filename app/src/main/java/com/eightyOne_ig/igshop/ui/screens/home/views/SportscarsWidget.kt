package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.R
import com.eightyOne_ig.igshop.ui.theme.fonts

data class Car(
    val carName: String,
    val carType: String,
    val price: Int,
    val rating: Int,
    val imagePath: String
)

@Composable
fun SportscarsWidget() {
    val cars = listOf(
        Car(
            carName = "Lamba-A",
            carType = "Классический спорткар",
            price = 177000,
            rating = 4,
            imagePath = "file:///android_asset/Sportcar1.jpg"
        ),
        Car(
            carName = "Lamba Sport",
            carType = "Премиум",
            price = 500000,
            rating = 5,
            imagePath = "file:///android_asset/Sportcar2.jpg"
        ),
        Car(
            carName = "Lamborghini Urus",
            carType = "Внедорожник премиум-класса",
            price = 250000,
            rating = 5,
            imagePath = "file:///android_asset/Sportcar3.jpg"
        )
    )

    Column(
        //modifier = Modifier.padding(start = 32.dp)
    ) {
        Text(
            text = stringResource(R.string.special_offers_title),
            color = Color.White.copy(alpha = 0.75f),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 26.dp, bottom = 8.dp),
            style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.W700,
                fontSize = 18.sp,
                lineHeight = 21.09.sp
            )
        )
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
        ) {
            items(cars.size) { index ->
                val car = cars[index]
                SportcarCard(
                    carName = car.carName,
                    carType = car.carType,
                    price = car.price,
                    rating = car.rating,
                    imagePath = car.imagePath,
                    modifier = Modifier
                )
            }
        }
    }
}