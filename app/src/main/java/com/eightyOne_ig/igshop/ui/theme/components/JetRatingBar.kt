package com.eightyOne_ig.igshop.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.eightyOne_ig.igshop.ui.theme.IGShopTheme
import com.eightyOne_ig.igshop.ui.theme.yellow
import com.microsoft.fluent.mobile.icons.R

@Composable
fun JetRatingBar(
    rating: Int,
    modifier: Modifier = Modifier,
) {
    require(rating in 1..5) { "Rating must be between 1 and 5" }

    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center //spacedBy(1.25.dp)
    ) {
        for (i in 1..5) {
            Icon(
                painter = if (i <= rating) {
                    painterResource(id = R.drawable.ic_fluent_star_24_filled)
                } else {
                    painterResource(id = R.drawable.ic_fluent_star_24_filled)
                },
                tint = if (i <= rating) {
                    yellow
                } else {
                    Color(0xFFCACACA)
                },
                contentDescription = "Star $i",
                modifier = if (i <= rating) {
                    Modifier
                        .size(width = 13.33.dp, height = 12.77.dp)
                        .padding(start = 1.25.dp, end = 1.25.dp, top = 1.57.dp, bottom = 1.67.dp)
                } else {
                    Modifier
                        .size(width = 12.5.dp, height = 12.77.dp)
                        .padding(start = 1.25.dp, end = 1.25.dp, top = 1.57.dp, bottom = 1.67.dp)
                }
            )
        }
    }
}

@Preview(showBackground = false,backgroundColor = 0xFF1C1F1E)
@Composable
fun JetRatingBarPreview() {
    IGShopTheme(darkTheme = false, dynamicColor = false){
        JetRatingBar(rating = 3, modifier = Modifier)
    }
}