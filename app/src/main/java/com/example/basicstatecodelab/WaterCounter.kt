package com.example.basicstatecodelab

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.basicstatecodelab.data.WellnessTaskList
//
//@Composable
//fun WaterCounter(
//    modifier: Modifier = Modifier,
//) {
//    var count by remember {
//        mutableStateOf(0)
//    }
//
//
//    Column(
//        modifier = modifier.padding(16.dp),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        WellnessTaskList(
//            list = listOf(),
//            onCloseTask = {}
//        )
//        if (count > 0) {
//            var showTask by rememberSaveable {
//                mutableStateOf(true)
//            }
//            WellnessTaskItem(taskName = "This is task", onClose = {
//                showTask = false
//            })
//        }
//        Text("You've had $count glasses.")
//
//        Row(modifier = modifier.padding(top = 8.dp)) {
//            Button(
//                onClick = { count++ }, modifier = modifier.padding(top = 8.dp), enabled = count < 10
//            ) {
//                Text(text = "Add One")
//            }
//            Spacer(modifier = Modifier.width(20.dp))
//            Button(
//                onClick = { count = 0 },
//                modifier = modifier.padding(top = 8.dp),
//                enabled = count < 10
//            ) {
//                Text(text = "Clear water count")
//            }
//        }
//        StatefulCounter()
//    }
//}

//@Composable
//fun StatefulCounter(modifier: Modifier = Modifier) {
//    var count by rememberSaveable { mutableStateOf(0) }
//    StatelessCounter(modifier, count, onIncrement = { count++ })
//}
//
//@Composable
//fun StatelessCounter(modifier: Modifier = Modifier, count: Int, onIncrement: () -> Unit) {
//    Column(modifier = modifier.padding(16.dp)) {
//        if (count > 0) {
//            Text("You've had $count glasses.")
//        }
//        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
//            Text("Add one")
//        }
//    }
//}