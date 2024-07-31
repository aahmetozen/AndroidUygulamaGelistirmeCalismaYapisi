package com.jetpackcomposeileandroiduyggelistirmekursuudmy.calismayapisi.B11_140_Yasam_Dongusu

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
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

/* Yaşam döngüsü uygulama sayfasının çalışmasını takip ettiğimiz metodlardır.
• LaunchEffect,SideEffect , DisposableEffect olmak üzere çeşitli metodlar yer almaktadır.
• LaunchedEffect   : Sayfa her görüntülendiğinde ( Uygulama sayfası ilk kez
açıldığında veya başka sayfadan geri gelindiğinde ) bir kere çalışır.
• SideEffect    : Sayfa görüntülendiğinde ( Uygulama sayfası ilk kez
açıldığında veya başka sayfadan geri gelindiğinde ) ve arayüz state ile her
yenilendiğinde çalışır.
• DisposableEffect   : Sayfadan ayrıldığımızda çalışır.Örnek : Geri tuşu ile
uygulamadan çıkma veya başka bir sayfaya geçerken sayfadan ayrıldığımızda çalışır.
 */

@Composable
fun SAVT_YD(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "anasayfaYD") {
        composable("anasayfaYD"){
            anasayfaYD(navController = navController)
        }
        composable("SayfaA_YD/{nesne}",
            arguments = listOf(
                navArgument("nesne"){type= NavType.StringType},


                )){
            val json=it.arguments?.getString("nesne")
            val nesne= Gson().fromJson(json, Kisiler_YD::class.java)

            SayfaA_YD(navController = navController,nesne)
        }
        composable("SayfaB_YD"){
            SayfaB_YD()
        }
    }
}

@Composable
fun anasayfaYD(navController: NavController){
    val sayac= remember { mutableStateOf(0) }
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Anasayfa", fontSize = 50.sp)

        Text(text = "sayac:${sayac.value}")

        Button(onClick = { sayac.value+=1 }) {
            Text(text = "Tikla")
        }

        Button(onClick = {
            val kisi= Kisiler_YD("ahmet",18,1.78f,true)
            val kisijson= Gson().toJson(kisi)
            navController.navigate("SayfaA_YD/$kisijson")  }) {
            Text(text = "Sayfa A ya git")
        }
    }
    // konsolda calismasini gorup test etmek icin
    LaunchedEffect(key1 = true) {
        Log.e("AnasayfaYD","LaunchedEffect calisti")
    }
    SideEffect {
        Log.e("AnasayfaYD","SideEffect calisti")
    }
    DisposableEffect(Unit) {
        onDispose {
            Log.e("AnasayfaYD","DisposableEffect calisti")
        }
    }
}

@Preview
@Composable
fun SAVT_YDpreview(){
    SAVT_YD()
}