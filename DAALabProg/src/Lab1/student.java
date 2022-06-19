package Lab1;

import java.util.Scanner;

public class student {
    String USN;
    String Name;
    String branch;
    String phone;

    void insertRecord(String reg, String name, String brnch, String ph) {
        USN = reg;
        Name = name;
        branch = brnch;
        phone = ph;
    }

    void displayRecord() {
        System.out.printf("USN = " + USN + "\nName = " + Name + "\nBranch = " + branch + "\nPhone no. = " + phone);
        System.out.println();
    }

    public static void main(String args[]) {
        student s[] = new student[100];
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("**********************************");
        System.out.print("Enter the number of students : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
            s[i] = new student();
        for (int j = 0; j < n; j++) {
            System.out.println("Enter the USN, Name, Branch, Phone");
            String USN = sc.next();
            String Name = sc.next();
            String branch = sc.next();
            String phone = sc.next();
            s[j].insertRecord(USN, Name, branch, phone);

        }
        System.out.println();
        System.out.println("The student details are :");

        for (int m = 0; m < n; m++) {
            s[m].displayRecord();
            System.out.println();
        }

        sc.close();
    }
}
