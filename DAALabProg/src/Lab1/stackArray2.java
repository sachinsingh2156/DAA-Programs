package Lab1;

import java.util.Scanner;

class stackArray2 {
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];

    stackArray2() {
        top = -1;
    }

    boolean push(Scanner sc) {
        if (top == maxsize - 1) {
            System.out.println("Overflow !!");
            return false;
        } else {
            System.out.println("Enter Value");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item pushed");
            return true;
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Underflow !!");
            return false;
        } else {
            top--;
            System.out.println("Item popped");
            return true;
        }
    }

    void display() {
        System.out.println("Printing stack elements .....");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        stackArray2 s = new stackArray2();
        System.out.println("*********Stack operations using array*********");
        System.out.println("\n------------------------------------------------\n");
        while (choice != 4) {
            System.out.println("\nChose one from the below options...");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    s.push(sc);
                    break;
                }
                case 2: {
                    s.pop();
                    break;
                }
                case 3: {
                    s.display();
                    break;
                }
                case 4: {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Please Enter valid choice ");
                }
            }

        }
        ;
    }
}
