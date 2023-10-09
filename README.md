# <h1 align ="center">RESTURANT MANAGMENT API</h1>
***
<p align ="center">
<a href="Java url"> 
  <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg"/>
</a>
<a href="Maven url"> 
  <img alt="Maven" src="https://img.shields.io/badge/maven-4.0.0-brightgreen.svg"/>
</a>
<a href="Spring Boot url"> 
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.4-brightgreen.svg"/>
</a>
<a href="Spring Boot url"> 
  <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg"/>
</a>


A simple restaurant management system built using Spring Boot for managing users, food items, and orders.

*** 

## Table of Contents

- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Endpoints](#endpoints)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)
 ***
### features

- User registration and authentication with different user roles (ADMIN, USER, VISITOR).
- Admin users can create food items, while normal users can place orders.
- CRUD operations for users, food items, and orders.
- Optional features include adding date and time to each entity and a dummy image URL for food items.


## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or higher
- Maven (for building the project)
- Your preferred IDE (e.g., IntelliJ IDEA, Eclipse)
- MySQL or another relational database (configured in `application.properties`)
  ***
  
 ## Project Structure
The project structure is organized as follows:

- `src/main/java/com/example/employeeaddressapplication/`:

- `controller/`: Contains controller classes for handling HTTP requests and responses.
- `model/`: Contains the user ,order and fooditem entity classes.
- `repo/`: Contains repository interfaces for database operations.
- `service/`: Contains service classes for encapsulating business logic.
- `Application.java`: The main application class.
- `src/main/resources/`:

application.properties: Configuration file for database settings and other application properties.
***
## Endpoints
The application exposes the following endpoints:
API Endpoints
User Management:

- `POST /api/users/signup`: Register a new user.
- `POST /api/users/signin`: Sign in a user.
- `GET /api/users/list`: Get a list of all users.
- `GET /api/users/email/{email}`: Find a user by email.
Food Item Management:

- `POST /api/fooditems/create`: Create a new food item.
- `GET /api/fooditems/list`: Get a list of all food items.
Order Management:

- `POST /api/orders/place`: Place a new order.
- `GET /api/orders/list/{userId}`: Get a list of orders by user.



  ***
  ## Usage
You can use a tool like POSTMAN or CURL to interact with the API endpoints to perform SWAGGER operations on user fooditems,orde


***
## Contributing
Contributions are welcome! If you find any issues or have suggestions for improvements, please create a GitHub issue or submit a pull request.
***



