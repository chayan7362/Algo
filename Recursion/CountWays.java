package Recursion;

import java.util.Scanner;

public class CountWays {

    public static int NumberOfWays(int n) {
        int result =0;
        // 1. Base case Condition
        if(n<=1) {
            return n;
        }
        // 2. Recursion function calling
        else {
            result = NumberOfWays(n-1)+NumberOfWays(n-2);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Number :");
        int n = sc.nextInt();
        // relation b/w count of stairs and fiboncci series problem.................
        System.out.println("Number of Ways in :"+NumberOfWays(n+1)); // 
        sc.close();

    }
}
