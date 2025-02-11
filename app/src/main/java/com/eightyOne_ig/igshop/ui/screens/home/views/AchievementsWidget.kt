package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.R
import com.microsoft.fluent.mobile.icons.R.drawable
import com.eightyOne_ig.igshop.ui.theme.fonts


val listWinners: List<Pair<String, Int>> = listOf(
    "Джонни Джонсон" to 123,
    "Мэри Мэроу" to 102,
    "Дики Дуо" to 71
)

val listIconUsers: List<Pair<String, String?>> = listOf(
    "Джонни Джонсон" to null,
    "Мэри Мэроу" to null,
    "Дики Дуо" to "file:///android_asset/UserIcon.png"
)


@Composable
fun AchievementsWidget(){
    Column(){
        Row() {
            Text(
                text = stringResource(R.string.achievements_and_awards_title),
                color = Color.Companion.White.copy(0.75f),
                textAlign = TextAlign.Center,
                modifier = Modifier,
                style = TextStyle(
                    fontFamily = fonts,
                    fontWeight = FontWeight.W700,
                    fontSize = 18.sp,
                    lineHeight = 21.08.sp,
                )
            )
            Spacer(Modifier.weight(1f))
            Icon (
                modifier = Modifier
                    .padding(end = 11.dp)
                    .size(24.dp)
                ,
                painter = painterResource(id = drawable.ic_fluent_filter_16_filled),
                contentDescription = "",
                tint = MaterialTheme.colorScheme.onSecondary
            )
        }
    }
    Spacer(Modifier.padding(bottom = 12.dp))
    Column(
        modifier = Modifier
            .background(color  = Color.White.copy(0.2f), shape = RoundedCornerShape(8.dp))
            .padding(start = 19.dp, end = 25.dp)
    ){
        Spacer(Modifier.padding(bottom = 10.dp))
        listWinners.forEachIndexed { index, winner ->
            // Находим изображение для текущего пользователя
            val userIcon = listIconUsers.find { it.first == winner.first }?.second
                ?: "file:///android_asset/UserIcon.png"

            UserRatingCard(
                number = index + 1,
                imagePath = userIcon,
                name = winner.first,
                balls = winner.second,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            // Добавляем Divider только если это не последний элемент
            if (index < listWinners.size - 1) {
                Divider(
                    modifier = Modifier.height(2.dp),
                    color = Color.White.copy(0.25f)
                )
            }
        }
        Spacer(Modifier.padding(bottom = 12.dp))
    }
}