package com.example.fitclassexplorer.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitclassexplorer.data.FitnessClass
import com.example.fitclassexplorer.data.FitnessClassRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: FitnessClassRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState

    init {
        loadClasses()
    }

    private fun loadClasses() {
        viewModelScope.launch {
            val result = repository.getAllClasses()
            _uiState.value = HomeUiState(isLoading = false, classes = result)
        }
    }
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val classes: List<FitnessClass> = emptyList()
)