package com.example.graph

import androidx.lifecycle.ViewModel
import com.example.graph.model.GraphEvent
import com.example.graph.model.GraphState
import kotlinx.coroutines.flow.MutableStateFlow

class GraphViewModel: ViewModel() {

    val uiState = MutableStateFlow(GraphState())

     fun handleEvent(event: GraphEvent) {
         when(event) {
             is GraphEvent.ShowPicker -> {
                 uiState.value = uiState.value.copy(showGraphPicker = true)
             }

             is GraphEvent.DismissPicker -> {
                 uiState.value = uiState.value.copy(showGraphPicker = false)
             }

             is GraphEvent.SetGraphType -> {
                 uiState.value = uiState.value.copy(
                     graphType = event.graphType,
                     showGraphPicker = false
                 )
             }
         }
     }
}