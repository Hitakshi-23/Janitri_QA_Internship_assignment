# Janitri QA Internship Assignment

This repository contains the solution for the QA Internship assignment provided by Janitri, which includes:

## ✅ Task 1: Manual Test Cases (Excel)
- Comprehensive test cases for the login page of the Janitri Dashboard.
- Covered: Functional (Positive & Negative), UI, and Boundary test cases.
- Format: `.xlsx`

## ✅ Task 2: Automation Framework
A basic Java + Selenium WebDriver based test automation framework using the Page Object Model (POM) design pattern and TestNG.

### 🔧 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)

### 📁 Project Structure
```
|-- pom.xml
|-- testng.xml
|-- src
    |-- main
        |-- java
            |-- com.janitri.pages
                |-- LoginPage.java
    |-- test
        |-- java
            |-- com.janitri.tests
                |-- BaseTest.java
                |-- LoginTest.java
```

### 🧪 Automated Test Cases
1. `testLoginButtonDisabledWhenFieldAreEmpty()`
2. `testPasswordMaskedbutton()`
3. `testInvalidLoginShowErrorMsg()`
4. `testPageElementsPresent()`

### ▶️ How to Run
1. Clone this repository.
2. Install Java and Maven.
3. Replace `path/to/chromedriver` in `BaseTest.java` with your local path to `chromedriver`.
4. Run using:
```bash
mvn test
```

---

### 🔗 Test URL
[https://dev-dash.janitri.in](https://dev-dash.janitri.in)

---

### ✍️ Author
**Hitakshi Gupta**  
Email: hitakshigupta936@gmail.com  
GitHub: [github.com/Hitakshi-23](https://github.com/Hitakshi-23)

---

All the best to myself for the internship opportunity at Janitri! 🚀
