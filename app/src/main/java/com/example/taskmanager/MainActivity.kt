package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskManagerTheme {
                TaskManager()

            }
        }
    }
}
@Composable
fun TaskManager(){
    PrintCard(
        image = painterResource(id = R.drawable.ic_task_completed),
        message1 = stringResource(id = R.string.first_file),
        message2 = stringResource(id = R.string.second_file),

    )

}
@Composable
fun PrintCard(image: Painter, message1:String, message2:String ,modifier: Modifier=Modifier){
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =  Modifier
            .fillMaxSize()){
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = message1,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(top = 25.dp , bottom = 10.dp)
        )
        Text(
            text = message2,
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )

    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerTheme {
        TaskManager()
    }
}