package com.example.unit1_pathway3_d121211029

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unit1_pathway3_d121211029.ui.theme.Unit1pathway3D121211029Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Unit1pathway3D121211029Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BussinessCard(
                        name = "Gusti Ngurah Adhi Astika",
                        title = "Android Enjoyer",
                        phoneNumber = "082 345 678 910",
                        socialMedia = "@adhiastika0",
                        emailName = "adhiastika19@gmail.com"
                    )
                }
            }
        }
    }
}


@Composable
fun BussinessCard (
    name: String,
    title: String,
    phoneNumber: String,
    socialMedia: String,
    emailName: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = Modifier.background(Color(0xFF222222)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = modifier.padding(8.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = modifier
            ) {
                Logo()
                Text(
                    text = name,
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontSize = 25.sp,
                    lineHeight = 20.sp,

                    )
                Text(
                    text = title,
                    color = Color.White
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier.padding(top = 150.dp)
            ) {

                Divider(
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(1f).height(1.dp)
                )

                Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(5.dp)) {
                    val phone = painterResource(id = R.drawable.baseline_call_white_18)
                    Icon(
                        painter = phone,
                        contentDescription = "Phone Logo",
                        tint = Color.White
                    )

                    Text(
                        text = phoneNumber,
                        color = Color.White
                    )
                }

                Divider(
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(1f).height(1.dp)
                )

                Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(5.dp)) {
                    val share = painterResource(id = R.drawable.baseline_share_24)
                    Icon(
                        painter = share,
                        contentDescription = "Share Logo",
                        tint = Color.White
                    )

                    Text(
                        text = socialMedia,
                        color = Color.White
                    )
                }

                Divider(
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(1f).height(1.dp)
                )

                Row(horizontalArrangement = Arrangement.spacedBy(10.dp), modifier = Modifier.padding(5.dp)) {
                    val email = painterResource(id = R.drawable.baseline_email_24)
                    Icon(
                        painter = email,
                        contentDescription = "Email Logo",
                        tint = Color.White
                    )

                    Text(
                        text = emailName,
                        color = Color.White
                    )
                }
                Divider(
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(1f).height(1.dp)
                )

            }
        }
    }

}

@Composable
fun Logo(){
    val image = painterResource(R.drawable.android_logo)

    Image(
        painter = image,
        contentDescription = "Android Logo",
        modifier = Modifier.size(150.dp)
    )
}

@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    Unit1pathway3D121211029Theme {
        BussinessCard(
            name = "Gusti Ngurah Adhi Astika",
            title = "Android Enjoyer",
            phoneNumber = "082 345 678 910",
            socialMedia = "@adhiastika0",
            emailName = "adhiastika19@gmail.com"
        )
    }
}