package com.max_grank.schooldiaryapp.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.schooldiaryapp.R

@Composable
@Preview(showBackground = true)
fun LessonCard() {
    Box(
        modifier = Modifier
            .width(149.dp)
            .height(119.dp)
    ) {
        // Карточка — основа
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = colorResource(R.color.math_bg))
            ) {
                // Иконка в левом верхнем углу
                Image(
                    painter = painterResource(R.drawable.square_math_formula),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.TopStart)
                        .padding(start = 16.dp, top = 16.dp)
                )
            }
        }

        // Большая картинка — выходит за пределы Card
        Image(
            painter = painterResource(R.drawable.mask_group),
            contentDescription = null,
            modifier = Modifier
                .width(122.dp)
                .height(146.dp)
                .align(Alignment.TopEnd) // правый верхний угол
                .offset(y = -30.dp) // сдвигаем вверх, чтобы часть выходила за Card
        )
    }
}