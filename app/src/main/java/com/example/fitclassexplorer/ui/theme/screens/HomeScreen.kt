package com.example.fitclassexplorer.ui.theme.screens


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.DirectionsBike
import androidx.compose.material.icons.automirrored.filled.DirectionsWalk
import androidx.compose.material.icons.automirrored.filled.ShowChart
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.DirectionsBike
import androidx.compose.material.icons.filled.DirectionsWalk
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MonitorWeight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material.icons.filled.SelfImprovement
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.ShowChart
import androidx.compose.material.icons.filled.WaterDrop
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.fitclassexplorer.R
import com.example.fitclassexplorer.data.Promotion
import com.example.fitclassexplorer.data.QuickAction
import com.example.fitclassexplorer.ui.theme.PurpleGrey40


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    val promotions = listOf(
        Promotion("No pain, no gain", R.drawable.ic_launcher_foreground ),
        Promotion("Push harder than yesterday.", R.drawable.ic_launcher_foreground),
        Promotion("Train insane or remain the same.", R.drawable.ic_launcher_foreground),
        Promotion("Your body can stand almost anything.", R.drawable.ic_launcher_foreground),
        Promotion("Dont't limit your challenges.", R.drawable.ic_launcher_foreground),
        Promotion("Excuses don't burn calories.", R.drawable.ic_launcher_foreground),
        Promotion("Make sweat your best accessory.", R.drawable.ic_launcher_foreground),
        Promotion("Be stronger than your excuses.", R.drawable.ic_launcher_foreground),
        Promotion("Discipline = Freedom.", R.drawable.ic_launcher_foreground),
        Promotion("Work hard in silence, let success be your noise.", R.drawable.ic_launcher_foreground)
    )


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "FitLife",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black,
                            textAlign = TextAlign.Center
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Default.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.Notifications, contentDescription = "Notifications")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
        ) {
            Text(
                text = "Good Morning, Waseem!",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))

            //Next Workout Card
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1976D2)),
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        "Next Workout",
                        color = Color.White,
                        fontSize = 14.sp
                    )
                    Text(
                        "Full Body Stretch",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        color = Color.White
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 8.dp, bottom = 16.dp)
                    ) {
                        Icon(
                            Icons.Default.Schedule,
                            contentDescription = "Duration",
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text("Duration: 20 mins", color = Color.White)
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        shape = RoundedCornerShape(4.dp)
                    ) {
                        Text(
                            "Start Workout",
                            color = PurpleGrey40,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            QuickActionRow(navController = navController)

            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(promotions) { promo ->
                     PromotionCard(promotion = promo)
                }
            }

            Text(
                text = "“Push yourself because no one else is going to do it for you.”",
                fontStyle = FontStyle.Italic,
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
    }
}

@Composable
fun QuickAccessButton(
    action: QuickAction,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .width(80.dp)
            .clickable(onClick = action.onClick)
            .padding(8.dp)
    ) {
        Surface(
            shape = CircleShape,
            color = Color(0xFFF0F0F0),
            shadowElevation = 4.dp
        ) {
            Box(
                modifier = Modifier.size(56.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(action.icon, contentDescription = action.title, tint = Color(0xFF1976D2))
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = action.title,
            fontSize = 12.sp,
            maxLines = 1
        )
    }
}

@Composable
fun QuickActionRow(navController: NavHostController) {
    val actions = listOf(
        QuickAction("Workouts",Icons.Filled.FitnessCenter) {navController.navigate("workoutList")},
        QuickAction("Nutrition", Icons.Filled.Favorite) {},
        QuickAction("Progress", Icons.AutoMirrored.Filled.ShowChart) {},
        QuickAction("Water", Icons.Filled.WaterDrop) {},
        QuickAction("Sleep",Icons.Filled.Bedtime) {},
        QuickAction("Steps", Icons.AutoMirrored.Filled.DirectionsWalk) {},
        QuickAction("Weight", Icons.Filled.MonitorWeight) {},
        QuickAction("Yoga", Icons.Filled.SelfImprovement) {},
        QuickAction("HIIT", Icons.Filled.Whatshot) {},
        QuickAction("Cycling", Icons.AutoMirrored.Filled.DirectionsBike) {}
    )

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        contentPadding = PaddingValues(horizontal = 16.dp)
    ) {
        items(actions) { action ->
            QuickAccessButton(action)
        }
    }
}

@Composable
fun PromotionCard(promotion: Promotion) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column {
            Image(
               painter = painterResource(id = promotion.imageRes) ,
                contentDescription = "Promotion Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .clip(RoundedCornerShape(topStart = 12.dp, topEnd = 12.dp))
            )
            Text(
                text = promotion.quote,
                modifier = Modifier
                    .padding(16.dp),
                     fontSize = 16.sp,
                     fontStyle = FontStyle.Italic,
                     fontWeight = FontWeight.Medium
            )
        }
    }
}




