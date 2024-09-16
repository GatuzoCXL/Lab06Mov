package com.example.myapplication

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Delete

@Composable
fun CustomBottomBar(navController: NavHostController) {
    BottomAppBar {
        IconButton(onClick = { navController.navigate("build") }) {
            Icon(Icons.Filled.Build, contentDescription = "Build description")
        }
        Spacer(modifier = Modifier.weight(1f, fill = true))
        IconButton(onClick = { navController.navigate("menu") }) {
            Icon(Icons.Filled.Menu, contentDescription = "Menu description")
        }
        Spacer(modifier = Modifier.weight(1f, fill = true))
        IconButton(onClick = { navController.navigate("favorite") }) {
            Icon(Icons.Filled.Favorite, contentDescription = "Favorite description")
        }
        Spacer(modifier = Modifier.weight(1f, fill = true))
        IconButton(onClick = { navController.navigate("delete") }) {
            Icon(Icons.Filled.Delete, contentDescription = "Delete description")
        }
    }
}