package week5;

import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String args[]) {
        int one, two, three;
        int temp;
        Scanner input = new Scanner(System.in);
        int n = 3;

        int a[] = new int[4];
        System.out.println("Enter 3 numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Ascending Order:");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);


    }
}
