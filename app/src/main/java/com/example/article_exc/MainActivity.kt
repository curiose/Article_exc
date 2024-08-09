package com.example.article_exc

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.style.TextAlign.Companion.Justify
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article_exc.ui.theme.Article_excTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Article_excTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    ComposeArticleImage(
                        title = stringResource(R.string.title),
                        text_1 = stringResource(R.string.text_1),
                        text_2 = stringResource(R.string.text_2),
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeArticleText(
    title: String,
    text_1: String,
    text_2: String,
    modifier: Modifier = Modifier
) {
    Column {
        Text(
            text = title,
            fontSize = 24.sp,
        )
        Text(
            text = text_1,
        )
        Text(
            text = text_2,
        )
    }
}

@Composable
fun ComposeArticleImage(
    title: String,
    text_1: String,
    text_2: String,
    modifier: Modifier = Modifier,
    padding: Dp = 16.dp
) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = title,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = text_1,
            modifier = Modifier.padding(start = padding, end = padding),
            textAlign = Justify,
        )
        Text(
            text = text_2,
            modifier = Modifier
                .padding(16.dp),
            textAlign = Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Article_excTheme {
        ComposeArticleImage(
            title = stringResource(R.string.title),
            text_1 = stringResource(R.string.text_1),
            text_2 = stringResource(R.string.text_2)
        )
    }
}