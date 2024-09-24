# Markdown Blog

A simple markdown-based blogging platform built with Java and Spring Boot. This application allows users to create, edit, and format blog posts using markdown syntax, with real-time preview functionality.

## Features

- Write, edit, and format blog posts using markdown syntax.
- Real-time preview of markdown content.
- Syntax highlighting for code blocks within blog posts.
- Backend built using **Spring Boot** with **Thymeleaf** for rendering views.
- **MarkdownProcessor** for parsing markdown content into HTML.
- Persistent data storage using **MySQL**.

## Technologies Used

- **Java 11**
- **Spring Boot**
- **Thymeleaf**
- **MarkdownProcessor** (for markdown parsing)
- **MySQL** (for data storage)
- **Bootstrap** (for styling)
- **Maven** (for dependency management)

## Installation

### Prerequisites

- **Java 11** or higher
- **Maven** for building the project
- **MySQL** database

### Steps to Run Locally

1. Clone the repository:

    ```bash
    git clone https://github.com/SamaadTurner/markdown-blog.git
    cd markdown-blog
    ```

2. Set up **MySQL**:

    - Create a database for the blog, e.g., `markdown_blog`.
    - Update the `application.properties` file with your MySQL credentials:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/markdown_blog
    spring.datasource.username=your_mysql_username
    spring.datasource.password=your_mysql_password
    ```

3. Build and run the project:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. Open your browser and navigate to:

    ```
    http://localhost:8080
    ```

## Usage

- Once the application is running, you can:
  - Write new blog posts using markdown syntax.
  - Edit or delete existing posts.
  - Preview markdown content in real-time.
  
