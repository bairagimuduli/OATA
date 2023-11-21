# OATA
# OATA API Automation

This project is an API automation framework using Java, TestNG, and Rest Assured for testing OATA APIs.

## Overview

This Maven-based project provides a framework for automated testing of OATA APIs. It utilizes various dependencies:

- **TestNG:** A testing framework for running tests and managing test suites.
- **Rest Assured:** A Java library for RESTful API testing.
- **Jackson Databind:** For JSON data binding.
- **Gson:** A Java library to work with JSON.
- **Lombok:** A tool to reduce Java boilerplate code.

## Dependencies

The project's dependencies are managed in the `pom.xml` file:

- `org.testng:testng:7.7.0`
- `io.rest-assured:rest-assured:5.3.0`
- `com.fasterxml.jackson.core:jackson-databind:2.15.0`
- `com.fasterxml.jackson.core:jackson-annotations:2.14.2`
- `com.google.code.gson:gson:2.10.1`
- `org.projectlombok:lombok:RELEASE`

## Usage

### Prerequisites

- Java 11 or higher installed
- Maven installed

### Running Tests

1. Clone this repository.
2. Navigate to the project directory.
3. Run `mvn test` to execute the tests.

## Configuration

The `maven-surefire-plugin` in the `pom.xml` file is configured to:

- Ignore test failures for tests ending with `EmpTest.java`.

## Build Information

This project is configured to use Java 11:

```xml
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
</properties>
