package studentDatabaseApplication;

import java.util.Arrays;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        String mavi = "\u001B[34m";
        Scanner input = new Scanner(System.in);
        System.out.print(mavi + "How many new students will be added to the database: ");
        int numOfStudent = input.nextInt();
        Student[] std = new Student[numOfStudent];
        for (int i = 0; i < numOfStudent; i++) {
            std[i] = new Student();
            System.out.println("*".repeat(30));
        }
        System.out.println(Arrays.toString(std));


    }
}
