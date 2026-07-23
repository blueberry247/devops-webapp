# 🚀 DevOps WebApp

A production-style DevOps portfolio project demonstrating a complete CI/CD pipeline for a Spring Boot application using Azure DevOps and Azure App Service.

---

## 📖 Project Overview

This project demonstrates how a Java Spring Boot application can be automatically built, tested and deployed to Azure App Service using Azure DevOps.

Every push to the **main** branch triggers a multi-stage Azure DevOps pipeline which:

- Builds the application using Maven
- Runs JUnit tests
- Publishes the JAR as a Pipeline Artifact
- Deploys automatically to Azure App Service

---

## 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Java 17 | Application |
| Spring Boot | Web Framework |
| Maven | Build Tool |
| JUnit | Unit Testing |
| GitHub | Source Control |
| Azure DevOps | CI/CD |
| Azure App Service | Hosting |
| Linux | Runtime |

---

## ⚙️ CI/CD Pipeline

The Azure DevOps pipeline performs the following stages:

1. Checkout source code
2. Build using Maven
3. Run JUnit tests
4. Publish JAR artifact
5. Deploy to Azure App Service

---

## 🌐 REST Endpoints

| Endpoint | Description |
|----------|-------------|
| `/` | Home page |
| `/about` | About page |
| `/api/version` | Application version |
| `/api/health` | Health check |

---

## ✅ Features

- Java 17
- Spring Boot
- Maven Build
- Azure DevOps YAML Pipeline
- Pipeline Artifacts
- Multi-stage CI/CD
- Azure App Service Deployment
- Linux Hosting

---

## 📁 Repository Structure

```text
devops-webapp/
│
├── src/
├── pom.xml
├── azure-pipelines.yml
├── mvnw
└── README.md
```

---

## 🚀 Future Improvements

- Terraform App Service Module
- Dev / Test / Prod Environments
- Deployment Slots
- Application Insights
- Infrastructure as Code
- Security Scanning

---

## 👨‍💻 Author

**Mohammed Farooq**

DevOps Engineer | Azure | Terraform | Azure DevOps | Spring Boot