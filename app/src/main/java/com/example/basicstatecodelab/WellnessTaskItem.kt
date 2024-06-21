package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.basicstatecodelab.data.WellnesTask

@Composable
fun WellnessTaskItem(
    modifier: Modifier = Modifier, taskName: String,
    onCloseTask: (wellnessTask: WellnesTask) -> Unit,
    wellnessTask: WellnesTask,
    checked: Boolean,
    onCheckedTask: (checked: Boolean) -> Unit
) {
//    var checkedState by rememberSaveable {
//        mutableStateOf(
//            false
//        )
//    }
    WellnessTaskItem(
        modifier,
        taskName = taskName,
        checked = checked,
        onCheckedChange = { check -> onCheckedTask(check) },
        wellnessTask = wellnessTask,
        onClose = onCloseTask
    )
}

@Composable
fun WellnessTaskItem(
    modifier: Modifier = Modifier,
    taskName: String,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    onClose: (wellnessTask: WellnesTask) -> Unit,
    wellnessTask: WellnesTask,
) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = taskName, modifier = modifier
                .weight(1f)
                .padding(start = 16.dp)
        )
        Checkbox(checked = checked, onCheckedChange = onCheckedChange)
        IconButton(onClick = { onClose(wellnessTask) }) {
            Icon(imageVector = Icons.Filled.Close, contentDescription = "Close")
        }
    }
}