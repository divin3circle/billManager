# Pizza Bill Generator System - Java Project

The **Pizza Bill Generator System** is a simple object-oriented programming (OOP) project created using Java. Its main purpose is to serve as a tool for practicing and showcasing the understanding of the Java programming language. The project primarily operates through the terminal for input and output interactions; however, there are plans to develop a React website for hosting the frontend part in the future.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Usage](#usage)
- [Class Structure](#class-structure)
- [Future Enhancements](#future-enhancements)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The **Pizza Bill Generator System** simulates a restaurant scenario where two types of pizzas are offered: normal pizza and deluxe pizza. The system calculates the cost of each type of pizza based on user preferences and additional selections like extra toppings, cheese, and packaging charges.

## Features

1. Calculate Cost of Normal Pizza:
    - Vegetarian: 300 Ksh
    - Non-Vegetarian: 350 Ksh
    - Additional Extra Toppings: 100 Ksh each
    - Additional Cheese: 100 Ksh

2. Calculate Cost of Deluxe Pizza:
    - Vegetarian: 400 Ksh
    - Non-Vegetarian: 450 Ksh
    - Extra Cheese and Toppings included

3. Takeaway Charges:
    - Packaging: 50 Ksh

## Usage

To use the **Pizza Bill Generator System**, follow these steps:

1. Clone the repository to your local machine:
```bash
git clone https://github.com/your-username/pizza-bill-generator.git
```
2Navigate to the project directory:
```bash
cd pizza-bill-generator
```
3Compile and run the Java program:
```bash
javac Main.java
java Main
```
4. Follow the prompts in the terminal to select pizza type, preferences, and packaging choice.

## Class Structure

The project consists of the following main classes:

1. `Pizza`:
- Properties: pizzaType, isVegetarian, basePrice, extraToppings, extraCheese
- Methods: calculateCost()
- etc

2. `NormalPizza` (extends `Pizza`):
- Methods: addToppings(), addCheese()

3. `DeluxePizza` (extends `Pizza`):
- Constructor: automatically includes extra cheese and toppings

4. `Takeaway`:
- Methods: applyPackagingCharge()

5. `Main`:
- Contains the main method to interact with the user and process pizza orders.

## Future Enhancements

While the current version of the **Pizza Bill Generator System** is a terminal-based application, there are plans to expand its capabilities by creating a React website for the frontend. This would involve developing a user-friendly interface to interact with the pizza ordering system.

## Contributing

Contributions to the project are welcome! If you have ideas for improvements, bug fixes, or new features, feel free to submit pull requests. Make sure to follow the project's coding conventions and keep the codebase clean and organized.

## License

This project is licensed under the [MIT License](LICENSE). You are free to modify and distribute the code as per the terms of the license.