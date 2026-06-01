package com.max_grank.schooldiaryapp.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomMenu(
    selectedItem: Int,
    onItemClick: (Int) -> Unit
) {

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Schedule,
        BottomNavItem.Comment,
        BottomNavItem.User
    )

    NavigationBar(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        items.forEach { item ->
            NavigationBarItem(
                selected = item.icon == selectedItem,
                onClick = { onItemClick(item.icon) },
                icon = {
                    Icon(
                        painterResource(item.icon),
                        contentDescription = null,
                        modifier = Modifier
                            .size(24.dp)
                    )
                }
            )
        }
    }
}