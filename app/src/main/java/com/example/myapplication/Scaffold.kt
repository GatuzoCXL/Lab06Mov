package com.example.myapplication

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Delete

@Composable
fun CustomScaffold(navController: NavHostController, count: Int, onFabClick: () -> Unit) {
    Scaffold(
        // Barra superior
        topBar = { CustomTopBar(navController) },

        // Barra inferior
        bottomBar = { CustomBottomBar(navController) },

        // Botón flotante personalizado
        floatingActionButton = { CustomFAB(onFabClick) },

        // Contenido principal
        content = { padding ->
            CustomContent(padding, count)
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTopBar(navController: NavHostController) {
    TopAppBar(
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Rounded.Menu, contentDescription = null)
            }
        },
        title = { Text(text = "Sample Title") },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null
                )
            }
            IconButton(onClick = { navController.navigate("profile") }) {
                Icon(
                    imageVector = Icons.Outlined.AccountCircle,
                    contentDescription = null
                )
            }
        }
    )
}

@Composable
fun CustomFAB(onFabClick: () -> Unit) {
    FloatingActionButton(
        onClick = onFabClick
    ) {
        Text(
            fontSize = 24.sp,
            text = "+"
        )
    }
}

@Composable
fun CustomContent(padding: PaddingValues, count: Int) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        Text(text = "My app content")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Button clicked $count times")
    }
}