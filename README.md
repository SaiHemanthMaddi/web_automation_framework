🚀 Web Automation Framework
Selenium • TestNG • Maven • Extent Reports • GitHub Actions CI
<p align="center"> <img src="https://via.placeholder.com/900x250/121212/FFFFFF?text=Web+Automation+Framework+-+Selenium+%7C+TestNG+%7C+Maven" /> </p> <p align="center"> <img src="https://img.shields.io/badge/Build-Automated-brightgreen?style=for-the-badge" /> <img src="https://img.shields.io/badge/Selenium-4.x-43B02A?style=for-the-badge&logo=selenium&logoColor=white" /> <img src="https://img.shields.io/badge/TestNG-7.x-orange?style=for-the-badge" /> <img src="https://img.shields.io/badge/Java-17+-red?style=for-the-badge&logo=java&logoColor=white" /> <img src="https://img.shields.io/github/actions/workflow/status/SaiHemanthMaddi/Web-Automation-Framework-Selenium-TestNG-Maven/ci.yml?style=for-the-badge" /> </p>
📌 Overview

A professional-grade Web UI Automation Framework built using:

✔ Java 17+
✔ Selenium WebDriver 4.x
✔ TestNG
✔ Maven
✔ Extent Reports (HTML)
✔ GitHub Actions CI/CD
✔ SLF4J + Logback Logging

Built with industry standards and elegant coding practices, perfect for:
UI Functional Testing
Cross-Browser Testing
CI/CD Execution
Page Object Model (POM)
Reporting + Failure Screenshots
Scalable Test Architecture

🏗️ Project Architecture
web_automation_framework
│── pom.xml
│── README.md
│
├── src
│ ├── main
│ │ └── java
│ │ └── com.example.automation.framework
│ │ ├── driver
│ │ │ └── DriverManager.java
│ │ ├── pages
│ │ │ ├── LoginPage.java
│ │ │ └── InventoryPage.java
│ │ ├── reporting
│ │ │ ├── ExtentManager.java
│ │ │ └── TestListener.java
│ │ └── utils
│ │ └── WaitHelper.java
│ │
│ └── test
│ └── java
│ └── tests
│ └── LoginTest.java
│
├── reports
│ ├── screenshots
│ └── AutomationReport-<timestamp>.html
│
└── .github
└── workflows
└── ci.yml

✨ Features (Premium Implementation)
🔹 1. Page Object Model (POM)
Clean, reusable, maintainable, scalable test design.

🔹 2. Centralized WebDriver Manager
Handles setup, teardown, and CI-compatible headless execution.

🔹 3. Explicit Wait Wrapper
Custom WaitHelper for stable, flake-free tests.

🔹 4. Extent Reports (HTML)
Beautiful reports auto-saved to /reports with timestamps.

🔹 5. Screenshots on Failure
Attached automatically inside the Extent HTML report.

🔹 6. Logging (SLF4J + Logback)
Debug & info logs with clean output.

🔹 7. Full GitHub Actions Integration
Every push automatically runs tests on Ubuntu:
Installs Java
Installs Chrome & ChromeDriver
Executes mvn clean test
Uploads reports as CI artifacts

🚦 CI/CD Status
✔ Automatic Tests on Every Push
✔ Chrome Installed on Runner
✔ Reporting + Artifacts
✔ Status Badge Included

▶️ How to Run Tests Locally
1️⃣ Clone the repo: git clone https://github.com/<username>/web_automation_framework.git

2️⃣ Navigate into project: cd web_automation_framework

3️⃣ Run tests: mvn clean test

4️⃣ View Reports: Open:/reports/AutomationReport-<timestamp>.html

Screenshots saved in: /reports/screenshots/

🧪 Sample Test (LoginTest.java)
@Test
public void testLogin() {
LoginPage login = new LoginPage();
InventoryPage home = login.login("standard_user", "secret_sauce");

    Assert.assertTrue(home.isLoaded(), "Home page did not load!");

}

☁️ GitHub Actions CI Pipeline
File: .github/workflows/ci.yml

Runs automatically on every push:
Setup Java
Setup Chrome + Driver
Run Selenium Tests
Upload Reports

📦 Maven Dependencies Includes:
1.selenium-java
2.testng
3.extentreports
4.slf4j-api
5.logback-classic
6.webdrivermanager

🤝 Contributions:
Contributions, issues, and pull requests are welcome!
If you like the project, ⭐ star the repository — it helps a lot.