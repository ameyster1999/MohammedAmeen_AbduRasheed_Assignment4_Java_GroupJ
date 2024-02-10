import java.util.ArrayList;
import java.util.Scanner;

class StudentRecordSystem {
    private ArrayList<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        System.out.println("1. Add a new student record");
        System.out.println("2. Update an existing student record");
        System.out.println("3. Display all student records");
        System.out.println("4. Search for a student by ID");
        System.out.println("5. Calculate and display the average GPA of all students");
        System.out.println("6. Exit");
    }

    public void start() {
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addStudentRecord();
                    break;
                case 2:
                    updateStudentRecord();
                    break;
                case 3:
                    displayAllStudentRecords();
                    break;
                case 4:
                    searchStudentById();
                    break;
                case 5:
                    calculateAverageGPA();
                    break;
                case 6:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);
    }

    private void addStudentRecord() {
        // Implement logic to add a new student record
    }

    private void updateStudentRecord() {
        // Implement logic to update an existing student record
    }

    private void displayAllStudentRecords() {
        // Implement logic to display all student records
    }

    private void searchStudentById() {
        // Implement logic to search for a student by ID
    }

    private void calculateAverageGPA() {
        // Implement logic to calculate and display the average GPA of all students
    }
}