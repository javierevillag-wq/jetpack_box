package com.javi.jetpack_box

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.javi.jetpack_box.ui.theme.Jetpack_boxTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PruebaBox()
            Prueba2()
        }
    }
}

@Composable
fun PruebaBox(){
    Box(modifier = Modifier.fillMaxSize().padding(50.dp)) {
        Text(text = "Hola", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Hola", modifier = Modifier.align(Alignment.Center))
        Text(text = "Hola", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

@Preview(showBackground = true)
@Composable
fun Prueba2(){

        PruebaBox()
}
