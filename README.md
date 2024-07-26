
# Java Design Patterns
Welcome to the Java Design Patterns repository! This Repository is for the purpose of learning design pattern in java
This repository contains code examples for all the major design patterns in Java, implemented with practical examples.

## Table of Contents

1. [Introduction](#introduction)
2. [Design Patterns](#design-patterns)
    - [Creational Patterns](#creational-patterns)
    - [Structural Patterns](#structural-patterns)
    - [Behavioral Patterns](#behavioral-patterns)
3. [How to Use](#how-to-use)
4. [Contributing](#contributing)
5. [License](#license)

## Introduction

Design patterns are typical solutions to common problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code. This repository provides sample code for the most widely used design patterns in Java.

## Design Patterns

### Creational Patterns

1. **Singleton**
    - Example: Logger implementation, Having a single Logger instance per file, and using it in whole application runtime.
2. **Factory Method**
    - Example: Message Template creation factory (DigitalMessage, TextMessage)
3. **Abstract Factory**
    - Example: UI component factory (Create multiple component of UI, based on the color selected by User, as in passed argument)
4. **Builder**
    - Example: Building complex `Class` objects, And also in some cases when we want to create object by passing the properties of own choice.
5. **Prototype**
    - UseCase: When we have Object that are not changed frequently, Or create lot of similar objects
    -  Example: Cloning shapes
6. **Object Pool**
    - Example: Reusing a pool of database connections

### Structural Patterns

1. **Adapter**
    - Example: Adapting different logging frameworks
2. **Bridge**
    - Example: Separating interface from implementation for remote controls
3. **Composite**
    - Example: Building a tree structure for a company's organizational chart
4. **Decorator**
    - Example: Extending functionalities of a text editor
5. **Facade**
    - Example: Simplifying access to a complex video conversion library
6. **Flyweight**
    - Example: Efficiently handling a large number of graphical objects
7. **Proxy**
    - Example: Providing a placeholder for expensive objects (e.g., virtual proxies, protection proxies)

### Behavioral Patterns

1. **Chain of Responsibility**
    - Example: Processing a request through a chain of handlers
2. **Command**
    - Example: Implementing undo/redo functionalities in a text editor
3. **Interpreter**
    - Example: Parsing and interpreting a simple language or expressions
4. **Iterator**
    - Example: Iterating over a collection of books in a library
5. **Mediator**
    - Example: Managing interactions between GUI components
6. **Memento**
    - Example: Saving and restoring the state of an object
7. **Observer**
    - Example: Implementing a subscription mechanism for an event manager
8. **State**
    - Example: Managing state changes in a vending machine
9. **Strategy**
    - Example: Implementing different sorting algorithms
10. **Template Method**
    - Example: Defining a skeleton of an algorithm in a base class
11. **Visitor**
    - Example: Performing operations on a tree structure (e.g., file system)

## How to Use

1. **Clone the repository:**

    ```bash
    git clone https://github.com/your-username/java-design-patterns.git
    cd java-design-patterns
    ```

2. **Navigate to the pattern you want to explore:**

    Each pattern has its own directory with the following structure:

    ```
    pattern-name/
      ├── src/
      │   ├── main/
      │   │   └── java/
      │   │       └── com/
      │   │           └── example/
      │   │               └── patternname/
      │   │                   └── [PatternName].java
      │   └── test/
      │       └── java/
      │           └── com/
      │               └── example/
      │                   └── patternname/
      │                       └── [PatternNameTest].java
      ├── README.md
      └── pom.xml
    ```

3. **Build and run the examples:**

    Each pattern can be built and run individually. Navigate to the specific pattern directory and use Maven to build and run the code:

    ```bash
    mvn clean install
    mvn exec:java -Dexec.mainClass="com.example.patternname.Main"
    ```

## Contributing

Contributions are welcome! Please read the [contributing guidelines](CONTRIBUTING.md) before submitting a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

