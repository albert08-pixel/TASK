package main.java;

 class Task {
     private String taskName;
     private long dueTime;
     private String description;
    // Constructor for creating a new task
     public Task(String taskName, long dueTime,  String description) {
         this.taskName = taskName;
         this.dueTime = dueTime;
         this.description = description;
     }
     // Retrieving the task name
     public String getTaskName() {
         return taskName;
     }
     // Retrieving the due time
     public long getDueTime() {
         return dueTime;
     }
     // Retrieving the task description
     public String getDescription() {
         return description;
     }
     // Method for updating the task name
     public void updateTaskName(String taskName) {
         this.taskName = taskName;
         System.out.println("Successfully Changed Task Name!");
     }
     // Method for updating the due time
     public void updateDueTime(long dueTime) {
         this.dueTime = dueTime;
         System.out.println("Successfully Changed Task Due Time!");
     }
     // Method for updating the task description
     public void updateDescription(String description) {
         this.description = description;
         System.out.println("Successfully Changed Task Description!");
     }
 }