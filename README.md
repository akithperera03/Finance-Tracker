# Personal Finance Tracker

## Overview

The **Personal Finance Tracker** is a web-based application that helps users track their income and expenses.
## Features

- **Dashboard**: Displays a summary of financial data, including total income and total expenses, recent transactions.
- **Transaction Entry**: Allows users to add new transactions by selecting a type (Income/Expense) and categorizing them.
- **Transaction History**: Displays all transactions.
- **Category Management**: Allows users to add, update, and delete transaction categories.
- **User Management**: Supports new user registration and login.

## Technologies

- **Spring Boot**: Back-end framework for creating the RESTful API and managing the web application.
- **Spring Data JPA**: Manages database interactions with MySQL.
- **Thymeleaf**: Server-side template engine for dynamic HTML pages.
- **MySQL**: Database to store users, transactions, and categories.

## Project Setup

### Prerequisites

Before you start, make sure you have the following tools installed:

- Java 17+
- Maven
- MySQL
- Git

### Steps to Set Up

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/personal-finance-tracker.git
   cd personal-finance-tracker
2.Set up the database:

-Create a MySQL database named finance_tracker
-Update the src/main/resources/application.properties file with your database credentials:
    properties
    
spring.datasource.url=jdbc:mysql://localhost:3306/finance_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3.Access the application:

Open your browser and go to http://localhost:8080.
   
