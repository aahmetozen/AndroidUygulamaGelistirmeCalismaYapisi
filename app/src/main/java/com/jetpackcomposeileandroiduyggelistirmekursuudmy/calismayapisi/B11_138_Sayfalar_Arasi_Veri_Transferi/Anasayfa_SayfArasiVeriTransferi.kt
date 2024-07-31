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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun SAVT(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfaSAVT") {
        composable("anasayfaSAVT"){
            anasayfaSAVT(navController = navController)
        }
        composable("Sayfa_A_SAVT/{isim}/{yas}/{boy}/{bekarMi}",
            arguments = listOf(
                navArgument("isim"){type= NavType.StringType},
                navArgument("yas"){type= NavType.IntType},
                navArgument("boy"){type= NavType.FloatType},
                navArgument("bekarMi"){type= NavType.BoolType}

                )){
            val isim=it.arguments?.getString("isim")!!
            val yas=it.arguments?.getInt("yas")!!
            val boy=it.arguments?.getFloat("boy")!!
            val bekarMi=it.arguments?.getBoolean("bekarMi")!!

            Sayfa_A_SAVT(navController = navController,isim,yas,boy,bekarMi)
        }
        composable("Sayfa_B_SAVT"){
            Sayfa_B_SAVT()
        }
    }
}

@Composable
fun anasayfaSAVT(navController: NavController){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Anasayfa", fontSize = 50.sp)

        Button(onClick = {navController.navigate("Sayfa_A_SAVT/Ahmet/22/1.87f/true")  }) {
            Text(text = "Sayfa A ya git")
        }
    }
}

@Preview
@Composable
fun SAVTpreview(){
    SAVT()
}