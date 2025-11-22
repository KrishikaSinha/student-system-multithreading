# Student Management System – Java (Exception Handling & Multithreading)

## 📌 Overview

This project is an enhanced **Student Management System** written in Java that demonstrates advanced OOP concepts including:

* Exception Handling
* Custom Exceptions
* Multithreading
* Wrapper Classes (`Integer`, `Double`)
* CRUD Operations
* Menu-driven console interface

The system validates user input, safely handles errors using `try-catch-finally` blocks, and simulates loading operations using threads for a more responsive execution flow.

---

## 🧠 Key Concepts Implemented

### ✔ Exception Handling

* Prevents crashes from invalid input
* Validates empty fields, mark range, and record existence
* Uses custom exception `StudentNotFoundException`

### ✔ Custom Exception

`StudentNotFoundException` alerts when a record is missing.

### ✔ Multithreading

* A `Loader` class (implementing `Runnable`) simulates loading animations
* Threading provides a smooth user experience

### ✔ Wrapper Classes

* Uses `Integer` and `Double` for autoboxing and numeric input conversion

---

## 📂 Project Structure

```
Student Management System
│
├── StudentNotFoundException.java
├── Loader.java
├── Student.java
├── StudentManager.java
├── RecordActions.java
└── Main.java
```

All files can be kept in the same folder for easy compilation.

---

## 🖥️ Features

* Add student record
* Validate data before saving
* View all stored students
* Search any student by roll number
* Update student details
* Delete student record
* Loading animation during operations

---

## 🧮 Grading Criteria

| Marks | Grade |
| ----- | ----- |
| 85+   | A     |
| 70+   | B     |
| 50+   | C     |
| <50   | D     |

---

## ▶️ How to Run

### 1️⃣ Compile all files

```
javac *.java
```

### 2️⃣ Run the application

```
java Main
```

---

## 📸 Sample Output

```
Enter Roll No (Integer): 102
Enter Name: Karan
Enter Email: karan@gmail.com
Enter Course: BCA
Enter Marks (Double): 77.5
Loading.....
Student added successfully!
```

---

## 🎯 Learning Outcomes

After completing this lab, you will:

* Use custom exceptions in real applications
* Implement multithreading using `Thread` and `Runnable`
* Apply wrapper classes with autoboxing
* Build a stable and fault-tolerant Java console application

