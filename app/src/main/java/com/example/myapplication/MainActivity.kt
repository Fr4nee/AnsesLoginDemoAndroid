package com.example.myapplication

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MiAnsesView("")
                }
            }
        }
    }
}

@Composable
fun MiAnsesView(name: String, modifier: Modifier = Modifier) {

    Column (modifier.padding(horizontal = 50.dp, vertical = 20.dp )) {
        Text(
            text = "Hola Putooo",
            modifier = modifier
        )
        Row {
            Text (
                text = "Ingresá a tu cuenta",
                modifier = modifier,
            )
            Spacer(modifier = modifier.weight(1f))
            Text (
                text = "Cambiar la contraseña",
                modifier = modifier,
            )
        }
        TextField(
            value = "Clave de seguridad social",
            onValueChange = {},
            modifier =
            modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
        )
        Button(
            onClick = {},
            modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
                .width(200.dp)
        ) {
            Text(
                text = "Ingresar"
            )

        }

        Text(
            text = "Olvidé mi clave",
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        )

        Divider(modifier.padding(vertical = 30.dp),thickness = 2.dp, color = Color.Gray)

        Text(
            text = "Usá tu huella digital",
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        )

        Spacer(modifier = modifier.height(20.dp))

        Icon(
            imageVector = Icons.Filled.Face, contentDescription = "Icono de huella digital",
            modifier = modifier
                .align(Alignment.CenterHorizontally)
                .size(80.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        MiAnsesView("")
    }
}