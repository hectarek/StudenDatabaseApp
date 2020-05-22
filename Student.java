import java.time.LocalDate;
import java.util.Scanner;

public class Student {
    
    private double costOfCourse = 600.00;

    private String firstName, lastName, hometown, major, id, courses;
    private int age, classYear, totalCredits, currentCredits, tuitionBalance;
    private LocalDate dob;

    public Student(String firstName, String lastName, String major, int classYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.classYear = classYear;
    }

    //Getters and Setters

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

    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getClassYear() {
        return classYear;
    }
    public void setClassYear() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter class year as a number: \n 1-Freshman\n 2-Sophomore\n 3-Junior\n 4-Senior\n 5-Graduate\n 6-Doctorate");
        int level = in.nextInt();
        in.close();
        this.classYear = level;
    }
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    public int getTotalCredits() {
        return totalCredits;
    }
    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public int getCurrentCredits() {
        return currentCredits;
    }
    public void setCurrentCredits(int currentCredits) {
        this.currentCredits = currentCredits;
    }

    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getTuitionBalance() {
        return tuitionBalance;
    }
    public void setTuitionBalance(int tuitionBalance) {
        this.tuitionBalance = tuitionBalance;
    }

    // Private Generating Methods





    // Other methods
    
    


}