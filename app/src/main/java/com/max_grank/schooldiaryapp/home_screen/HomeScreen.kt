package com.max_grank.schooldiaryapp.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.schooldiaryapp.R

//Start 16:22

@Composable
@Preview(showBackground = true)
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = colorResource(R.color.main_screen_bg)
            )
    ) {
        Spacer(modifier = Modifier.height(44.dp))
        Box(
            modifier = Modifier
                .padding(start = 28.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.search_box),
                contentDescription = "search icon",
                modifier = Modifier
                    .size(48.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(top = 40.dp, start = 57.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.vector),
                contentDescription = "vector",
                modifier = Modifier
                    .size(440.dp, 298.dp)
            )
        }
        SubjectCard()
    }
}
