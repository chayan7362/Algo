package Recursion;

import java.util.Scanner;

/**
 * LowestCommanMultiple
 */
public class LowestCommanMultiple {

    static int Comm=1;
    static int LCM(int n1, int n2) {
        if(Comm%n1==0 && Comm%n2==0) {
            return Comm;
        }
        else {
            Comm++;
            LCM(n1, n2);
            return Comm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n1 Number :");
        int n1 = scanner.nextInt();
        System.out.println("Enter n2 Number :");
        int n2 = scanner.nextInt();
        System.out.println(LCM(n1, n2));

        scanner.close();
    }
}