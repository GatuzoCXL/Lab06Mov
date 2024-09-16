package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MenuScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Menu", style = MaterialTheme.typography.headlineMedium)

        //menu
        Button(onClick = { /* Navegar a perfil */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Perfil")
        }
        Button(onClick = { /* Navegar a configuración */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Ajustes")
        }
        Button(onClick = { /* Navegar a ayuda */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Ayuda y Soporte")
        }
        Button(onClick = { /* Cerrar sesión */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Salir")
        }
    }
}