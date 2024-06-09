# Class Management System

The Class Management System is a Spring Boot-based web application designed to manage students in an educational institution. This application provides a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on student records. The project demonstrates the use of Spring Boot, Spring Data JPA, and other essential Spring frameworks to create a robust and scalable backend service.

## Features

- **Get All Students**: Retrieve a list of all students in the system.
- **Get Student By ID**: Fetch details of a specific student using their unique ID.
- **Create Student**: Add a new student record to the system.
- **Update Student**: Modify details of an existing student.
- **Delete Student**: Remove a student record from the system (commented out for now).

## Project Structure

- **Controller**: Manages incoming HTTP requests and routes them to appropriate service methods.
- **Service**: Contains the business logic and interacts with the repository layer.
- **Entity**: Represents the Student entity mapped to the database.

## Technologies Used

- **Spring Boot**: Simplifies the setup and development of new Spring applications.
- **Spring Data JPA**: Provides an abstraction over the data access layer for CRUD operations and complex queries.
- **RESTful API**: Exposes endpoints for performing CRUD operations on student data.

## Endpoints

- **GET /api/students/AllStudent**: Retrieve all students.
- **GET /api/students/{studentId}**: Retrieve a student by their ID.
- **POST /api/students/**: Create a new student.
- **PUT /api/students/{studentId}**: Update an existing student's details.
- **DELETE /api/students/{studentId}**: Delete a student (functionality currently commented out).

## Setup and Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/ClassManagementSystem.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd ClassManagementSystem
   ```
3. **Build the project**:
   ```bash
   ./mvnw clean install
   ```
4. **Run the application**:
   ```bash
   ./mvnw spring-boot:run
   ```

## Usage

Once the application is running, you can interact with the API using tools like Postman or curl. Below are example commands for each endpoint:

- **Get All Students**:
  ```bash
  curl -X GET http://localhost:8080/api/students/AllStudent
  ```
- **Get Student By ID**:
  ```bash
  curl -X GET http://localhost:8080/api/students/{studentId}
  ```
- **Create Student**:
  ```bash
  curl -X POST http://localhost:8080/api/students/ -H "Content-Type: application/json" -d '{"name":"John Doe","age":25,"course":"Computer Science"}'
  ```
- **Update Student**:
  ```bash
  curl -X PUT http://localhost:8080/api/students/{studentId} -H "Content-Type: application/json" -d '{"name":"John Doe","age":26,"course":"Mathematics"}'
  ```
- **Delete Student**:
  ```bash
  curl -X DELETE http://localhost:8080/api/students/{studentId}
  ```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.
