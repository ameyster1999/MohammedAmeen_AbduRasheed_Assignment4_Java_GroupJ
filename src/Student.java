import java.time.LocalDate;

class Student {
    private static int idCounter = 1;

    private int studentId;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private double gpa;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, double gpa) {
        this.studentId = idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = String.valueOf(dateOfBirth);
        this.gpa = gpa;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}