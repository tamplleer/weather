package com.whynot.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.getAndUpdate
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {
    private val scope = viewModelScope

    private val _countElement = MutableStateFlow(0)

    val countElement = _countElement.asStateFlow()

    fun updateShowElement() {
        _countElement.getAndUpdate { v -> v + 1 }
    }
}