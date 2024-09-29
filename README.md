# Simple Job Application Backend

This is a simple Spring Boot MVC application for managing job postings. 
It supports two databases: PostgreSQL for production and an embedded H2 database for development and testing. 
The application provides CRUD operations for job postings and uses JSP for the frontend views. 
The purpose of this project is to learn Backend Development, Spring Framework and Java.

**Note**: Frontend development isn't the primary focus of this project, so no cutting-edge frontend technologies are used.

## Features

- Create, read, update, and delete job postings.
- Two database options: PostgreSQL and embedded H2.
- MVC architecture with JSP views.

## Technologies

- **Java 21**
- **Spring Boot** (version specified in `pom.xml`)
- **Spring MVC**
- **Spring Data JDBC**
- **PostgreSQL** (optional)
- **H2 Database** (embedded)
- **JSP** for view rendering
- **Maven** for dependency management

## Getting Started

### Prerequisites

1. **Java JDK**: Make sure you have JDK 17 or higher installed.
2. **Maven**: Ensure Maven is installed to manage the project dependencies.
3. **PostgreSQL**: Install PostgreSQL if you choose to use it instead of H2.

### How to Use

Make sure Maven is installed on your computer!

```bash
git clone https://github.com/nzhussup/SimpleJobAppBackend.git
cd SimpleJobAppBackend
mvn clean install
mvn spring-boot:run
```

Then, in your browser open *localhost:8080*


