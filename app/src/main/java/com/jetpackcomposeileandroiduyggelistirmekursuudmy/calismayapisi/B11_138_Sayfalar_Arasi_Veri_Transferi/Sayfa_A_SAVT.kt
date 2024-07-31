package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_138_Sayfalar_Arasi_Veri_Transferi

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
//hangi sayfaya veri gondereceksek verileri o sayfada belirtmeliyiz
@Composable
fun Sayfa_A_SAVT(navController: NavController,gelenisim:String,gelenyas:Int,gelenboy:Float,gelenbekarmi:Boolean){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Sayfa A", fontSize = 50.sp)

        Text(text = gelenisim)
        Text(text = gelenyas.toString())
        Text(text = gelenboy.toString())
        Text(text = gelenbekarmi.toString())

        Button(onClick = {navController.navigate("Sayfa_B_SAVT")  {
            popUpTo("Sayfa_A_SAVT"){inclusive=true}
        }
        }) {
            Text(text = "Sayfa B ye git")
        }
    }
}