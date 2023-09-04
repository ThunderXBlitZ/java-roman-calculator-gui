# Roman Numeral Converter

## Given Requirements

1. Allow the user to enter a Roman numeral and the application will provide the numerical value.

2. Provide the inverse translation, where the user can enter a number and the application will translate it to Roman Numeral

## Architecture and Design Mockup

Java Swing GUI MVP App - using abbreviated Model View Presenter (for simplicity)

<p? align="center">
<img src="./screenshots/architecture.png?raw=true">
</p?>

## Concrete Requirements

- 2 modes

  - Enter Roman numeral, and click `Calculate!` button, this will produce the numeral

  - Enter Numeral, and click `Calculate!` button, this will produce the Roman numeral

    - Require `RomantoNumeralCalculator` utility class

  - `Change Mode!` button toggles the App's configuration between the two modes

- MVP Architecture

  - Model class:

    - Simple Model that holds the mode and 2 values

    - Input Validators

  - View class:

    - 1 window containing 1 title label, 2 i/o labels, , 1 error label, 2 i/o text boxes, 2 buttons

    - Title and error labels, and output text box can be updated by Presenter

  - Presenter class

    - 2 Button Listeners
    - Updates Model and View

## Tests

- Various tests for Roman and Numeral logic, esp edge cases (e.g. IV and 4)

## Screenshots

<p align="center">
  <img src="./screenshots/roman.png?raw=true" width="500" height="400">
  <img src="./screenshots/numeral.png?raw=true" width="500" height="400">
  <img src="./screenshots/roman_error.png?raw=true" width="500" height="400">
  <img src="./screenshots/numeral_error.png?raw=true" width="500" height="400">
</p>
