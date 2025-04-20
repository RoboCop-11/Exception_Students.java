//Name- Manan Khanna
//AIML B3
//23070126156


/*
 * Student Class: Represents a student with attributes like PRN, name, DOB, and marks.
 * */

public class Student {
    //Private Instance variables for each of student's attributes
    private String prn;
    private String name;
    private String dob;
    private double marks;

    /*
     * Constructor to intialize a Student object
     *
     * PRN -  Unique 11 digit student PRN
     * Name - Student's full name
     * DOB - Date of birth of Student in DD/MM/YYYY format
     * Marks - Student's marks
     * */

    public Student(String prn, String name, String dob, double marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    /*
     * Getter methods to retrieve student details
     * */

    /*
     * Get the PRN of student
     * Return the PRN in String Format
     * */
    public String getPrn() {
        return prn;
    }

    /**
     * Get the name of the student.
     * Return Student's name
     */
    public String getName() {
        return name;
    }


    /**
     * Get the date of birth of the student.
     * Return Date of birth as a string
     */
    public String getDob() {
        return dob;
    }

    /**
     * Get the marks of the student.
     * Return Student's marks
     */
    public double getMarks() {
        return marks;
    }

    //Setter Methods to update Student Details

    /**
     * Set (update) the PRN of the student.
     * Parameter: Converted PRN
     */
    public String setPRN(String prn) {
        this.prn = prn;
        return prn;
    }

    /**
     * Set (update) the date of birth of the student.
     * Parameter:  New date of birth
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Set (update) the marks of the student.
     * Parameter:  marks
     */
    public void setMarks(double marks) {
        this.marks = marks;
    }

    /**
     * Set (update) the name of the student.
     * Parameter : Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Display student details in a formatted way.
     */
    public void displayStudent() {
        System.out.println("\nPRN: " + prn + "\nName: " + name + "\nDOB: " + dob + "\nMarks: " + marks);
    }
}
