//Name- Manan Khanna
//AIML B3
//23070126156

import java.util.*;
import java.util.regex.*;

public class StudentManager {
    // List to store student objects
    private ArrayList<Student> studentList = new ArrayList<>();

    // Helper method to validate PRN format
    private boolean isValidPRN(String prn) {
        // Assuming PRN format is something like "1234AB56" (4 digits, 2 letters, 2 digits)
        String regex = "^[0-9]{4}[A-Za-z]{2}[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(prn);
        return matcher.matches();
    }

    // Method to add a new student to the list
    public void addStudent(Scanner sc) throws StudentAlreadyExistsException, InvalidMarksException, InvalidPRNException {
        sc.nextLine();  // consume the newline character
        System.out.print("Enter PRN: ");
        String prn = sc.nextLine();

        // Check if PRN is valid
        if (!isValidPRN(prn)) {
            throw new InvalidPRNException("Invalid PRN format.");
        }

        // Check if PRN already exists
        for (Student s : studentList) {
            if (s.getPrn().equals(prn)) {
                throw new StudentAlreadyExistsException("Student with PRN already exists.");
            }
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Date of Birth(DD/MM/YYYY): ");
        String dob = sc.nextLine();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks should be between 0 and 100.");
        }

        studentList.add(new Student(prn, name, dob, marks));
        System.out.println("Student Added Successfully!");
    }

    // Method to display all students in the list
    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Nothing to show!");
            return;
        }
        for (Student s : studentList) {
            s.displayStudent();
        }
    }

    // Method to search for a student by PRN
    public void searchByPRN(Scanner sc) {
        System.out.print("Enter PRN to search: ");
        String prn = sc.next();
        for (Student s : studentList) {
            if (s.getPrn().equals(prn)) {
                System.out.println("Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Method to search for a student by Name
    public void searchByName(Scanner sc) {
        System.out.print("Enter Name to search: ");
        String name = sc.next();
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found:");
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Method to search for a student by position in the list
    public void searchByPosition(Scanner sc) {
        System.out.print("Enter Position (Index starts from 0): ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < studentList.size()) {
            System.out.println("Student at Position " + pos + ":");
            studentList.get(pos).displayStudent();
        } else {
            System.out.println("Invalid position!");
        }
    }

    // Method to update student details using PRN
    public void updateStudent(Scanner sc) throws StudentNotFoundException, InvalidMarksException, InvalidPRNException {
        System.out.print("Enter PRN to update: ");
        String prn = sc.next();

        // Check if PRN is valid
        if (!isValidPRN(prn)) {
            throw new InvalidPRNException("Invalid PRN format.");
        }

        boolean found = false;

        for (Student s : studentList) {
            if (s.getPrn().equals(prn)) {
                System.out.print("Enter new Name: ");
                s.setName(sc.next());
                System.out.print("Enter new DOB: ");
                s.setDob(sc.next());
                System.out.print("Enter new Marks: ");
                double marks = sc.nextDouble();
                if (marks < 0 || marks > 100) {
                    throw new InvalidMarksException("Marks should be between 0 and 100.");
                }
                s.setMarks(marks);
                System.out.println("Student details updated!");
                found = true;
                break;
            }
        }

        if (!found) {
            throw new StudentNotFoundException("Student not found for update.");
        }
    }

    // Method to delete a student from the list using PRN
    public void deleteStudent(Scanner sc) throws StudentNotFoundException {
        System.out.print("Enter PRN to delete: ");
        String prn = sc.next();

        boolean found = false;

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getPrn().equals(prn)) {
                studentList.remove(i);
                System.out.println("Student deleted!");
                found = true;
                break;
            }
        }

        if (!found) {
            throw new StudentNotFoundException("Student not found for deletion.");
        }
    }
}

