package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_140_Yasam_Dongusu

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
fun SayfaA_YD(navController: NavController, gelenNesne: Kisiler_YD){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Sayfa A", fontSize = 50.sp)

        Text(text = gelenNesne.isim)
        Text(text = gelenNesne.yas.toString())
        Text(text = gelenNesne.boy.toString())
        Text(text = gelenNesne.bekarmi.toString())

        Button(onClick = {navController.navigate("SayfaB_YD")  {
            popUpTo("SayfaA_YD"){inclusive=true}
        }
        }) {
            Text(text = "Sayfa B ye git")
        }
    }
}