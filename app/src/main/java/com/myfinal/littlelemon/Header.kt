package com.myfinal.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Header() {
    Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Little Logo", modifier = Modifier.scale(0.7f)
            )

}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {

    Header()

}