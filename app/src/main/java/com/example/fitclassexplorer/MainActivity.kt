package com.example.fitclassexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.fitclassexplorer.navigation.FitClassNavGraph
import com.example.fitclassexplorer.ui.theme.FitClassExplorerTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            FitClassExplorerTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    FitClassNavGraph()
                }
            }
        }
    }
}
