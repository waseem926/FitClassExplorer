package com.example.fitclassexplorer.ui.theme.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.fitclassexplorer.data.ClassDetailUiState
import com.example.fitclassexplorer.data.FitnessClassRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClassDetailViewModel @Inject constructor(
    private val repository: FitnessClassRepository,
) : ViewModel() {

    private val _uiState = MutableStateFlow(ClassDetailUiState())
    val uiState: StateFlow<ClassDetailUiState> = _uiState

    fun loadClassById(classId: String) {
        viewModelScope.launch {
            _uiState.value = ClassDetailUiState(isLoading = true)

            val detail = repository.getClassDetailById(classId)

            _uiState.value = ClassDetailUiState(
                isLoading = false,
                classDetail = detail
            )
        }
    }
}