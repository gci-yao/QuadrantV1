package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quadrant.ui.theme.QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    QuadrantScreen(
                        titleOne= stringResource(R.string.titleOne),descriptionOne = stringResource(
                            R.string.descriptionOne
                        ),
                        titleTwo= stringResource(R.string.titleTwo),descriptionTwo = stringResource(
                            R.string.descriptionTwo
                        ),
                        titleThree= stringResource(R.string.titleThree),descriptionThree = stringResource(R.string.descriptionThree),
                        titleFour= stringResource(R.string.titleFour),descriptionFour = stringResource(
                            R.string.descriptionFour
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun QuadrantScreen(titleOne: String,descriptionOne : String,titleTwo: String,descriptionTwo : String,titleThree: String,descriptionThree : String,titleFour: String,descriptionFour : String, modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 50.dp)) {
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFEADDFF))
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)  {
                Text(
                    text = titleOne,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp, bottom = 30.dp
                    ),
                    fontSize = 24.sp
                )
                Text(
                    text = descriptionOne,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    )
                )
            }
            Column(modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFD0BCFF))
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = titleTwo,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    ),
                    fontSize = 24.sp
                )
                Text(
                    text = descriptionTwo,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    )
                )
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFD0BCFF))
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = titleThree,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    ),
                    fontSize = 24.sp
                )
                Text(
                    text = descriptionThree,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    )
                )
            }
            Column(modifier = Modifier
                .fillMaxSize()
                .background(color = Color(0xFFF6EDFF))
                .weight(1f),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = titleFour,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    ),
                    fontSize = 24.sp,

                )
                Text(
                    text = descriptionFour,
                    modifier = Modifier.padding(
                        start = 16.dp, end = 16.dp,bottom = 30.dp
                    )
                )
            }
        }
    }
}





@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantTheme {
        QuadrantScreen(
            titleOne= stringResource(R.string.text_composable),descriptionOne = stringResource(R.string.contentOne),
            titleTwo= stringResource(R.string.image_composable),descriptionTwo = stringResource(R.string.contentTwo),
            titleThree= stringResource(R.string.row_composable),descriptionThree = stringResource(R.string.contentThree),
            titleFour= stringResource(R.string.column_composable),descriptionFour = stringResource(R.string.contentFour)
        )
    }
}