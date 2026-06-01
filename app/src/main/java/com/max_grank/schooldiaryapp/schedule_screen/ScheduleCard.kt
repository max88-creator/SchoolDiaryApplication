package com.max_grank.schooldiaryapp.schedule_screen

import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun ScheduleCard() {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(10.dp))
            .verticalScroll(
                state = rememberScrollState(),
                enabled = true,
                flingBehavior = ScrollableDefaults.flingBehavior()
            )
    ) {
        Spacer(modifier = Modifier.height(7.dp))
        CalendarImage()
        Spacer(modifier = Modifier.height(20.dp))
        LessonsSchedule()
    }
}
