# SauceDemo E-Commerce Automation Framework

A professional, robust, and highly scalable Test Automation Framework built from scratch to automate end-to-end shopping scenarios on the **SauceDemo** web application.

This project is built using modern software testing standards and industry best practices.

---

##  Key Features & Architecture
- **Page Object Model (POM):** Implemented a clean design pattern to separate page UI elements and behaviors from the actual test scripts, maximizing code reusability and maintainability.
- **BaseTest Architecture:** Built a centralized base class using OOP Inheritance to manage browser lifecycle operations securely (`@BeforeMethod` and `@AfterMethod`).
- **Explicit Dynamic Waits:** Abolished flaky and slow hardcoded delays (`Thread.sleep`) in favor of dynamic `WebDriverWait` (Expected Conditions) to ensure rock-solid stability and faster execution.
- **Data Isolation:** Complete decoupling of test logic from selector definitions and business action language.

---

##  Tech Stack & Tools
- **Language:** Java 17
- **Automation Tool:** Selenium WebDriver (v4.21.0)
- **Testing Framework:** TestNG
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA

---

##  Project Structure
```text
MyAutomation/
│
├── src/
│   └── test/
│       └── java/
│           ├── org/example/
│           │   ├── pages/           # Page Object Classes
│           │   │   ├── LoginPage.java
│           │   │   ├── InventoryPage.java
│           │   │   └── CheckoutPage.java
│           │   │
│           │   └── tests/           # Test Suites & Base Setup
│           │       ├── BaseTest.java
│           │       └── SauceDemoTest.java
│           └── ...
└── pom.xml                          # Maven Dependencies Setup