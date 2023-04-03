package com.example.graph.model

import androidx.compose.ui.graphics.Color

object GraphDataFactory {
    fun populateGraphData() = listOf(
        GraphData(label = "2018", value = 5, color = Color.Red),
        GraphData(label = "2019", value = 13, color = Color.Blue),
        GraphData(label = "2020", value = 6, color = Color.Yellow),
        GraphData(label = "2021", value = 14, color = Color.Green),
        GraphData(label = "2022", value = 4, color = Color.Magenta),
        GraphData(label = "2023", value = 7, color = Color.Gray),
        GraphData(label = "2024", value = 26, color = Color.Cyan),
    )
}