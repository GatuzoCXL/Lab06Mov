package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.graphics.Color

@Composable
fun UserProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Perfil de usuario", style = MaterialTheme.typography.headlineMedium)

        //avatar
        Image(
            painter = painterResource(id = R.drawable.imagenejemplo2),
            contentDescription = "Foto perfil",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape),
            contentScale = ContentScale.Crop
        )

        Text("Vargas Leonardo", style = MaterialTheme.typography.titleLarge)
        Text("leonardo.vargas@stayhome.com", style = MaterialTheme.typography.bodyMedium)

        Divider()

        //info perfil
        ProfileInfoItem("Localización", "Pachacutec")
        ProfileInfoItem("Se unió", "Junio 1999")
        ProfileInfoItem("Proyectos", "5")

        Button(onClick = { /* Editar perfil */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Editar Perfil")
        }
    }
}

@Composable
fun ProfileInfoItem(label: String, value: String) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = label, style = MaterialTheme.typography.bodyMedium)
        Text(text = value, style = MaterialTheme.typography.bodyMedium)
    }
}