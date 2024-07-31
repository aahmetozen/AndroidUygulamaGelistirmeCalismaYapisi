package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_135_Sayfalar_Arasi_Gecis

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
fun sayfagecisleri(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfa") {
        composable("anasayfa"){
            anasayfa(navController = navController)
        }
        composable("sayfa_a"){
            SayfaA(navController = navController)
        }
        composable("sayfa_b"){
            SayfaB()
        }
    }
}

@Composable
fun anasayfa(navController: NavController){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Anasayfa", fontSize = 50.sp)

        Button(onClick = {navController.navigate("sayfa_a")  }) {
            Text(text = "Sayfa A ya git")
        }
    }
}

@Preview
@Composable
fun anasayfapreview(){
    sayfagecisleri()
}