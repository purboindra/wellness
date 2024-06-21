package com.example.basicstatecodelab.data


import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel() {
    private val _tasks = getWellnessTasks().toMutableStateList()
    val tasks: List<WellnesTask>
        get() = _tasks
    
    fun changeTaskChecked(item: WellnesTask, checked: Boolean) =
        _tasks.find { it.id == item.id }?.let { task ->
            task.checked = checked
        }
    
    fun remove(item: WellnesTask) {
        _tasks.remove(item)
    }
}

private fun getWellnessTasks() = List(30) { i -> WellnesTask(i, "Task # $i") }