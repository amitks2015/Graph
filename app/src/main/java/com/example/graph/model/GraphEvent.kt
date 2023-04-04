package com.example.graph.model

sealed class GraphEvent {
    object ShowPicker: GraphEvent()
    object DismissPicker: GraphEvent()
    data class SetGraphType(val graphType: GraphType): GraphEvent()
}