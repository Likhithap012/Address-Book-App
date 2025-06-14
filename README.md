# Address-Book-App
A simple Spring Boot application that manages address book entries using RESTful APIs. This project demonstrates the use of DTOs, services, exception handling, and in-memory storage (Java List) for CRUD operations.

---

## 🧩 Tech Stack

- **Java 17+**
- **Spring Boot 3+**
- **Lombok**
- **Jakarta Persistence (JPA Annotations)**
- **RESTful API**
- **Custom Exception Handling**

---

## 📁 Project Structure

```

com.gevernova.bookapp
├── controller           # API endpoints
├── dto                 # Data Transfer Object
├── entity              # JPA entity
├── exception           # Custom exceptions and handlers
├── service             # Business logic

````

---


## 🌐 API Endpoints

| Method | Endpoint            | Description             |
| ------ | ------------------- | ----------------------- |
| GET    | `/addressbook`      | Get all address entries |
| GET    | `/addressbook/{id}` | Get entry by ID         |
| POST   | `/addressbook`      | Create new entry        |
| PUT    | `/addressbook/{id}` | Update entry by ID      |
| DELETE | `/addressbook/{id}` | Delete entry by ID      |

