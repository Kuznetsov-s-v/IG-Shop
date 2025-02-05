package com.eightyOne_ig.igshop.ui.theme.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eightyOne_ig.igshop.R
import com.eightyOne_ig.igshop.ui.theme.backgroundColor
import com.eightyOne_ig.igshop.ui.theme.customTypography
import com.eightyOne_ig.igshop.ui.theme.white


@Composable
fun JetSpecificationCard(
    specifications: List<String>,
    modifier: Modifier = Modifier
){
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .width(346.dp)
            .height(149.dp)
            .clip(
                RoundedCornerShape(
                    topStart = 60.dp,
                    topEnd = 60.dp,
                    bottomStart = 32.dp,
                    bottomEnd = 32.dp
                )
            )
            .background(color = backgroundColor) // цвет фона для тестов, в релизе убрать.
            .background(
                color = white.copy(0.1f)
            ),
    ) {
        Text (
            text = stringResource(R.string.Specifications),
            color = white.copy(0.5f),
            //style = CustomTypography.titleLargeMenu,

            style = customTypography.labelSmall,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 12.dp,start = 52.dp,end = 48.dp)
        )
        Box (
            modifier = Modifier
                .width(315.dp)
                .height(112.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 60.dp,
                        topEnd = 60.dp,
                        bottomStart = 32.dp,
                        bottomEnd = 32.dp
                    )
                )
                //.align(Alignment.Center)
                .background(
                    color = white.copy(alpha = 0.2f)
                ),
            ) {
            Row(

                //verticalAlignment = Alignment.CenterVertically,
                //horizontalArrangement = Arrangement.Center
            ){
                for (circularRatingBar in specifications) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.padding(start = 16.dp, end = 10.dp, top = 21.dp, bottom = 17.dp)
                    ) {
                        Text(
                            text = circularRatingBar,
                            color = white.copy(0.5f),
                            style = customTypography.labelSmall,
                            )
                        JetCircularRatingBar(2, Modifier)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = false /*, locale = "en" , device = "spec:width=411dp,height=891dp" */)
@Composable
fun JetSpecificationCardPreview(){
    JetSpecificationCard(
        specifications =  listOf(
            "Скорость",
            "Корпус",
            "Щиты"
        ),
        Modifier
    )
}
