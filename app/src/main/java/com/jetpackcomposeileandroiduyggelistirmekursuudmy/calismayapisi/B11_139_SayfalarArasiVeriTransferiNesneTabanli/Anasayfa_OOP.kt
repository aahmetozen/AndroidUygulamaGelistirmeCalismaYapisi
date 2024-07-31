package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_139_SayfalarArasiVeriTransferiNesneTabanli

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
import com.google.gson.Gson
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_138_Sayfalar_Arasi_Veri_Transferi.Sayfa_A_SAVT
import com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_138_Sayfalar_Arasi_Veri_Transferi.Sayfa_B_SAVT

// nesne transferini nesne tabanli yapiya uygun sekilde gerceklestirecegiz
@Composable
fun SAVT_OOP(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfaOOP") {
        composable("anasayfaOOP"){
            anasayfaOOP(navController = navController)
        }
        composable("Sayfa_A_OOP/{nesne}",
            arguments = listOf(
                navArgument("nesne"){type= NavType.StringType},


            )){
            val json=it.arguments?.getString("nesne")
            val nesne=Gson().fromJson(json,Kisiler::class.java)

            Sayfa_A_OOP(navController = navController,nesne)
        }
        composable("Sayfa_B_OOP"){
            Sayfa_B_OOP()
        }
    }
}

@Composable
fun anasayfaOOP(navController: NavController){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Anasayfa", fontSize = 50.sp)

        Button(onClick = {
            val kisi=Kisiler("ahmet",18,1.78f,true)
            val kisijson=Gson().toJson(kisi)
            navController.navigate("Sayfa_A_OOP/$kisijson")  }) {
            Text(text = "Sayfa A ya git")
        }
    }
}

@Preview
@Composable
fun SAVT_OOPpreview(){
    SAVT_OOP()
}