package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun DeleteScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Eliminar", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Selecciona elementos a eliminar:", style = MaterialTheme.typography.bodyLarge)

        //lista de elementos para eliminar estatioco
        repeat(5) { index ->
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(checked = false, onCheckedChange = {})
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Elemento ${index + 1}")
            }
        }

        Button(onClick = { /* Lógica para eliminar */ }) {
            Text("Eliminar elementos seleccionados")
        }
    }
}