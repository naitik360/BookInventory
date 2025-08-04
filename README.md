# 📚 Book Inventory Management System

A complete backend REST API built using **Java Spring Boot**, managing books, authors, and categories. Designed to demonstrate real-world practices like DTO usage, JPA relationships, validation, exception handling, and OpenAPI (Swagger) documentation.

---

## 🚀 Features

- Add / View / Delete books
- Associate books with authors and categories
- Fetch books by category or author
- Validations for clean data input
- Global error handling using `@RestControllerAdvice`
- DTOs to decouple entities from the API
- Database: MySQL (configurable)
- Swagger/OpenAPI Documentation

---

## 🛠️ Tech Stack

| Layer              | Tech                             |
|-------------------|----------------------------------|
| Backend Framework | Spring Boot                      |
| ORM               | JPA + Hibernate                   |
| DB                | MySQL                             |
| Validation        | Jakarta Bean Validation (`@Valid`)|
| Docs              | Springdoc OpenAPI (Swagger)       |
| Tools             | Maven, IntelliJ / VSCode          |

---

## 📁 Project Structure

├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/bookinventory/
│ │ │ ├── controller/ # REST controllers
│ │ │ ├── dto/ # DTOs for API requests/responses
│ │ │ ├── entity/ # JPA entities
│ │ │ ├── exception/ # Custom exception & handler
│ │ │ ├── repository/ # Spring Data JPA Repositories
│ │ │ └── service/ # Business logic services
│ │ └── resources/
│ │ └── application.properties # Configuration
├── pom.xml # Maven dependencies
└── README.md # You're here!


---

## 🔗 API Endpoints

### 📘 Book APIs

| Method | URL                        | Description           | Input (JSON) |
|--------|----------------------------|------------------------|---------------|
| `POST`| `/api/books`               | Add a new book         | `{ title, description, price, authorId, categoryId }` |
| `GET` | `/api/books`               | List all books         | – |
| `GET` | `/api/books/{id}`          | Get book by ID         | – |
| `DELETE`| `/api/books/{id}`        | Delete book by ID      | – |

### 👨‍💼 Author APIs

| Method | URL                         | Description           | Input (JSON) |
|--------|-----------------------------|------------------------|---------------|
| `POST`| `/api/authors`              | Add new author         | `{ name, email }` |
| `GET` | `/api/authors`              | List all authors       | – |

### 🗂️ Category APIs

| Method | URL                         | Description           | Input (JSON) |
|--------|-----------------------------|------------------------|---------------|
| `POST`| `/api/categories`           | Add new category       | `{ name }` |
| `GET` | `/api/categories`           | List all categories    | – |

---

## 🧪 Sample Request (Book Creation)

```json
POST /api/books
Content-Type: application/json

{
  "title": "Spring Boot in Action",
  "description": "A comprehensive guide to Spring Boot",
  "price": 499.99,
  "authorId": 1,
  "categoryId": 2
}
