package com.example.jetpackcompose_kunavin_pr33.fragments_bottom_menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.jetpackcompose_kunavin_pr33.*
import com.example.jetpackcompose_kunavin_pr33.ui.theme.Green
import com.example.jetpackcompose_kunavin_pr33.ui.theme.LightGreen

@Composable
fun AlarmFragment(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(Modifier.background(Green), verticalArrangement = Arrangement.SpaceBetween) {
            GeneralActivityHead("Будильник")
            AddSwitch(time = "07:30")
            AddSwitch(time = "08:00")
            AddButton(name = "Добавить будильник", color = LightGreen, textSize = 22, paddingTop = 68)
        }
    }
}