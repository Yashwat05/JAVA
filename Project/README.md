# Online Student Management System

## Overview

This is a **Spring + Hibernate-based mini project** for managing students, courses, and fee payments. It demonstrates:

* **Dependency Injection** using Spring Java-based configuration
* **CRUD operations** using Hibernate ORM
* **Transaction Management** for fee payments and refunds
* Integration of **Spring + Hibernate** in a layered architecture

The system provides a **menu-driven console interface** for performing operations like adding students, enrolling in courses, updating student data, deleting records, and handling payments and refunds.

---

## Features

1. **Student Management**

   * Add, update, delete, and view students
   * Assign students to courses

2. **Course Management**

   * Add, update, delete, and view courses

3. **Fee Management**

   * Pay fees
   * Refund fees
   * Ensures atomic transactions with rollback in case of failure

4. **Console Interface**

   * Menu-driven for easy interaction
   * Real-time success/failure messages

---

## Technologies Used

* Java 11+
* Spring Framework (Core, ORM, TX)
* Hibernate ORM
* MySQL / H2 Database
* Maven for dependency management
* Log4j for logging

---

## Folder Structure

```
OnlineStudentManagementSystem/
│
├── src/main/java/com/osm/
│   ├── app/
│   │   └── MainApp.java
│   ├── config/
│   │   └── AppConfig.java
│   ├── dao/
│   │   ├── StudentDAO.java
│   │   ├── StudentDAOImpl.java
│   │   ├── CourseDAO.java
│   │   ├── CourseDAOImpl.java
│   │   └── PaymentDAO.java
│   ├── model/
│   │   ├── Student.java
│   │   ├── Course.java
│   │   └── Payment.java
│   └── service/
│       ├── FeeService.java
│       └── FeeServiceImpl.java
│
├── src/main/resources/
│   ├── hibernate.cfg.xml
│   ├── log4j.properties
│   └── schema.sql
│
├── pom.xml
└── README.md
```

---

## Database Setup

1. Create a MySQL database:

```sql
CREATE DATABASE osm_db;
```

2. (Optional) Run `schema.sql` to create tables:

```sql
USE osm_db;
-- Run the script provided in resources/schema.sql
```

3. Update database credentials in `hibernate.cfg.xml` if necessary:

```xml
<property name="hibernate.connection.username">root</property>
<property name="hibernate.connection.password">password</property>
```

---

## Running the Project

1. **Clone the repository** or download the project folder.
2. **Open in IDE** (IntelliJ IDEA or Eclipse).
3. **Build with Maven**:

```bash
mvn clean install
```

4. **Run the application**:

* From IDE: Run `MainApp.java`
* Or via terminal (if using Maven Shade plugin):

```bash
java -jar target/OnlineStudentManagementSystem-1.0-SNAPSHOT.jar
```

5. **Interact via console menu**:

```
=== Online Student Management System ===
1. Add Student
2. View Student by ID
3. View All Students
4. Pay Fee
5. Refund Fee
0. Exit
Enter your choice:
```

6. Follow prompts to perform operations.

---

## Notes

* Transaction management ensures **atomic payments/refunds**.
* Hibernate will **auto-create/update tables** using `hbm2ddl.auto=update`.
* For testing without MySQL, you can switch to **H2 in-memory database**.

---

