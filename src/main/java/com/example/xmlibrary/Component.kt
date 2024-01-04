package com.example.xmlibrary

import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun XMButton() {
    val context = LocalContext.current
    Button(
        onClick = {
            Toast.makeText(
                context,
                "Mensaje desde el componente compartido",
                Toast.LENGTH_SHORT
            ).show()
        }
    ) {
        Text(text = "Library Button")
    }
}