# Spring-Ollama Chat API

## Description
Spring-Ollama Chat API is a backend service built with **Spring Boot** and **Ollama** that provides AI-powered chat functionality. It includes features like Cross-Origin Resource Sharing (CORS) and an AI chat model for handling user interactions.

## Features
- AI-powered chat functionality using **Ollama**.
- Cross-Origin Resource Sharing (**CORS**) enabled.
- RESTful API built with **Spring Boot**.
- Web dependency for seamless integration with front-end applications.

## Technologies Used
- **Spring Boot** (Java-based framework)
- **Ollama AI** (Chat model integration)
- **Spring Web** (REST API support)
- **Maven** (Dependency management)

## Installation & Setup
### Prerequisites
- **Java 17+** installed.
- **Maven** for dependency management.
- **Ollama AI** installed.

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

### Steps to Run the Project
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

## API Endpoints
- `GET /api/chat/{message}` - Sends a message to the AI chat model and gets a response.
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

