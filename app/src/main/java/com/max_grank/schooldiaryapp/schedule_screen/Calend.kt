package com.max_grank.schooldiaryapp.schedule_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.max_grank.schooldiaryapp.R
import com.max_grank.schooldiaryapp.ui.theme.AppFontFamily

@Composable
@Preview(showBackground = true)
fun Calend() {
    Column (
        modifier = Modifier
            .fillMaxWidth()
           // .width(375.dp)
            .height(69.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .width(323.dp)
                .height(57.dp)
        ) {
            Spacer(modifier = Modifier.width(25.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "S",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "21",
                        style = TextStyle(
                            color = colorResource(R.color.schedule_black_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(33.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "M",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "22",
                        style = TextStyle(
                            color = colorResource(R.color.schedule_black_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(33.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "T",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "23",
                        style = TextStyle(
                            color = colorResource(R.color.schedule_black_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(33.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = colorResource(R.color.math_bg)),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Text(
                        text = "W",
                        style = TextStyle(
                            color = colorResource(R.color.white),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "24",
                        style = TextStyle(
                            color = colorResource(R.color.white),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "T",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "25",
                        style = TextStyle(
                            color = colorResource(R.color.schedule_black_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(31.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "F",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "26",
                        style = TextStyle(
                            color = colorResource(R.color.schedule_black_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.width(32.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(57.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(color = Color.Transparent),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "S",
                        style = TextStyle(
                            color = colorResource(R.color.gray_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                    Text(
                        text = "27",
                        style = TextStyle(
                            color = colorResource(R.color.schedule_black_text),
                            fontSize = 12.sp,
                            fontFamily = AppFontFamily,
                            lineHeight = 12.sp,
                            fontWeight = FontWeight.Normal
                        )
                    )
                }
            }
        }
    }
}