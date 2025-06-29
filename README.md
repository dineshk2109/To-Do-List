# To-Do List App 📝

A simple and clean To-Do List web application built with Spring Boot. This Spring Boot project that helps you manage your daily tasks efficiently.

##  Features

- **View All Tasks** - See all your tasks in one place
- **Add New Tasks** - Quickly add new tasks to your list
- **Mark as Complete** - Click the circle icon to mark tasks as done
- **Delete Tasks** - Remove tasks you no longer need
- **Clean UI** - Simple and user-friendly interface
- **Responsive Design** - Works well on different screen sizes

##  Technologies Used

- **Backend:**
  - Java 17
  - Spring Boot 3.5.3
  - Spring Data JPA
  - Maven

- **Frontend:**
  - Thymeleaf (Template Engine)
  - HTML5
  - CSS3
  - Bootstrap 5
  - Bootstrap Icons

- **Database:**
  - MySQL

- **Tools:**
  - Lombok (for cleaner code)

##  How to Run the Project

### Prerequisites
- **Java 17** installed on your computer
- **MySQL** database installed
- **IDE** like IntelliJ IDEA or VS Code
- **Maven** (usually comes with your IDE)

### Step 1: Clone the Repository
```bash
git clone https://github.com/dineshk2109/To-Do-List.git
cd To-Do-List
```

### Step 2: Set Up MySQL Database

1. **Start MySQL** on your computer
2. **Create a new database:**
   ```sql
   CREATE DATABASE todoappdb;
   ```
3. **Update database credentials** in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.username=your_mysql_username
   spring.datasource.password=your_mysql_password
   ```

### Step 3: Run the Application

#### Using IntelliJ IDEA:
1. Open the project in IntelliJ IDEA
2. Wait for Maven to download dependencies
3. Run `TodoappApplication.java` 

#### Using VS Code:
1. Open the project in VS Code
2. Install "Extension Pack for Java" if not already installed
3. Open `TodoappApplication.java`
4. Click "Run" above the main method

#### Using Terminal:
```bash
./mvnw spring-boot:run
```

### Step 4: Access the Application
- Open your web browser
- Go to: `http://localhost:8080`
- Start adding your tasks! 

## 📁 Project Structure

```
todoapp/
├── src/
│   ├── main/
│   │   ├── java/com/dev/todoapp/
│   │   │   ├── controller/          # Handles web requests
│   │   │   │   └── todoController.java
│   │   │   ├── entity/              # Database models
│   │   │   │   └── ToDo.java
│   │   │   ├── repository/          # Database operations
│   │   │   │   └── todoRepository.java
│   │   │   └── TodoappApplication.java  # Main application file
│   │   └── resources/
│   │       ├── static/css/          # CSS files
│   │       │   └── style.css
│   │       ├── templates/           # HTML templates
│   │       │   └── index.html
│   │       └── application.properties   # Configuration
├── pom.xml                          # Maven dependencies
└── README.md                        # This file
```

##  Key Learning Points

This project demonstrates:
- **MVC Pattern** - Model, View, Controller architecture
- **Database Integration** - Using JPA with MySQL
- **Web Development** - Creating web pages with Thymeleaf
- **RESTful URLs** - Clean URL structure
- **Bootstrap** - Responsive design framework

This is a learning project, but feel free to suggest improvements!

Star this repository if you found it helpful!
