# Student Data Entry System with Custom Exceptions

## Overview
This project implements a **Student Data Entry System** where you can manage student records by performing operations like adding, displaying, searching, updating, and deleting students. The system also includes custom exceptions to handle various error conditions such as invalid input or data already existing.

### Features:
1. **Add Student**: Add a new student's data including PRN, Name, Marks, and Position.
2. **Display Students**: Display the list of all students in the system.
3. **Search Student by PRN**: Search for a student by their unique PRN (Personal Registration Number).
4. **Search Student by Name**: Search for a student by their name.
5. **Search Student by Position**: Search for students based on their position.
6. **Update Student**: Update a student's information such as marks or position.
7. **Delete Student**: Remove a student record from the system.

### Custom Exceptions:
- **StudentAlreadyExistsException**: Thrown when a student with the same PRN is already in the system.
- **StudentNotFoundException**: Thrown when a student with the given PRN is not found.
- **InvalidMarksException**: Thrown when the entered marks are outside the acceptable range (e.g., negative marks or marks greater than 100).
- **InvalidPositionException**: Thrown when the entered position is invalid or out of bounds.
- **InvalidPRNException**: Thrown when the entered PRN does not match the expected format.
- **EmptyStudentListException**: Thrown when performing an operation (like display or search) on an empty list of students.

### Requirements:
- **Java 8+**: This project is written in Java, using standard libraries and features.
- **JDK 8+**: Make sure you have JDK 8 or later installed to compile and run the application.

### Project Structure:
```
- src
  - exceptions
    - StudentAlreadyExistsException.java
    - StudentNotFoundException.java
    - InvalidMarksException.java
    - InvalidPositionException.java
    - InvalidPRNException.java
    - EmptyStudentListException.java
  - operations
    - StudentManager.java
  - Main.java
```

### How to Run:
1. Clone the repository or download the source code.
2. Open the project in your preferred Java IDE (like IntelliJ IDEA or Eclipse).
3. Compile and run the `Main.java` file to start the program.
4. Follow the on-screen instructions to interact with the student data entry system.

### Sample Run:
```
===== Student Data Entry System =====
1. Add Student
2. Display Students
3. Search Student by PRN
4. Search Student by Name
5. Search Student by Position
6. Update Student
7. Delete Student
8. Exit
Enter your choice: 1

Enter Student PRN: 123
Enter Student Name: John Doe
Enter Marks (0-100): 85
Enter Position: 1

Student added successfully!
```

### Exceptions Handling:
The program uses custom exceptions to ensure that the input data is valid and provides meaningful error messages when the user provides invalid input:
- **Invalid PRN format** will trigger `InvalidPRNException`.
- **Negative or out-of-range marks** will trigger `InvalidMarksException`.
- **Attempting to add a student with an existing PRN** will trigger `StudentAlreadyExistsException`.
- **Operations on an empty student list** will trigger `EmptyStudentListException`.

