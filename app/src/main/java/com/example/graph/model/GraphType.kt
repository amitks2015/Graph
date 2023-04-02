package com.example.graph.model

import androidx.annotation.StringRes
import com.example.graph.R

enum class GraphType(@StringRes val label: Int) {
    PIE(R.string.graph_pie),
    LINE(R.string.graph_line),
    BAR(R.string.graph_bar),
    COLUMN(R.string.graph_column),
    DOUGHNUT(R.string.graph_doughnut),
    AREA(R.string.graph_area)
}