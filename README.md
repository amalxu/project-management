# Project Management System

This project is a simple Project Management System developed using Java 17 and Spring Boot, with an in-memory database (H2) for data persistence. It provides CRUD (Create, Read, Update, Delete) operations for managing projects.

## Setup Instructions

### Prerequisites:

- Java 17 (or higher)
- Maven (or similar build tool)

### Steps:

1. **Project Setup:**
   - Initialized a new Spring Boot project using [Spring Initializr](https://start.spring.io/).
   - Included dependencies: Spring Web, Spring Data JPA, H2 Database.
   - Project structure has appropriate packages (controllers, services, repositories, models, etc.)

2. **CRUD Operations:**
   - Create: Implemented an endpoint to add a new project.
   - Read: Implemented endpoints to retrieve all projects and a single project by ID.
   - Update: Implemented an endpoint to update an existing project.
   - Delete: Implemented an endpoint to delete a project by ID.

3. **Exception Handling:**
   - Implement global exception handling using `@ControllerAdvice` to manage exceptions and provide meaningful error messages.

4. **Data Validation:**
   - Use Spring Validation to validate input data for create and update operations.

### Accessing Swagger UI Documentation:


After running the application, you can access the API documentation using Swagger UI. 
The Swagger UI is typically available at the following 
URL: `[domain:PORT]/swagger-ui/index.html#/`
PORT=8080