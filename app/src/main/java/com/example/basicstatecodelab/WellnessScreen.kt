package com.example.basicstatecodelab

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.basicstatecodelab.data.WellnesTask
import com.example.basicstatecodelab.data.WellnessTaskList
import com.example.basicstatecodelab.data.WellnessViewModel

@Composable
fun WellnessScreen(
    modifier: Modifier = Modifier,
    wellnessViewModel: WellnessViewModel = viewModel()
) {
    WellnessTaskList(
        modifier, list = wellnessViewModel.tasks,
        onCloseTask = { task ->
            wellnessViewModel.remove(task)
        },
        onCheckedTask = { task, checked ->
            wellnessViewModel.changeTaskChecked(task, checked)
        }
    )
}
