import java.util.Scanner;

public class StudentDB {

    public static void main(String[] args) {

        System.out.println("Enter the number of students:");
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int n = 0; n < numberOfStudents; n++) {
            students[n] = new Student();
            students[n].enrollment();
            students[n].payTuition();
        }

        for (int n = 0; n< numberOfStudents; n++) {
            System.out.println(students[n].toString());

        }

    }

}