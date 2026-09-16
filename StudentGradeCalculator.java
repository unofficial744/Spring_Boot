import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Result obj = new Result();

        
        System.out.print("Enter Student Name : ");
        obj.name = sc.nextLine();

        System.out.print("Enter Roll Number : ");
        obj.roll_no = sc.nextInt();
        
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter for subject " + (i + 1) + " : ");
            obj.arr[i] = sc.nextInt();
        }

        System.out.println("\n\n======== STUDENT RESULT ========");

        System.out.println("\nStudent Name : " + obj.name);
        System.out.println("Roll Number   : " + obj.roll_no);

        System.out.println("\nSubject 1 : " + obj.arr[0]);
        System.out.println("Subject 2 : " + obj.arr[1]);
        System.out.println("Subject 3 : " + obj.arr[2]);
        System.out.println("Subject 4 : " + obj.arr[3]);
        System.out.println("Subject 5 : " + obj.arr[4]);

        

        System.out.println("\nTotal Marks : " + obj.calculateTotal());
        System.out.println("Percentage  : " + obj.calculatePercentage() + "%");
        obj.calculateGrade();


        sc.close();

    }
}

class Student {
    String name;
    int roll_no;
    int arr[] = new int[5];

    int calculateTotal() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += arr[i];
        }
        return total;
    }

}

class Result extends Student {

    double calculatePercentage() {
        return calculateTotal() / 5.0;
    }

    void calculateGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}