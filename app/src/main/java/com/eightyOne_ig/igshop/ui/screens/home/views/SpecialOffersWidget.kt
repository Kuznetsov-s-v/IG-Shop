package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
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

@Composable
fun SpecialOffersWidget(){
    val offerNumber = listOf("№ 103 436", "№ 105 423", "№ 121 453", "№ 364 154")
    val colorNumber = listOf(Color(0xFF344b57),Color(0xFF3e545f),Color(0xFF51656f),Color(0xFF5a6d76))
    Column( modifier = Modifier ){
        Text(
            text = stringResource(R.string.special_offers_title),
            color = Color.Companion.White.copy(0.75f),
            textAlign = TextAlign.Center,
            modifier = Modifier,
            style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.W700,
                fontSize = 18.sp,
                lineHeight = 21.09.sp,
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy((-190).dp),
            reverseLayout = true
        ){
            itemsIndexed(offerNumber) { index, number ->

                //val alpha = (index * 0.30f).coerceIn(0f, 1f) // Расчет альфы с коэффициентом 0.30f
                //val backgroundColor = MaterialTheme.colorScheme.surface.copy(alpha = alpha) // Создание цвета с изменяющейся альфой

                SpecialOfferCard(
                    number = number,
                    selected = index == offerNumber.lastIndex,
                    modifier = Modifier.background(color = colorNumber[index], shape = RoundedCornerShape(24.dp))
                )
            }
        }
    }
}