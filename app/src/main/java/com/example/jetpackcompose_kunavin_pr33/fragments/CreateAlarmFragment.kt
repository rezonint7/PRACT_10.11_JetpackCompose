package com.example.jetpackcompose_kunavin_pr33.fragments

import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcompose_kunavin_pr33.*
import com.example.jetpackcompose_kunavin_pr33.R
import com.example.jetpackcompose_kunavin_pr33.ui.theme.Green
import com.example.jetpackcompose_kunavin_pr33.ui.theme.LightGreen
import com.example.jetpackcompose_kunavin_pr33.ui.theme.Red

@Composable
fun CreateAlarmFragment(navController: NavController){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Green
    ) {
        Column() {
            GeneralActivityHead(navController ,"Добавить будильник", R.drawable.back_button, 28, 58, 18, navigateItem = NavigationItems.Alarm)
            Column(modifier = Modifier.size(428.dp, 598.dp), horizontalAlignment = Alignment.CenterHorizontally){
                Row(modifier = Modifier
                    .size(348.dp, 58.dp)
                    .padding(top = 8.dp)) {
                    AddTextFieldIcon(hint = "16:30", sizeWidth = 174.dp, sizeHeight = 48.dp, icon = R.drawable.alarm_icon, keyboardType = KeyboardType.Number)
                    Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                    AddTextFieldIcon(hint = "14.01.2021", sizeWidth = 174.dp, sizeHeight = 48.dp, icon = R.drawable.calendar_icon, keyboardType = KeyboardType.Number)
                }
                Row(modifier = Modifier
                    .size(348.dp, 338.dp)
                    .padding(top = 8.dp, bottom = 8.dp)) {
                    AddCheckBoxes(list = list)
                }
                AddButton(navController, "Создать будильник", LightGreen, 22, 58, NavigationItems.Alarm)
            }
        }
    }
}
