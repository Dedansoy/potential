package com.example.wazitoecommerce.ui.theme.screens.towing

import android.content.Intent
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TowingScreen(navController: NavController){
    val mContext = LocalContext.current
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
    ) {
        TopAppBar(title = {
            Text(text = "Near Towing Centers:",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                color = Color.Black)
        }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Towing Services:", fontSize = 30.sp, fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            //Card1
            Box {
                Card (modifier = Modifier
                    .padding(start = 20.dp, top = 100.dp)
                    .height(200.dp)
                    .width(150.dp),
                    onClick = {
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0720853233".toUri()
                        mContext.startActivity(callIntent)


                    }
                ){
                    Image(painter = painterResource(id = R.drawable.tow1), contentDescription ="help", modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(60.dp) )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "AutoRun Towing",
                        modifier = Modifier.padding(start = 15.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                    Text(text = "Nairobi",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.padding(start = 40.dp))
                    Text(text = "Call:0720853233",
                        Modifier.padding(start = 15.dp),
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
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0742015177".toUri()
                        mContext.startActivity(callIntent)


                    }
                ){
                    Image(painter = painterResource(id = R.drawable.tow2), contentDescription ="help", modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(60.dp) )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Rosselot Towing",
                        modifier = Modifier.padding(start = 20.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                    Text(text = "Nairobi",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.padding(start = 30.dp))
                    Text(text = "Call:0742015177",
                        Modifier.padding(start = 15.dp),
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
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0706600555".toUri()
                        mContext.startActivity(callIntent)


                    }
                ){
                    Image(painter = painterResource(id = R.drawable.tow3), contentDescription ="help", modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(60.dp) )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Elite Towing ",
                        modifier = Modifier.padding(start = 20.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                    Text(text = "Nairobi",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.padding(start = 30.dp))
                    Text(text = "Call:0706600555",
                        Modifier.padding(start = 15.dp),
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
                        val callIntent= Intent(Intent.ACTION_DIAL)
                        callIntent.data="tel:0731909909".toUri()
                        mContext.startActivity(callIntent)


                    }
                    ){
                    Image(painter = painterResource(id = R.drawable.tow4), contentDescription ="help", modifier = Modifier
                        .padding(start = 50.dp, top = 50.dp)
                        .size(60.dp) )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Auto Movers ",
                        modifier = Modifier.padding(start = 20.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                    Text(text = "Nairobi",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Black,
                        modifier = Modifier.padding(start = 30.dp))
                    Text(text = "Call:0731909909",
                        Modifier.padding(start = 15.dp),
                        fontSize = 15.sp,
                        fontWeight = FontWeight.ExtraBold)
                }
            }
            //Card4end
        }
    }
}
@Preview
@Composable
fun TowingScreenPreview(){
    TowingScreen(rememberNavController())

}