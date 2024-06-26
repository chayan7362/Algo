package Recursion;

import java.util.Scanner;

/**
 * FactorialNumber
 */
public class FactorialNumber {

    public static int Factorial(int num) {
        int FacNum;
        // 1 . Base case condition
        if(num==0 || num==1) {
            return 1;
        }
        // 2. Recursive function calling
        else {
            FacNum=num*Factorial(num-1);
        }
        return FacNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int n =sc.nextInt();
        System.out.println(Factorial(n));
        sc.close();
    }
}