package com.myfinal.littlelemon

import android.content.res.Resources.Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.myfinal.littlelemon.ui.theme.LittleLemonTheme

@Composable
fun OnBoarding(){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.logo),
            contentDescription = "Little Lemon Logo",
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp))

        Surface (color = MaterialTheme.colorScheme.surface) {
            Text(text = "Let's go to know you", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth().padding(25.dp))
        }

        Text(text = "Personal Information",
            modifier = Modifier.fillMaxWidth()
                .padding(25.dp),
            fontWeight = FontWeight.Bold)

    }
}

@Preview()
@Composable
fun OnBoardingPreview() {
    LittleLemonTheme {
        OnBoarding()
    }
}