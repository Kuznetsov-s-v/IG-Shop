package com.eightyOne_ig.igshop.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.eightyOne_ig.igshop.R
import com.eightyOne_ig.igshop.ui.theme.components.JetSearchField

@Composable
fun HomeViewDisplay(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier.padding(top = 32.dp,start = 32.dp,end = 32.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            JetSearchField(
                hint = stringResource(R.string.search_hint),
                value = "value",
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.padding(end = 24.dp))
            AsyncImage(
                model = "file:///android_asset/_81_IG.png",
                contentDescription = "",
                modifier = Modifier,
                contentScale = ContentScale.Crop
            )
        }
        Column(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
            Spacer(modifier = Modifier.padding(bottom = 24.dp))
            SpecialOffersWidget()
            Spacer(modifier = Modifier.padding(bottom = 32.dp))
            AchievementsWidget()
            Spacer(modifier = Modifier.padding(bottom = 32.dp))
        }
        SportscarsWidget()
    }
}