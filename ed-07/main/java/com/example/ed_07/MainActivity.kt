package com.example.ed_07

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.ed_07.ui.theme.Ed07Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ed07Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    GreetingPreview()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Ed07Theme {
        ed07()
    }
}
@Composable
fun ed07(){
    ConstraintLayout() {
        Image(painter = painterResource(id =R.drawable.fotinha ),
            contentDescription = null)
        Image(painter = painterResource(id =R.drawable.seta ),
            contentDescription = null)
        Image(painter = painterResource(id =R.drawable.circulo ),
            contentDescription = null)
        Text(text = "Lorempsum")

    }
}