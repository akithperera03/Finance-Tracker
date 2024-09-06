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

   ```properties
spring.datasource.url=jdbc:mysql://localhost:3306/finance_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

3.Access the application:

Open your browser and go to http://localhost:8080.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

MIT License

Copyright (c) 2024 Akith Perera 

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

