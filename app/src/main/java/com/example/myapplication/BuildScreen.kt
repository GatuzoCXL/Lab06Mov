package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BuildScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Empezar proyecto", style = MaterialTheme.typography.headlineMedium)

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Nombre del proyecto") },
            modifier = Modifier.fillMaxWidth()
        )

        DropdownMenu(
            expanded = false,
            onDismissRequest = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            DropdownMenuItem(
                text = { Text("Android App") },
                onClick = { }
            )
            DropdownMenuItem(
                text = { Text("iOS App") },
                onClick = { }
            )
            DropdownMenuItem(
                text = { Text("Web App") },
                onClick = { }
            )
        }

        Button(onClick = { /* Iniciar build */ }, modifier = Modifier.fillMaxWidth()) {
            Text("Empezar")
        }
    }
}