package Recursion;

import java.util.Scanner;

public class NthFibonacciNumber {

    public static int NthFibonacci(int num) {
        int result=0;
        // 1. Base Condition
        if(num<=1) {
            return num;
        }
        // 2. Recursion Function calling
        else {
            result=NthFibonacci(num-2)+NthFibonacci(num-1);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int n = sc.nextInt();
        System.out.println("Yout Fibonacci Number is :"+NthFibonacci(n));
        sc.close();
    }
}
