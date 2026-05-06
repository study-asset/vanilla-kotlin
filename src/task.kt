fun runTask(task: () -> Unit) {
    task()
}

fun task() {
    runTask {
        println("Start runTask")
    }
}