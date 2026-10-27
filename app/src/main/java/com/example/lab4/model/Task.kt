package com.example.lab4.model

/**
 * A single task. Frontend-only model held in memory — no persistence layer.
 *
 * @param id       stable unique identifier used as the list key
 * @param title    the task text
 * @param done     whether the task has been completed
 * @param priority relative importance, used for the colored accent / sorting
 */
data class Task(
    val id: Long,
    val title: String,
    val done: Boolean = false,
    val priority: Priority = Priority.MEDIUM
)

enum class Priority(val label: String) {
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High")
}

/** Which subset of tasks the list is currently showing. */
enum class TaskFilter(val label: String) {
    ALL("All"),
    ACTIVE("Active"),
    DONE("Done")
}
