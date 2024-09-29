# Simple Job Application Backend

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![H2](https://img.shields.io/badge/H2-4B8BBE?style=for-the-badge&logo=h2database&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white)


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

1. **Java JDK**: Make sure you have JDK 21 installed.
2. **Maven**: Ensure Maven is installed to manage the project dependencies.
3. **Optional: PostgreSQL**: Install PostgreSQL if you choose to use it instead of H2.

### How to Use

```bash
git clone https://github.com/nzhussup/SimpleJobAppBackend.git
cd SimpleJobAppBackend
mvn clean install
mvn spring-boot:run
```

Then, in your browser open *localhost:8080*


