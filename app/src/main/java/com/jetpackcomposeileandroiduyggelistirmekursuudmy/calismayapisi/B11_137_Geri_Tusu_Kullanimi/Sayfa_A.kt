package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_137_Geri_Tusu_Kullanimi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Sayfa_A(navController: NavController){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Sayfa A", fontSize = 50.sp)

        Button(onClick = {navController.navigate("SayfaB")  }) {
            Text(text = "Sayfa B ye git")
        }
    }
}