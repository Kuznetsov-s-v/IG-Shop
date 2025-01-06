package com.eightyOne_ig.igshop.ui.theme.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.ui.theme.CustomTypography
import com.eightyOne_ig.igshop.ui.theme.backgroundColor
import com.eightyOne_ig.igshop.ui.theme.onSurfaceColor
import com.eightyOne_ig.igshop.ui.theme.white
import com.eightyOne_ig.igshop.ui.theme.yellow
import com.microsoft.fluent.mobile.icons.R

@Composable
fun JetCircularRatingBar(
    rating: Int,
    modifier: Modifier
) {
    val starField = painterResource(id = R.drawable.ic_fluent_star_16_filled)
    val starField12 = painterResource(id = R.drawable.ic_fluent_star_12_filled)
    val pairOffset = arrayOf(
        0.dp to (-16).dp,     // 1
        14.5.dp to (-3).dp,   // 2
        8.9.dp to 13.dp,      // 3
        (-8.9).dp to 13.dp,   // 4
        (-14.5).dp to (-3).dp // 5
    )
    Box(
        modifier = Modifier
            .size(60.dp)
            ,//.background(color = backgroundColor),
        contentAlignment = Alignment.Center,

    ) {
        Canvas(
            modifier = Modifier
                .fillMaxSize()
        ) {
            drawCircle(
                color = white.copy(alpha = 0.2f).copy(alpha = 0.25f),
                radius = 47f,
                center = center
            )
            drawCircle(
                color = backgroundColor,
                radius = 36f,
                center = center,
                //blendMode = BlendMode.DstOut
            )
        }
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = rating.toString(),
                color = onSurfaceColor,
                fontSize = 14.sp,
                style = CustomTypography.bodyLarge,
                fontWeight = FontWeight.Medium,
                //textAlign = TextAlign.Center
            )
            for (i in 0..4) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .offset(x = pairOffset[i].first, y = pairOffset[i].second),

                ) {
                    if (i < rating){
                        Icon(
                            painter = starField,
                            contentDescription = "Star",
                            tint = yellow,
                        )
                    } else {
                        Icon(
                            painter = starField,
                            contentDescription = "Star",
                            tint = Color(0xFF556772),
                        )
                            Icon(
                                painter = starField12,
                                contentDescription = "Star",
                                modifier = Modifier
                                    .offset(x = (-0.16).dp),
                                    tint = backgroundColor,
                            )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = false, locale = "en"/* , device = "spec:width=411dp,height=891dp" */)
@Composable
fun JetCircularRatingBarPreview(){
    JetCircularRatingBar(
        rating =  3,
        Modifier
    )
}