package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.ui.theme.fonts
import com.eightyOne_ig.igshop.ui.utils.dashedBorder
import com.microsoft.fluent.mobile.icons.R

@Composable
fun SpecialOfferCard(
    number: String,
    selected: Boolean,
    modifier: Modifier = Modifier,
){
    Box(
      modifier = modifier
          .clip(shape = RoundedCornerShape(24.dp))
          //.background(color = Color.White.compositeOver(Color.White.copy(0.05f)))
          .dashedBorder(2.dp,color = MaterialTheme.colorScheme.onSecondary,shape = RoundedCornerShape(24.dp),on = 7.dp,off = if (selected) 0.dp else 7.dp )
        ,
        contentAlignment = Alignment.CenterStart

    ){
        Icon (
            modifier = Modifier
                .padding(start = 11.9.dp, top = 11.dp, bottom = 12.dp)
                .size(96.dp)
            ,
            painter = painterResource(id = R.drawable.ic_fluent_contact_card_32_filled),
            contentDescription = "Icon button",
            tint = Color.Companion.White.copy(0.5f)
        )
        Text(
            text = number,
            color = Color.Companion.White.copy(0.75f),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(start = 171.dp)
                .align(Alignment.CenterEnd)
                .graphicsLayer(rotationZ = -90f)
            ,
            style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.W700,
                fontSize = 12.sp,
                lineHeight = 14.06.sp,
            )
        )
    }
}

