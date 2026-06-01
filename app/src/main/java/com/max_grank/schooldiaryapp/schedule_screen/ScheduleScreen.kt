package com.max_grank.schooldiaryapp.schedule_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.max_grank.schooldiaryapp.R
import com.max_grank.schooldiaryapp.ui.theme.AppFontFamily

//Start 8:16
//Pause 9:51
//Resumed 10:31
//Paused 11:12
//Resumed 12:15
//Finished 12:51
@Composable
@Preview(showBackground = true)
fun ScheduleScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(top = 32.dp, start = 28.dp, end = 28.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "24",
                    style = TextStyle(
                        color = colorResource(R.color.schedule_black_text),
                        fontSize = 44.sp,
                        fontFamily = AppFontFamily,
                        lineHeight = 44.sp,
                        fontWeight = FontWeight.Normal
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                Column {
                    Text(
                        text = "Wed",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 14.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )

                    Text(
                        text = "Jan 2020",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 14.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 14.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
                Spacer(modifier = Modifier.width(112.dp))
                Image(
                    painter = painterResource(
                        R.drawable.button
                    ),
                    contentDescription = "button",
                    modifier = Modifier
                        .size(
                            width = 319.dp,
                            height = 137.dp
                        )
                )
            }
        }
            ScheduleCard()
    }
}


