package com.eightyOne_ig.igshop.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.ui.utils.advancedShadow
import com.eightyOne_ig.igshop.R
import com.eightyOne_ig.igshop.ui.theme.IGShopTheme
import com.eightyOne_ig.igshop.ui.theme.fonts
import com.microsoft.fluent.mobile.icons.R.drawable

@Composable
fun JetSearchField(
    hint: String,
    value: String,
    modifier: Modifier,
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(color = MaterialTheme.colorScheme.onSurface)
            .advancedShadow(
                alpha =  0.05f,
                shadowBlurRadius = 4.dp,
                offsetY = 5.dp,
                offsetX = 0.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ){
        Icon (
            modifier = Modifier
                .padding(start = 11.9.dp, top = 11.dp, bottom = 12.dp)
                .size(24.dp)
            ,
            painter = painterResource(id = drawable.ic_fluent_search_48_regular),
            contentDescription = "Icon button",
            tint = Color.Companion.White
        )
        Text(
            text = stringResource(R.string.search_hint),
            color = MaterialTheme.colorScheme.surface,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(start = 17.29.dp),
            style = TextStyle(
                fontFamily = fonts,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                lineHeight = 14.06.sp,
            )
        )
    }
}


@Preview(showBackground = false, backgroundColor = 0xFFFFFFFF)
@Composable
fun JetTextButtonPreview() {
    IGShopTheme(darkTheme = false, dynamicColor = false, ) {
        JetSearchField(
            hint = "text_1",
            value = "text_2",
            modifier = Modifier
        )
    }
}