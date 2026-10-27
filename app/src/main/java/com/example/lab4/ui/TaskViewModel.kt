package com.example.lab4.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.lab4.model.Priority
import com.example.lab4.model.Task
import com.example.lab4.model.TaskFilter

/**
 * Holds all task-manager state in memory. Survives configuration changes
 * (rotation) because it is a [ViewModel], but there is NO disk/network
 * persistence — this is the frontend-only part of the lab.
 */
class TaskViewModel : ViewModel() {

    // Backing list is observable: Compose recomposes on add/remove/replace.
    private val _tasks = mutableStateListOf<Task>()
    val tasks: List<Task> get() = _tasks

    @set:JvmName("setFilterPrivate")
    var filter by mutableStateOf(TaskFilter.ALL)
        private set

    private var nextId = 1L

    init {
        // Seed a few sample tasks so the screen isn't empty on first launch.
        addTask("Finish SMA Lab 4 UI", Priority.HIGH)
        addTask("Start my thesis project", Priority.MEDIUM)
        addTask("Buy groceries", Priority.LOW)
        toggleDone(_tasks.last().id) // mark "Buy groceries" done as a demo
    }

    /** The tasks visible under the current [filter], incomplete first. */
    val visibleTasks: List<Task>
        get() = _tasks
            .filter {
                when (filter) {
                    TaskFilter.ALL -> true
                    TaskFilter.ACTIVE -> !it.done
                    TaskFilter.DONE -> it.done
                }
            }
            .sortedWith(compareBy({ it.done }, { -it.priority.ordinal }))

    val activeCount: Int get() = _tasks.count { !it.done }
    val totalCount: Int get() = _tasks.size

    fun addTask(title: String, priority: Priority = Priority.MEDIUM) {
        val trimmed = title.trim()
        if (trimmed.isEmpty()) return
        _tasks.add(Task(id = nextId++, title = trimmed, priority = priority))
    }

    fun toggleDone(id: Long) {
        val index = _tasks.indexOfFirst { it.id == id }
        if (index == -1) return
        val task = _tasks[index]
        _tasks[index] = task.copy(done = !task.done)
    }

    fun deleteTask(id: Long) {
        _tasks.removeAll { it.id == id }
    }

    fun clearCompleted() {
        _tasks.removeAll { it.done }
    }

    fun setFilter(newFilter: TaskFilter) {
        filter = newFilter
    }
}
