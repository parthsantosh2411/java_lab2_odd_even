# Even and Odd Number Separator

## Description
This Java program efficiently categorizes a list of numbers entered by the user into even and odd categories. It employs a well-structured class design to manage the numbers effectively, ensuring a clear separation between even and odd numbers.

## Key Functions and Methods

### NumberSeparator Class
- **Constructor**: `NumberSeparator(int size)`
  - **Parameters**: `size` - the size of the arrays for even and odd numbers.
  - **Description**: Initializes arrays for even and odd numbers with the specified size. It also sets counters (`evenCount` and `oddCount`) to 0.
- **Method**: `void addNumber(int num)`
  - **Parameters**: `num` - the number to categorize as even or odd.
  - **Description**: Determines whether `num` is even or odd. If even, it's added to the even array, and `evenCount` is incremented. If odd, it's added to the odd array, and `oddCount` is incremented.
- **Method**: `void displayEvenNumbers()`
  - **Description**: Prints each even number stored in the even array up to `evenCount`.
- **Method**: `void displayOddNumbers()`
  - **Description**: Prints each odd number stored in the odd array up to `oddCount`.

### SeparateEvenOddNumbers Class
- **Method**: `public static void main(String[] args)`
  - **Description**: Entry point of the program. It collects user input, initializes a `NumberSeparator` instance, categorizes numbers as even or odd, and displays the results.

## Usage
1. Compile the Java files.
2. Run `SeparateEvenOddNumbers` to start the program.
3. Enter the desired size of the array.
4. Input each number as prompted.
5. The program will display the even numbers followed by the odd numbers.

## Features
- Dynamic input size based on user preference.
- Efficient separation of even and odd numbers.
- Clear display of categorized numbers.

## Requirements
- Java Development Kit (JDK) to compile and run the program.

## Compilation and Execution
To compile: `javac SeparateEvenOddNumbers.java`  
To run: `java SeparateEvenOddNumbers`
