# Java Spring Boot Login Application

## Overview

This is a simple login application demonstrating the Model-View-Controller (MVC) pattern. The UI can be developed using Thymeleaf, and the backend is implemented in Java. The application includes user authentication, a welcome page, role-based access control, and logout functionality.

## Features

- User authentication with a backend in Java.
- Welcome page displaying user information (name, username, and role) upon successful login.
- Role-based access control:
  - Manager role has access to a restricted webpage.
  - Other user roles don't have access to the restricted webpage.
- Logout functionality.

## Technologies Used

- Frontend: Thymeleaf
- Backend: Java (Spring Boot for MVC)
- Database: PostgreSQL (for storing user data)

## Getting Started

### Prerequisites

1. Java Development Kit (JDK) installed
2. Maven installed
3. PostgreSQL database

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Benana89/java-login.git

2. Navigate to the project directory:

   ```bash
   cd java-login
   
3. Configure the database connection in src/main/resources/application.properties.

4. Build and run the application:

   ```bash
   mvn spring-boot:run

5. Access the application in your web browser: http://localhost:8080

### Usage
1. Open the application in your browser.
2. Enter valid user credentials to log in.
3. Upon successful login, you will be redirected to the welcome page displaying your name, username, and role.
4. If you have a manager role, a link to the restricted webpage will be available on the welcome page.
5. Click the logout button to log out and return to the login page.
6. If the user ID or password is not valid, an error message will be displayed on the login page.
