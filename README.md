# 📚 Book Inventory Management System

A complete backend **REST API** built using **Java Spring Boot**, managing books, authors, and categories.  
Perfect for learning real-world development with JPA relationships, DTOs, validation, exception handling, and Swagger UI.

---

## 🚀 Features

- ✅ Add, view, and delete books
- ✅ Associate books with authors & categories
- ✅ Add/view authors and categories
- ✅ Validations using `@Valid` & `@NotBlank`
- ✅ Global exception handling (`@RestControllerAdvice`)
- ✅ DTO usage to decouple entity logic
- ✅ Built-in Swagger (OpenAPI) documentation
- ✅ Fully tested with Postman

---

## 🧰 Tech Stack

| Layer         | Technology                      |
|--------------|----------------------------------|
| Framework    | Spring Boot (v3.5.4)             |
| ORM          | Spring Data JPA (Hibernate)      |
| DB           | MySQL                            |
| Validation   | Jakarta Bean Validation          |
| Docs         | SpringDoc OpenAPI Swagger        |
| Tools        | Maven, IntelliJ / VSCode         |

---

## 🗂️ Project Structure

BookInventory/
├── controller/             # All REST API endpoints
├── dto/                    # Data Transfer Objects
├── entity/                 # JPA Entities
├── repository/             # Spring Data JPA Repositories
├── service/                # Business Logic (Service & Impl)
├── exception/              # Global Exception Handlers
├── resources/
│   └── application.properties  # Spring Boot config
└── BookInventoryApplication.java  # Main class



---

## 📑 API Endpoints

### 📘 Book APIs

| Method | Endpoint         | Description          | Body Example |
|--------|------------------|----------------------|--------------|
| POST   | `/api/books`     | Add a book           | `{ title, description, price, authorId, categoryId }` |
| GET    | `/api/books`     | Get all books        | – |
| GET    | `/api/books/{id}`| Get book by ID       | – |
| DELETE | `/api/books/{id}`| Delete book by ID    | – |

### 👨‍💼 Author APIs

| Method | Endpoint           | Description         | Body Example |
|--------|--------------------|---------------------|--------------|
| POST   | `/api/authors`     | Add new author      | `{ name, email }` |
| GET    | `/api/authors`     | Get all authors     | – |

### 🗂️ Category APIs

| Method | Endpoint            | Description         | Body Example |
|--------|---------------------|---------------------|--------------|
| POST   | `/api/categories`   | Add new category    | `{ name }` |
| GET    | `/api/categories`   | Get all categories  | – |

---

## 📤 Sample Book JSON Payload

```json
{
  "title": "Spring Boot in Action",
  "description": "Comprehensive guide to Spring Boot",
  "price": 499.99,
  "authorId": 1,
  "categoryId": 2
}

💡 Swagger UI (Auto API Docs)
After running the app, explore API docs via:

🧾 Swagger UI: http://localhost:8080/swagger-ui/index.html

📄 API Docs JSON: http://localhost:8080/v3/api-docs


📁 Step 1: Configure application.properties
properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

▶️ Step 2: Build and Run
# Build the project
mvn clean install

# Run the app
mvn spring-boot:run

⚠️ Error Response Format
json
{
  "timestamp": "2025-08-04T22:15:28.592Z",
  "message": "Author not found",
  "path": "/api/books"
}

👨‍💻 Author
Naitik Verma
📧 naitikverma036@gmail.com
💼 Full Stack Developer | Java • Spring Boot • React • Flutter
🔗 LinkedIn

👨‍💻 Author
Naitik Verma
📧 naitikverma036@gmail.com
💼 Full Stack Developer | Java • Spring Boot • React • Flutter
🔗 LinkedIn
