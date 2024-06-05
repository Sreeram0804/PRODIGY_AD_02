package com.example.tasks

interface TaskItemClickListener {
    fun editTaskItem(taskItem: TaskItem)
    fun completeTaskItem(taskItem:TaskItem)
}