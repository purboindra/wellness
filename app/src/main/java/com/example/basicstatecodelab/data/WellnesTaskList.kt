package com.example.basicstatecodelab.data

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.basicstatecodelab.WellnessTaskItem

@Composable
fun WellnessTaskList(
    modifier: Modifier = Modifier,
    list: List<WellnesTask>,
    onCloseTask: (wellnessTask: WellnesTask) -> Unit,
    onCheckedTask: (wellnessTask: WellnesTask, checked: Boolean) -> Unit,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(items = list, key = { task -> task.id }) { task ->
            WellnessTaskItem(
                taskName = task.label,
                onCloseTask = { onCloseTask(task) },
                wellnessTask = task,
                checked = task.checked,
                onCheckedTask = { checked -> onCheckedTask(task, checked) }
            )
        }
    }
}