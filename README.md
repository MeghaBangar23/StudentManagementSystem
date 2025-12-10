 Student Management System

A complete Student Management System built using *Spring Boot, **Spring MVC, and **Spring Data JPA*.  
This application allows Admins and Trainers to manage Students, Trainers, and related operations through a web interface.

---

## 🚀 Features

### 👨‍🎓 Student Module
- Add new students  
- Update student details  
- View all students  
- Delete students  

### 🧑‍🏫 Trainer Module
- Add new trainers  
- Update trainer information  
- View trainers list  

### 🔐 Authentication
- Simple login system for admin or trainer roles

### 🖥 Front-End
- HTML-based UI served directly by Spring MVC  
- Template files located in /src/main/webapp/templates/

---

## 🛠 Technologies Used

### *Backend*
- Java 8+
- Spring Boot  
- Spring MVC  
- Spring D…
- ### *Frontend*
- HTML5  
- CSS (static resources)  

### *Build Tool*
- Maven

---

## 📦 Project Structure

├── src/main/java/com/studentmanage/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── entity/
│   └── StudentManagementSystemApplication.java
├── src/main/webapp/templates/
│   ├── login.html
│   ├── HomePage.html
│   ├── addnew_student.html
│   ├── view_all_student.html
│   ├── Update_trainer_form.html
│   └── …
├── pom.xml

## ⚙️ Setup Instructions

### *1. Clone Repository*
```bash
git clone https://github.com/<your-username>/StudentManagementSystem.git
mvn spring-boot:run
