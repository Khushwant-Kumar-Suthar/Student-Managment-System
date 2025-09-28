# Student Management System in JAVA Spring MVC
This is a simple Student Management System project implemented using Java Spring MVC framework and MySQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on student data such as ID, first name, last name, email and enrolled course.

# Features
* Add a new student
* View student data
* Update student data

# Requirements
* Java 8 or higher.
* MySQL Server.

# Installation
1. Clone the repository
```bash
git clone https://github.com/Khushwant-Kumar-Suthar/Student-Managment-System.git
```
2. Build and run the project using a Java IDE or command-line tool.
3. To import *student_data.sql* into your mysql database.
    * **Type**: ```mysql -u username -p database_name < file.sql```
    * The **username** refers to your MySQL username.
    * **database_name** refers to the database you want to import.
    * **file.sql** is your file name. (student_data.sql in our case.)
    * If you've assigned a password, type it now and press Enter.

# Usage
* Launch the application
* Select the desired operation from the main menu
* Follow the prompts to enter or update student data

# Database Columns
The database table used in this project has the following columns:

* Student_ID: The unique identifier for each student.  
* first_name: The first name of the student.  
* last_name: The last name of the student.  
* major: The major that the student is studying.  

# Future Enhancements
* Fee tracking
* Attendance management
