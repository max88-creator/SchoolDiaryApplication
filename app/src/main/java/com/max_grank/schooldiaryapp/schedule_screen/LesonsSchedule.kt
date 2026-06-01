package com.max_grank.schooldiaryapp.schedule_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.schooldiaryapp.R

@Composable
@Preview(showBackground = true)
fun LessonsSchedule() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 28.dp, end = 27.dp)
    ) {
        Row(

        ) {
            Image(
                painter = painterResource(R.drawable.ic_time),
                contentDescription = "Time",
                modifier = Modifier
                    .width(35.dp)
                    .height(21.dp)
            )
            Spacer(modifier = Modifier.width(34.dp))
            Image(
                painter = painterResource(R.drawable.course),
                contentDescription = "Course",
                modifier = Modifier
                    .width(51.dp)
                    .height(21.dp)
            )
            Spacer(modifier = Modifier.width(175.dp))
            Image(
                painter = painterResource(R.drawable.sort_icon),
                contentDescription = "sort",
                modifier = Modifier
                    .width(24.dp)
                    .height(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(19.dp))
        Row() {
            Column() {

                Image(
                    painter = painterResource(R.drawable.group17),
                    contentDescription = "time17",
                    modifier = Modifier
                        .width(34.dp)
                        .height(49.dp)
                )
                Spacer(modifier = Modifier.height(94.dp))
                Image(
                    painter = painterResource(R.drawable.group23),
                    contentDescription = "time23",
                    modifier = Modifier
                        .width(34.dp)
                        .height(49.dp)
                )
                Spacer(modifier = Modifier.height(104.dp))
                Box() {
                    Column() {
                        Image(
                            painter = painterResource(R.drawable.fift_ten),
                            contentDescription = "sort",
                            modifier = Modifier
                                .width(34.dp)
                                .height(24.dp)
                        )
                        Image(
                            painter = painterResource(R.drawable.six_forty),
                            contentDescription = "sort",
                            modifier = Modifier
                                .width(34.dp)
                                .height(21.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.width(14.dp))
            Box(
                modifier = Modifier
                    .width(2.dp)
                    .height(467.dp)
                    .background(
                        color = colorResource(
                            R.color.border
                        )
                    )
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column() {
                Image(
                    painter = painterResource(R.drawable.group18),
                    contentDescription = "time18",
                    modifier = Modifier
                        .width(250.dp)
                        .height(137.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(R.drawable.group19),
                    contentDescription = "time18",
                    modifier = Modifier
                        .width(250.dp)
                        .height(137.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Image(
                    painter = painterResource(R.drawable.group19),
                    contentDescription = "time18",
                    modifier = Modifier
                        .width(250.dp)
                        .height(137.dp)
                )
            }
        }
    }
}
