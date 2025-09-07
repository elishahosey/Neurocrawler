package com.example.neurocrawler.ui.theme

import android.graphics.drawable.Icon
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

//TODO: Add in the layout for the controller
@Composable
fun ControllerUI(){
    DirectionButton(
        icon = Icons.Filled.KeyboardArrowUp,
        contentDescription = "Up",
        onClick = { /* handle up */ }
    )

    DirectionButton(
        icon = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
        contentDescription = "Left",
        onClick = { /* handle left */ }
    )

    DirectionButton(
        icon = Icons.AutoMirrored.Filled.KeyboardArrowRight,
        contentDescription = "Right",
        onClick = { /* handle right */ }
    )

    DirectionButton(
        icon = Icons.Filled.KeyboardArrowDown,
        contentDescription = "Down",
        onClick = { /* handle down */ }
    )
}


@Composable
fun DirectionButton(
    icon: ImageVector,
    contentDescription: String,
    onClick: () -> Unit
) {
    LargeFloatingActionButton(
        onClick = onClick,
        shape = CircleShape
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ControllerUiPreview(){
    ControllerUI()
}

