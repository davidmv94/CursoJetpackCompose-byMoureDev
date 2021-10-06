package com.davidthar.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.davidthar.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyImage()
            MyTexts()
        }
    }
}

@Composable
fun MyImage(){
    Image(
        painterResource(id = R.drawable.ic_launcher_foreground),
        "Mi imagen de prueba"
    )
}


@Composable
fun MyComponent() {
    Row {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyTexts(){
    Column() {
        MyText(text = "¡Hola Jetpack Compose!")
        MyText(text = "¿Preparado?")
    }
}

@Composable
fun MyText(text: String){
    Text(text)
}

@Preview
@Composable
fun PreviewComponents(){
    MyComponent()
}