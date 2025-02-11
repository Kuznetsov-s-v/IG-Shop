package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.eightyOne_ig.igshop.ui.theme.components.JetRatingBar
import com.eightyOne_ig.igshop.ui.theme.fonts

@Composable
fun SportcarCard(
    carName: String,
    carType: String,
    rating: Int,
    price: Int,
    imagePath: String,
    modifier: Modifier
) {
    Row(
        modifier = modifier
            .clip(shape = RoundedCornerShape(16.dp))
            .background(MaterialTheme.colorScheme.onSurface)

    ) {
        AsyncImage(
            model = imagePath, //"file:///android_asset/Sportcar1.jpg",
            contentDescription = "",
            modifier = Modifier
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp)
                .size(64.dp)
                .aspectRatio(1f)

                .clip(shape = RoundedCornerShape(16.dp)), contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.padding(start = 24.dp, top = 16.dp, bottom = 16.dp)
        ) {
            Text(
                text = carName,
                color = Color.Companion.White,
                textAlign = TextAlign.Center,
                modifier = Modifier,
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.W500,
                    fontSize = 18.sp,
                    lineHeight = 21.08.sp,
                )
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = carType,
                color = Color.Companion.White,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(end = 18.dp),
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.W700,
                    fontSize = 13.sp,
                    lineHeight = 15.23.sp,
                )
            )
            Spacer(modifier = Modifier.width(7.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                JetRatingBar(rating, modifier = Modifier)
                Spacer(modifier = Modifier.weight(1f))
                Text(
                    text = "%,d".format(price).replace(",", " ") + " Kr",
                    color = Color(0xFFEBEBEB),
                    textAlign = TextAlign.Right,
                    modifier = Modifier.padding(end = 18.dp),
                    style = TextStyle(
                        fontFamily = fonts,
                        fontWeight = FontWeight.W300,
                        fontSize = 12.sp,
                        lineHeight = 14.06.sp,
                    )
                )
            }
        }
    }
}
