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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun sayfagecis(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Anasayfa") {
        composable("Anasayfa"){
            Anasayfa(navController = navController)
        }
        composable("SayfaA"){
            Sayfa_A(navController = navController)
        }
        composable("SayfaB"){
            Sayfa_B()
        }
    }
}

@Composable
fun Anasayfa(navController: NavController){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Anasayfa", fontSize = 50.sp)

        Button(onClick = {navController.navigate("SayfaA")  }) {
            Text(text = "Sayfa A ya git")
        }
    }
}

@Preview
@Composable
fun Anasayfapreview(){
    sayfagecis()
}