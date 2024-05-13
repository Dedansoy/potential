package com.example.wazitoecommerce.ui.theme.screens.issues

import android.provider.SyncStateContract.Columns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IssuesScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray)
        ) {
        TopAppBar(title = {
            Text(text = "Select:",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                color = Color.Black)
        }
        )


       Row {
           //Card1
           Box {
               Card (modifier = Modifier
                   .padding(start = 20.dp, top = 100.dp)
                   .height(200.dp)
                   .width(150.dp),
                   onClick = {
                       navController.navigate("breakdown")
                   }
               ){
                   Image(painter = painterResource(id = R.drawable.help), contentDescription ="help", modifier = Modifier
                       .padding(start = 50.dp, top = 50.dp)
                       .size(60.dp) )
                   Spacer(modifier = Modifier.height(20.dp))
                   Text(
                       text = "Vehicle BreakDown",
                       modifier = Modifier.padding(start = 15.dp),
                       fontSize = 15.sp,
                       fontWeight = FontWeight.ExtraBold)
               }
           }
           //Card1end
           Spacer(modifier = Modifier.width(20.dp))

           //Card2
           Box {
               Card (modifier = Modifier
                   .padding(start = 20.dp, top = 100.dp)
                   .height(200.dp)
                   .width(150.dp),
                   onClick = {
                       navController.navigate("towing")
                   }
               ){
                   Image(painter = painterResource(id = R.drawable.help), contentDescription ="help", modifier = Modifier
                       .padding(start = 50.dp, top = 50.dp)
                       .size(60.dp) )
                   Spacer(modifier = Modifier.height(20.dp))
                   Text(
                       text = "Vehicle Towing",
                       modifier = Modifier.padding(start = 20.dp),
                       fontSize = 15.sp,
                       fontWeight = FontWeight.ExtraBold)

               }
           }
           //Card2end
       }


        Row {
            //Card3
            Box {
                Card (modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp)
                    .height(200.dp)
                    .width(150.dp),
                    onClick = {
                        navController.navigate("accident")
                    }
                ){
                    Image(painter = painterResource(id = R.drawable.help), contentDescription ="help", modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(60.dp) )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Road Accident",
                        modifier = Modifier.padding(start = 20.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)

                }
            }
            //Card3end

            Spacer(modifier = Modifier.width(20.dp))

            //Card4
            Box {
                Card (modifier = Modifier
                    .padding(start = 20.dp, top = 50.dp)
                    .height(200.dp)
                    .width(150.dp),
                    onClick = {
                        navController.navigate("services")
                    }
                ){
                    Image(painter = painterResource(id = R.drawable.help), contentDescription ="help", modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(60.dp) )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Vehicle Services",
                        modifier = Modifier.padding(start = 20.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                }

            }
            //Card4end
        }

    }

}
@Preview(showBackground = true)
@Composable
fun IssuesScreenPreview(){
    IssuesScreen(rememberNavController())
}