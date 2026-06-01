package com.max_grank.schooldiaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.max_grank.schooldiaryapp.home_screen.HomeScreen
import com.max_grank.schooldiaryapp.home_screen.SubjectCard
import com.max_grank.schooldiaryapp.message_screen.MessageScreen
import com.max_grank.schooldiaryapp.person_screen.PersonScreen
import com.max_grank.schooldiaryapp.schedule_screen.ScheduleScreen
import com.max_grank.schooldiaryapp.ui.theme.SchoolDiaryAppTheme
import com.max_grank.schooldiaryapp.utils.BottomMenu
import com.max_grank.schooldiaryapp.utils.BottomNavItem
import com.max_grank.schooldiaryapp.utils.data.HomeScreenNavData
import com.max_grank.schooldiaryapp.utils.data.MessageScreenNavData
import com.max_grank.schooldiaryapp.utils.data.PersonScreenNavData
import com.max_grank.schooldiaryapp.utils.data.ScheduleScreenNavData

//Start 12:52
//Paused 13:23
//Resumed 15:18
//Paused 15:53
//Resumed 17:23
//Finished 17:58
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            val selected by remember { mutableIntStateOf(0) }
            SchoolDiaryAppTheme {
                Scaffold(
                    bottomBar = {
                        BottomMenu(selected) {selectedItemIcon ->
                            when (selectedItemIcon) {
                                BottomNavItem.Home.icon ->
                                    navController.navigate(HomeScreenNavData)
                                BottomNavItem.Schedule.icon ->
                                    navController.navigate(ScheduleScreenNavData)
                                BottomNavItem.Comment.icon ->
                                    navController.navigate(MessageScreenNavData)
                                BottomNavItem.User.icon ->
                                    navController.navigate(PersonScreenNavData)
                            }
                        }
                    }
                ) { paddingValues ->
                    NavHost(
                        navController = navController,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValues),
                        startDestination = HomeScreenNavData
                    ) {
                        composable<HomeScreenNavData> { HomeScreen() }
                        composable<ScheduleScreenNavData> { ScheduleScreen() }
                        composable<MessageScreenNavData> { MessageScreen() }
                        composable<PersonScreenNavData> { PersonScreen() }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SchoolDiaryAppTheme {
        Greeting("Android")
    }
}