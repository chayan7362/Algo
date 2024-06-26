package Recursion;

import java.util.Scanner;

public class Power {

    public static int PowerValue(int a, int b) {
        int mid=0,result=0, finalResult=0;
        // 1. Base case Condition
        if(b == 1) {
            return a;
        }
        // 2. Recursion Function calling
        else {
        mid=b/2;
        result=PowerValue(a,mid);
        finalResult=result*result;
        if (b%2==0) {
            return finalResult;
        }
        else {
            return a*finalResult;
        }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int a = sc.nextInt();
        System.out.print("Enter your Pow Value :");
        int b= sc.nextInt();
        System.out.println(PowerValue(a, b));
        sc.close();
    }
}
