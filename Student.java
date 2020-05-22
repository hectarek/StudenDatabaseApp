import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Student {
    
    Map<Integer, String> classifications = new HashMap<Integer, String>();
    private static double costOfCourse = 600.00;
    private static int newId = 1000;

    private String firstName, lastName, hometown, major, id, courses;
    private int age, classYear, totalCredits, currentCredits;
    private int tuitionBalance = 0;
    private LocalDate dob;


   //Constructor

   public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the student's first name?");
        String fNameResponse = in.nextLine();
        System.out.println("What is the student's last name?");
        String lNameResponse = in.nextLine();
        System.out.println("What is the student's major?");
        String majorResponse = in.nextLine();
        setClassYear();
        
        this.firstName = fNameResponse;
        this.lastName = lNameResponse;
        this.major = majorResponse;
   }
        
    public Student(String firstName, String lastName, String major, int classYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.classYear = classYear;
        setStudentID();
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

    private void setStudentID() {
        newId++;
        this.id = classYear + "" + newId;
    }

    private String getFullName() {
        return firstName + " " + lastName;
    }

    // Other methods
    public void enrollment() {
        
        System.out.println("Welcome to course enrollment! \n Please enter a course to enroll in, type 'Q' to exit enrollment");
       
        while (1 != 0) {
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            System.out.print("Course Name ('Q' to quit):" );
            course = in.nextLine();

            if (!course.equals("Q")) {
                this.courses += course + "\n"; 
                System.out.println(course + " Added.");
                this.tuitionBalance += costOfCourse; 
            } else {
                break;
            }  
        }

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);

    }

    public void getClassifications() {
        classifications.put(1, "Freshmen");
        classifications.put(2, "Sophomore");
        classifications.put(3, "Junior");
        classifications.put(4, "Senior");
        classifications.put(5, "Graduate");
        classifications.put(6, "Doctorate");
    }

    public void viewBalance(){
        System.out.println("Your balance is: $" + getTuitionBalance());
    }

    public void payTuition() {
        Scanner in = new Scanner(System.in);
        System.out.println("How much do you want to pay off tuition?");
        double payment = in.nextDouble();
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
        in.close();

    }
    public void payTuition(double payment) {
        tuitionBalance -= payment;
        System.out.println("Thank you for your payment of: $" + payment);
        viewBalance();
    }

    public void showInfo() {
        classifications.put(1, "Freshmen");
        classifications.put(2, "Sophomore");
        classifications.put(3, "Junior");
        classifications.put(4, "Senior");
        classifications.put(5, "Graduate");
        classifications.put(6, "Doctorate");

        System.out.println("Student Name: " + getFullName());
        System.out.println("Courses enrolled in: " + courses);
        System.out.println("Grade Level: " + classifications.get(classYear));
        viewBalance();
    }
    


}