//Name-Manan Khanna
//AIMLB3
//23070126156


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Data Entry System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1:
                        manager.addStudent(sc); // may throw StudentAlreadyExistsException, InvalidMarksException, InvalidPRNException
                        break;
                    case 2:
                        manager.displayStudents();
                        break;
                    case 3:
                        manager.searchByPRN(sc); // may throw StudentNotFoundException
                        break;
                    case 4:
                        manager.searchByName(sc); // may throw StudentNotFoundException
                        break;
                    case 5:
                        manager.searchByPosition(sc);
                        break;
                    case 6:
                        manager.updateStudent(sc); // may throw StudentNotFoundException, InvalidMarksException, InvalidPRNException
                        break;
                    case 7:
                        manager.deleteStudent(sc); // may throw StudentNotFoundException
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (StudentAlreadyExistsException | InvalidMarksException |
                     StudentNotFoundException | InvalidPRNException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (choice != 8);

        sc.close();
    }
}
