package Lab1;

import java.io.*;

class stackArray {
    static int max = 10, i, top, ch, item;
    static int a[] = new int[10];

    stackArray() {
        top = -1;
    }

    static void push() {
        if (top == max)
            System.out.println("stack is full");
        else

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the element: ");
                item = Integer.parseInt(br.readLine());
                a[++top] = item;
            } catch (Exception e) {
            }
    }

    static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Poped item:" + a[top]);
            top--;
        }

    }

    static void display() {
        System.out.println("Elements in stack are:");
        for (i = top; i > 0; i--)
            System.out.println(a[i]);
    }

    public static void main(String args[]) throws IOException {
        while ((boolean) true) {
            System.out.printf("Enter\n1.Push 2.Pop 3.Display 4.Exit\n");

            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                ch = Integer.parseInt(br.readLine());
            } catch (Exception e) {
            }
            if (ch == 4)
                break;
            else {
                switch (ch) {
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        display();
                        break;
                }
            }
        }
    }
}
