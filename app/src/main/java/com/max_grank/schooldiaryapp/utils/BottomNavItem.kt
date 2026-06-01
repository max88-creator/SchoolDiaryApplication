package com.max_grank.schooldiaryapp.utils

import com.max_grank.schooldiaryapp.R

sealed class BottomNavItem(
    val icon: Int
) {
    data object Home: BottomNavItem(icon = R.drawable.outline_home_24)
    data object Schedule: BottomNavItem(icon = R.drawable.notes)
    data object Comment: BottomNavItem(icon = R.drawable.comment)
    data object User: BottomNavItem(icon = R.drawable.user)
}