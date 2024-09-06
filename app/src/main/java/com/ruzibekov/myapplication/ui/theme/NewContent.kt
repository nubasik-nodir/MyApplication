package com.ruzibekov.myapplication.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun NewContent(modifier: Modifier = Modifier) {
    androidx.compose.material.Scaffold(modifier = Modifier, backgroundColor = Color(
        213341
    ), topBar = {
        Column(
            modifier = Modifier
                .background(Color(0xFF06141B))
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, bottom = 4.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Add",
                modifier = Modifier.padding(top = 24.dp, bottom = 16.dp),
                color = Color.White,
                fontSize = 24.sp
            )
        }
    }
    ) { interPadding ->

            Column{
                val textState = remember { mutableStateOf("") }
                TextField(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                        .height(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    value = textState.value,
                    onValueChange = { newText ->
                        textState.value = newText
                    },
                    label = {
                        Text("Translate",
                            color = Color.Gray,
                            modifier =Modifier
                                .padding(top=3.dp) )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.DarkGray,
                        unfocusedIndicatorColor = Color.Unspecified,
                        focusedIndicatorColor =Color.White
                    )
                )

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(interPadding )
                ) {
                    Card(
                        colors = CardDefaults.cardColors(containerColor = Color.DarkGray),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(15.dp),
                        elevation = CardDefaults.cardElevation(5.dp)
                    ) {

                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxHeight()
                        ) {
                            Column(
                                modifier = Modifier
                                    .padding(start = 16.dp)
                            ) {
                                Text(text = "Words...", color = Color.Gray)
                            }

                        }
                    }

                }
            }

        }
    }


@Preview
@Composable
private fun NewContentPreiew() {
    NewContent()
}