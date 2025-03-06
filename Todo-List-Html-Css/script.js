// script.js

// Get references to DOM elements
const taskInput = document.getElementById("taskInput");
const addTaskButton = document.getElementById("addTaskButton");
const taskList = document.getElementById("taskList");

// Add a new task
addTaskButton.addEventListener("click", () => {
  const taskText = taskInput.value.trim();

  if (taskText === "") {
    alert("Please enter a task!");
    return;
  }

  // Create a new list item
  const li = document.createElement("li");
  const p =document.createElement("p")
  // Add task text
  // li.textContent = taskText;
  p.textContent=taskText

  // Create a delete button
  const deleteButton = document.createElement("button");
  deleteButton.textContent = "Delete";

  // Attach delete functionality
  deleteButton.addEventListener("click", () => {
    taskList.removeChild(li);
  });

  //Append the paragraph to list item
  li.appendChild(p)

  // Append the delete button to the list item
  li.appendChild(deleteButton);

  // Add the list item to the task list
  taskList.appendChild(li);

  // Clear the input field
  taskInput.value = "";
});
