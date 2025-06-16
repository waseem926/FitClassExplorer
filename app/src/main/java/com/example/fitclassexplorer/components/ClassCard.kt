package com.example.fitclassexplorer.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.fitclassexplorer.data.FitnessClass

@Composable
fun ClassCard(fitnessClass: FitnessClass, onClick: ()  -> Unit) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = fitnessClass.title, style = MaterialTheme.typography.titleMedium)
            Text(text = "${fitnessClass.type} . ${fitnessClass.time}", style = MaterialTheme.typography.bodySmall )
        }
    }
}