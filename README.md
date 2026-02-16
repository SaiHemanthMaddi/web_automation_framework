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
```bash
git clone https://github.com/your-username/web_automation_framework.git
```

2️⃣ Navigate into the Project
```bash
cd web_automation_framework
```

3️⃣ Execute Tests

**Run with default browser (Chrome):**
```bash
mvn clean test
```

**Run with specific browser:**
```bash
# Chrome
mvn clean test -Dbrowser=chrome

# Firefox
mvn clean test -Dbrowser=firefox

# Edge
mvn clean test -Dbrowser=edge
```

**Run in headless mode:**
```bash
mvn clean test -Dbrowser=chrome -Dheadless=true
```

4️⃣ View Reports

Generated under:

`/reports/AutomationReport-TIMESTAMP.html`  

`/reports/screenshots/`

🧪 Sample Test
@Test
public void testLogin() {
LoginPage login = new LoginPage();
InventoryPage home = login.login("standard_user", "secret_sauce");

    Assert.assertTrue(home.isLoaded(), "Home page did not load!");

}

🔄 GitHub Actions – CI/CD Pipeline

The project includes a comprehensive CI/CD pipeline with multiple trigger options:

### 🕐 Scheduled Nightly Runs
- **Automatically runs every night at 2:00 AM UTC**
- Tests execute on all browsers (Chrome, Firefox, Edge)
- Results and reports uploaded as artifacts

### 🎯 Manual Trigger
Run tests on-demand from GitHub Actions tab:

1. Go to **Actions** → **Selenium Test Automation**
2. Click **Run workflow**
3. Select browser:
   - `chrome` - Run on Chrome only
   - `firefox` - Run on Firefox only
   - `edge` - Run on Edge only
   - `all` - Run on all browsers in parallel

### 🔀 Multi-Browser Matrix Execution
- Tests run in parallel across multiple browsers
- Each browser gets its own test environment
- Independent artifact uploads per browser

### 📦 Automated Artifact Uploads
- **Test Reports**: HTML reports with detailed test results (30-day retention)
- **Screenshots**: Failure screenshots automatically captured and uploaded
- Download from Actions run summary page

### ✅ Pipeline Features
- ✔ Installs Java 17
- ✔ Installs Chrome, Firefox, and Edge browsers
- ✔ Runs tests in headless mode
- ✔ Uploads Extent Reports + Screenshots
- ✔ Provides test summary in workflow output

**Workflow file:** `.github/workflows/ci.yml`

📦 Dependencies (Maven)

1.selenium-java

2.testng

3.extentreports

4.slf4j

5.logback

6.webdrivermanager

🤝 Contributions: PRs and improvements are welcome!