Web Automation Framework (Selenium • TestNG • Maven)

A clean, scalable, CI-ready automation framework built using Java, Selenium WebDriver, TestNG, Extent Reports, and
GitHub Actions.
Designed for real-world projects with clear structure, maintainability, and reporting.

⭐ Key Features
Page Object Model (POM) – clean, reusable UI components
Centralized Driver Management – single place for browser lifecycle
Explicit Wait Wrapper – stable, reliable waits
Extent Reports (HTML) – timestamped reports saved automatically
Screenshots on Failure – auto-captured & attached to report
Logging with SLF4J + Logback – debug, info, and error logs
CI/CD with GitHub Actions – runs on every push
Maven Build – clean & modular project dependencies

📁 Project Structure
web_automation_framework
│
├── src
│ ├── main
│ │ └── java/com/example/automation/framework
│ │ ├── pages/
│ │ ├── utils/
│ │ ├── reporting/
│ │ └── DriverManager.java
│ │
│ └── test
│ └── java/tests
│ └── LoginTest.java
│
├── reports/
│ ├── AutomationReport-TIMESTAMP.html
│ └── screenshots/
│ └── failed_test_TIMESTAMP.png
│
└── .github/workflows/ci.yml

⚙️ Tech Stack

| Component   | Technology                  |
|-------------|-----------------------------|
| Language    | Java 17+                    |
| Automation  | Selenium WebDriver 4.x      |
| Test Runner | TestNG                      |
| Reporting   | Extent Reports (aventstack) |
| Logging     | SLF4J + Logback             |
| Build Tool  | Maven                       |
| CI/CD       | GitHub Actions              |
| Browser     | Chrome & ChromeDriver       |

🚀 How to Run Tests
1️⃣ Clone the Repository
git clone https://github.com/your-username/web_automation_framework.git

2️⃣ Navigate into the Project
cd web_automation_framework

3️⃣ Execute Tests
mvn clean test

4️⃣ View Reports
/reports/AutomationReport-TIMESTAMP.html  
/reports/screenshots/

Generated under:
/reports/AutomationReport-TIMESTAMP.html  
/reports/screenshots/

🧪 Sample Test
@Test
public void testLogin() {
LoginPage login = new LoginPage();
InventoryPage home = login.login("standard_user", "secret_sauce");

    Assert.assertTrue(home.isLoaded(), "Home page did not load!");

}

🔄 GitHub Actions – CI Pipeline
Automatically runs on every push:
✔ Installs Java
✔ Installs Chrome + ChromeDriver
✔ Runs Maven tests
✔ Uploads Extent Reports + Screenshots

Workflow file:
.github/workflows/ci.yml

📦 Dependencies (Maven)
1.selenium-java
2.testng
3.extentreports
4.slf4j
5.logback
6.webdrivermanager

🤝 Contributions: PRs and improvements are welcome!