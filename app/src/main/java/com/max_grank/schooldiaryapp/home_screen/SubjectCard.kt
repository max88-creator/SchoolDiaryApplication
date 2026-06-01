package com.max_grank.schooldiaryapp.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.max_grank.schooldiaryapp.R
import com.max_grank.schooldiaryapp.ui.theme.AppFontFamily

@Composable
@Preview(showBackground = true)
fun SubjectCard() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(10.dp))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 28.dp)
        ) {
            Spacer(modifier = Modifier.height(28.dp))
            Text(
                text = "Subjects",
                style = TextStyle(
                    color = colorResource(R.color.black_text),
                    fontSize = 24.sp,
                    fontFamily = AppFontFamily,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = "Recommendations for you",
                style = TextStyle(
                    color = colorResource(R.color.gray_text),
                    fontSize = 14.sp,
                    fontFamily = AppFontFamily,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Medium
                )
            )
            Spacer(modifier = Modifier.height(13.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(
                        state = rememberScrollState(),
                        enabled = true,
                        flingBehavior = ScrollableDefaults.flingBehavior()
                    )
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.group9
                    ),
                    contentDescription = "subject box",
                    modifier = Modifier
                        .size(
                            width = 149.dp,
                            height = 119.dp
                        )
                )
                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(
                        R.drawable.group10
                    ),
                    contentDescription = "subject box",
                    modifier = Modifier
                        .size(
                            width = 149.dp,
                            height = 119.dp
                        )
                )
                Spacer(modifier = Modifier.width(16.dp))
                Box(
                    modifier = Modifier
                        .width(148.dp)
                        .height(119.dp)
                        .clip(shape = RoundedCornerShape(16.dp))
                        .background(color = colorResource(
                            R.color.hide_box))

                ) {
                    Text(
                        text = "Biology",
                        style = TextStyle(
                            color = colorResource(R.color.white),
                            fontSize = 16.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 16.sp,
                            fontWeight = FontWeight.Medium
                        ),
                        modifier = Modifier
                            .padding(start = 16.dp, top = 79.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(31.dp))
            Text(
                text = "Your Schedule",
                style = TextStyle(
                    color = colorResource(R.color.black_text),
                    fontSize = 24.sp,
                    fontFamily = AppFontFamily,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Next lessons",
                style = TextStyle(
                    color = colorResource(R.color.gray_text),
                    fontSize = 14.sp,
                    fontFamily = AppFontFamily,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Normal
                )
            )
            Spacer(modifier = Modifier.height(24.dp))
            Image(
                painter = painterResource(
                    R.drawable.group11
                ),
                contentDescription = "biology",
                modifier = Modifier
                    .size(
                        width = 319.dp,
                        height = 137.dp
                    )
            )
        }
    }
}