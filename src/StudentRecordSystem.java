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
        System.out.print("Enter student ID to update: ");
        int studentIdToUpdate = scanner.nextInt();

        // Perform search for student by ID
        for (Student student : studentList) {
            if (student.getStudentId() == studentIdToUpdate) {
                System.out.println("Enter new details for the student:");

                System.out.print("First Name: ");
                student.setFirstName(scanner.next());

                System.out.print("Last Name: ");
                student.setLastName(scanner.next());

                System.out.print("Date of Birth (YYYY-MM-DD): ");
                student.setDateOfBirth(scanner.next());

                System.out.print("GPA: ");
                student.setGpa(scanner.nextDouble());



                System.out.println("Student record updated successfully.");
                return;
            }
            else {
                System.out.println("student not present in records");
            }
        }

        System.out.println("Student with ID " + studentIdToUpdate + " not found.");
    }

    private void displayAllStudentRecords() {
        if (studentList.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            System.out.println("Student Records:");
            for (Student student : studentList) {
                System.out.println(student.getStudentId() + ": " + student.getFirstName() + " " + student.getLastName());
            }
        }
    }

    private void searchStudentById() {
        // Implement logic to search for a student by ID
        System.out.print("Enter student ID to search: ");
        int studentIdToSearch = scanner.nextInt();
    
        for (Student student : studentList) {
            if (student.getStudentId() == studentIdToSearch) {
                System.out.println("Student found:");
                System.out.println("ID: " + student.getStudentId());
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName());
                System.out.println("Date of Birth: " + student.getDateOfBirth());
                System.out.println("GPA: " + student.getGpa());
                return;
            }
        }
    
        System.out.println("Student with ID " + studentIdToSearch + " not found.");
    }

    private void calculateAverageGPA() {
        if (studentList.isEmpty()) {
            System.out.println("No student records available.");
        } else {
            double totalGPA = 0.0;

            for (Student student : studentList) {
                totalGPA += student.getGpa();
            }

            double averageGPA = totalGPA / studentList.size();
            System.out.println("Average GPA of all students: " + averageGPA);
        }
    }
}