package com.ruzibekov.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.movableContentOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    androidx.compose.material.Scaffold(
        modifier = Modifier,
        backgroundColor = Color(
            213341
        ),
        topBar = {
            Column(
                modifier = Modifier
                    .background(Color(0xFF06141B))
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Text(
                    text = "HOME",
                    modifier = Modifier.padding(top = 24.dp, bottom = 16.dp),
                    color = Color.White,
                    fontSize = 24.sp
                )

                Card(
                    shape = RoundedCornerShape(15.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF4A5C6A))
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        contentAlignment = Alignment.TopStart
                    ) {


                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(15.dp)
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(18.dp),
                                painter = painterResource(id = R.drawable.vectorpoisk),
                                contentDescription = "vectorpoisk",
                                tint = Color.White


                            )
                            Spacer(modifier = Modifier.width(15.dp))
                            Text(text = "Search", color = Color.White)
                        }
                    }
                }
            }

        },

        bottomBar = {
            androidx.compose.material.BottomAppBar(
                contentPadding = PaddingValues(horizontal = 62.dp),
                modifier = Modifier,
                backgroundColor = Color(0xFF06141B),


                ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                ) {
                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 50.dp)
                            .size(18.dp),
                        painter = painterResource(id = R.drawable.vectorhomevektor),

                        contentDescription = "vektorhome",
                        tint = Color.White
                    )
                    Icon(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 50.dp)
                            .size(18.dp),
                        painter = painterResource(id = R.drawable.vectorbrain),
                        contentDescription = "vektorbrain",
                        tint = Color.White
                    )
                }


            }

        },
        floatingActionButton = {
            Box(
                modifier = Modifier
                    .size(54.dp)
                    .clip(CircleShape)
                    .background(Color.Black),
                contentAlignment = Alignment.Center

            ) {
                Text(
                    text = "+",
                    color = Color.White,
                    fontSize = 30.sp
                )
            }
        },
        floatingActionButtonPosition = androidx.compose.material.FabPosition.Center,
        isFloatingActionButtonDocked = true,
    )
    { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                        .fillMaxSize()
                ) {
                    Column(
                        modifier = Modifier
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
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
                            .weight(6f)
                            .padding(start = 16.dp)
                    ) {
                        Text(text = "Apple", color = Color.White)
                        Text(text = "Olma", color = Color.White, fontSize = 10.sp)
                    }
                    Icon(
                        modifier = Modifier
                            .weight(1f),
                        painter = painterResource(id = R.drawable.glyph__undefinedsound_icon),
                        contentDescription = "glyph",
                        tint = Color.White,


                        )

                }


            }
        }
    }
}

@Preview
@Composable
private fun MainContentPreview() {
    MainContent()
}
