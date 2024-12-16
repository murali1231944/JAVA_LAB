package LAB2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name and the USN:");
            String name = sc.nextLine();
            String USN = sc.nextLine();

            System.out.println("Enter the number of subjects:");
            int n1 = sc.nextInt();
            int[] marks = new int[n1];
            int[] credits = new int[n1];

            for (int j = 0; j < n1; j++) {
                System.out.println("Enter the marks for subject " + (j + 1) + ":");
                marks[j] = sc.nextInt();
                System.out.println("Enter the credits for subject " + (j + 1) + ":");
                credits[j] = sc.nextInt();
            }
            sc.nextLine(); // Consume leftover newline

            students[i] = new Student(name, USN, credits, marks);
        }

        // Display SGPA for each student
        for (Student student : students) {
            student.s_gpa();
        }

        sc.close();
    }
}

class Student {
    String name;
    String USN;
    int[] credits;
    int[] marks;

    Student(String name, String USN, int[] credits, int[] marks) {
        this.name = name;
        this.USN = USN;
        this.credits = credits;
        this.marks = marks;
    }

    public void s_gpa() {
        int totalCredits = 0;
        int totalWeightedMarks = 0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            totalWeightedMarks += marks[i] * credits[i];
        }

        double sgpa = (double) totalWeightedMarks / totalCredits;
        System.out.println("NAME = " + name +
                "\nUSN = " + USN +
                "\nSGPA = " + sgpa);
    }
}
