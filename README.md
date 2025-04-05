# Spring-Ollama Chat API

## Description
Spring-Ollama Chat API is a backend service built with **Spring Boot** and **Ollama** that provides AI-powered chat functionality. It includes features like Cross-Origin Resource Sharing (CORS) and an AI chat model for handling user interactions.

## Features
- AI-powered chat functionality using **Ollama**.
- Cross-Origin Resource Sharing (**CORS**) enabled.
- RESTful API built with **Spring Boot**.
- Web dependency for seamless integration with front-end applications.
- **Docker support** for easy deployment.

## Technologies Used
- **Spring Boot** (Java-based framework)
- **Ollama AI** (Chat model integration)
- **Spring Web** (REST API support)
- **Maven** (Dependency management)
- **Docker** (Containerization)

## Installation & Setup
### Prerequisites
- **Java 17+** installed.
- **Maven** for dependency management.
- **Ollama AI** installed.
- **Docker** installed (for containerized deployment).

### Steps to Install Ollama & LLM Model
#### Install Ollama:
```sh
curl -fsSL https://ollama.com/install.sh | sh
```
Or on Windows (using PowerShell):
```sh
iwr -useb https://ollama.com/install.ps1 | iex
```

#### Install the Llama 3.2:1B Model:
```sh
ollama pull llama3.2:1b
```

### Steps to Run the Project Locally
1. Clone the repository:
   ```sh
   git clone https://github.com/TornovDutta/Spring-Ollama-Chat-API.git
   cd spring-ollama-chat-api
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```
3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Running with Docker
### Building the Docker Image
1. Navigate to the project root directory.
2. Build the Docker image:
   ```sh
   docker build -t spring-ollama-chat-api .
   ```

### Running the Container
Run the application using Docker:
```sh
docker run -p 8080:8080 spring-ollama-chat-api
```

### Docker Compose (Optional)
For setting up the project with **Docker Compose**, create a `docker-compose.yml` file:
```yaml
version: '3.8'
services:
  app:
    image: spring-ollama-chat-api
    ports:
      - "8080:8080"
    restart: always
```
Run the application:
```sh
docker-compose up -d
```

## API Endpoints
- `GET /api/model name/{message}` - Sends a message to the AI chat model and gets a response.
- `GET /api/status` - Checks the server status.

## LLM Model Details
- **Model Name:** Llama 3.2:1B
- **Size:** 1 Billion Parameters
- **Purpose:** Lightweight AI chat model

## Project Structure
```
Ai/
│── .idea/
│── .mvn/
│── src/
│   ├── main/
│   │   ├── java/org/example/ai/
│   │   │   ├── controller/
│   │   │   │   ├── OllamaController.java
│   │   │   ├── AiApplication.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   ├── templates/
│   │   │   ├── application.properties
│   ├── test/
│── target/
│── .gitattributes
│── .gitignore
│── Dockerfile
│── docker-compose.yml
│── HELP.md
│── mvnw
│── mvnw.cmd
│── pom.xml
```

## Author
- **Tornov Dutta**
- Email: tornovdutta@gmail.com

## License
This project is licensed under the MIT License.

