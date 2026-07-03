package com.example.calculator

// Data model representing a single calculator history record stored in the database
data class HistoryModel(
    val id: Int,
    val expression: String,
    val result: String
)
