package com.max_grank.schooldiaryapp.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.max_grank.schooldiaryapp.R

//Start 16:22

@Composable
@Preview(showBackground = true)
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(359.dp)
                .background(
                    color = colorResource(R.color.main_screen_bg)
                )
        ) {
            Box(
                modifier = Modifier
                    .padding(start = 28.dp, top = 44.dp)
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
            Box(
                modifier = Modifier
                    .padding(
                        top = 196.dp,
                        start = 129.dp
                    )
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.flowers1
                    ),
                    contentDescription = "vector",
                    modifier = Modifier
                        .size(94.dp, 70.dp)
                )
            }
            Box(
                modifier = Modifier
                    .padding(
                        top = 107.dp,
                        start = 141.dp
                    )
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.flowers2
                    ),
                    contentDescription = "vector",
                    modifier = Modifier
                        .size(
                            134.dp,
                            110.dp
                        )
                )
            }
            Box(
                modifier = Modifier
                    .padding(
                        top = 52.dp,
                        start = 214.dp
                    )
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.flowers3
                    ),
                    contentDescription = "vector",
                    modifier = Modifier
                        .size(
                            69.dp,
                            201.dp
                        )
                        .rotate(-0.47f)
                )
            }
            Box(
                modifier = Modifier
                    .padding(
                        top = 112.dp,
                        start = 284.dp
                    )
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.flowers4
                    ),
                    contentDescription = "vector",
                    modifier = Modifier
                        .size(
                            62.dp,
                            59.dp
                        )
                        .rotate(-0.47f)
                )
            }
            Box(
                modifier = Modifier
                    .padding(
                        top = 107.dp,
                        start = 310.dp
                    )
            ) {
                Image(
                    painter = painterResource(
                        R.drawable.flowers7
                    ),
                    contentDescription = "vector",
                    modifier = Modifier
                        .size(
                            88.dp,
                            184.dp
                        )
                        .rotate(-1.09f)
                )
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 306.dp)
        ) {
            SubjectCard()
        }
        Box(
            modifier = Modifier
                .padding(
                    top = 120.dp,
                    start = 184.dp
                )
        ) {
            Image(
                painter = painterResource(
                    R.drawable.globus
                ),
                contentDescription = "vector",
                modifier = Modifier
                    .size(299.dp, 210.dp)
            )
        }
    }
}