package studentDatabaseApplication;

import java.util.Scanner;

public class Student {
    private String studentFirstName;
    private String studentSurName;
    private String studentId;
    private String courses = "";
    private final int courseFee = 600;
    private int totalFee = 0;
    private int studentBalance = 0;

    Scanner input = new Scanner(System.in);


    public Student() {
        System.out.print("Student Name: ");
        this.studentFirstName = input.next();
        System.out.print("Student Surname: ");
        this.studentSurName = input.next();
        enroll();
        payment();
    }

    public void enroll() {
        System.out.println("Which Course student will enroll in?" + "  \"Q to Submit\"");
        do {
            System.out.print("Course Name: ");
            String choice = input.next();
            if (choice.equalsIgnoreCase("Q")) {
                break;
            }
            courses += choice + " ";
            totalFee += courseFee;
        } while (true);
    }


    public void payment() {
            System.out.print("Payment: ");
            studentBalance = input.nextInt();
            studentBalance -= totalFee;

    }

    public String toString(){
        return "\nStudent Name: " + studentFirstName + " " + studentSurName + "\nStudent Courses: " + courses + "\nStudent Balance: "+ studentBalance +"\n" + "*".repeat(30);
    }


}
