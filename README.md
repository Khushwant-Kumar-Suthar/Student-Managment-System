# Student Management System

A simple **Student Management System** built with **Java Spring MVC** and **MySQL**.  
The application allows performing CRUD (Create, Read, Update, Delete) operations on student records such as ID, name, email, and enrolled course.

---

## ✨ Features

- Add a new student  
- View student data  
- Update existing student information  
- Delete student records  

---

## 🛠 Tech Stack

- **Backend:** Java 8+, Spring MVC, Maven  
- **Frontend:** JSP, HTML, CSS  
- **Database:** MySQL  
- **Build Tool:** Maven Wrapper (`mvnw`)  

---

## 📂 Project Structure

Student-Managment-System/
├── src/ # Java source code (controllers, models, services, views)
├── pom.xml # Maven dependencies and build config
├── mvnw / mvnw.cmd # Maven wrapper scripts
├── .gitignore
└── README.md


---

## ⚙️ Installation

### Prerequisites
- Java 8 or higher  
- Maven 3.6+  
- MySQL Server  

### Steps

```bash
# Clone the repository
git clone https://github.com/Khushwant-Kumar-Suthar/Student-Managment-System.git
cd Student-Managment-System

# Build the project
./mvnw clean install

# Run on a servlet container (e.g., Tomcat/Jetty) or from your IDE

### 🗄 Database Setup

 Create a database:

CREATE DATABASE student_db;


Import the provided SQL file:

mysql -u username -p student_db < student_data.sql


Configure connection details in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

▶️ Usage

Start your MySQL server.

Deploy the application on Tomcat (or your preferred servlet container).

Access in browser:

http://localhost:8080/student-management

📡 API Endpoints
<table>
Method	      Endpoint	      Description
GET	         /students	   List all students
GET	        /students/{id}	View student by ID
POST	       /students	      Add new student
PUT	      /students/{id}   	Update existing record
DELETE     	/students/{id}	    Delete student
