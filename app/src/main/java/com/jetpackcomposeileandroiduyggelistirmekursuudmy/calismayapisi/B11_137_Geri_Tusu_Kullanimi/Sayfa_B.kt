package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_137_Geri_Tusu_Kullanimi

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp

@Composable
fun Sayfa_B(){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Sayfa B", fontSize = 50.sp)
    }
    val activity= LocalContext.current as Activity
    BackHandler(onBack = {
        activity.finish()   // bu yapiyla sayfa b de iken geri tusuna bastigimizda
                            // uygulama kapanacak
    })


}