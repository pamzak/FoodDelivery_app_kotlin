package com.example.fooddelivery.ui.screen

import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.provider.FontsContractCompat.Columns

@Composable
fun ProDuctDetailsScreen(modifier: Modifier=Modifier){

val  scrollableState= rememberScrollState()
    Columns(
        modifier=modifier.verticalScroll(scrollableState)
    )
}


}