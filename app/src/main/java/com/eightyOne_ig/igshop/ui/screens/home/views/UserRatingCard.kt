package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.ui.theme.fonts
import coil3.compose.AsyncImage


@Composable
fun UserRatingCard(
    number: Int,
    imagePath: String,
    name: String,
    balls: Int,
    modifier: Modifier = Modifier
) {
    fun  rowTextStyle(FontWeight: FontWeight):TextStyle {
        return TextStyle(
            fontFamily = fonts,
            fontWeight = FontWeight,
            fontSize = 12.sp,
            lineHeight = 14.06.sp,
        )
    }
    Row(modifier = modifier){
        Text(
            text = number.toString(),
            color = Color.Companion.White.copy(0.75f),
            textAlign = TextAlign.Center,
            modifier = Modifier,
            style = rowTextStyle(FontWeight.W700)
        )
        Spacer(modifier = Modifier.width(16.dp))
          Box(modifier = Modifier
              .border(width = 0.5.dp, shape = RoundedCornerShape(3.dp), color = Color(0xFFabb4e7))
          ) {
            AsyncImage(
                model = imagePath,
                contentDescription = "",
                modifier = Modifier.padding(1.dp).border(width = 0.5.dp, shape = RoundedCornerShape(3.dp), color = Color(0xFFabb4e7))
                , contentScale = ContentScale.Crop
            )
          }
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = name,
            color = Color.Companion.White.copy(0.75f),
            textAlign = TextAlign.Center,
            modifier = Modifier,
            style = rowTextStyle(FontWeight.W500)
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = balls.toString() + " б.",
            color = Color.Companion.White.copy(0.75f),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(end = 12.dp),
            style = rowTextStyle(FontWeight.W500)
        )
    }
}