# Job-Search-Portal
## Framework and Language Used
- Framework: Spring Boot
- Language: Java

## Data Flow
The data flow in the project follows the typical MVC (Model-View-Controller) pattern:

1. Controller: Handles incoming HTTP requests, validates inputs, and coordinates the flow of data.
2. Service: Contains the business logic of the application and interacts with the repository.
3. Repository: Provides the interface to interact with the underlying database.
4. Database: Stores the job entities and their related data.

## Database Design
The project uses an H2 Database, an in-memory database, for simplicity. The `Job` entity is mapped to the `jobs` table in the database.

The `Job` entity has the following attributes:
- id: Integer
- title: String
- description: String
- location: String
- salary: Double
- companyEmail: String
- companyName: String
- employerName: String
- jobType: Enum (IT, HR, Sales, Marketing)
  

## Data Structure Used in the Project
- Job: Represents a job listing with various attributes and associated methods.
- JobType: Enum class that defines the different types of jobs (IT, HR, Sales, Marketing).

## Project Summary
The Job Search Portal is a Spring Boot-based application that allows users to search for job listings. It provides CRUD operations for managing job entities, including creating, updating, retrieving, and deleting jobs.

The application leverages Spring Boot's built-in validation annotations to enforce data constraints on the Job entity. For example, the salary should be above 20,000, and certain fields like title and company email should not be null.

The project follows a layered architecture, separating concerns into controllers, services, and repositories. This promotes modularity, testability, and maintainability of the codebase.
