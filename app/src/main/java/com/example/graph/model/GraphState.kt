package com.example.graph.model

data class GraphState(
    val graphType: GraphType = GraphType.LINE,
    val showGraphPicker: Boolean = false,
    val graphData: List<GraphData> = GraphDataFactory.populateGraphData()
)
