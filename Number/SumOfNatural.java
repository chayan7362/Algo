package Number;

public class SumOfNatural {
    // Logic : 1 using Loop
    static void SumOfN(int n) {

    }
    // Logic : 2 using Recursion
    static int Sum(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n+Sum(n-1);
        }
    }
    // Logic : 3 Using Math Formula
    static int MathFormula(int n) {
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        System.out.println("Using Recursion : "+Sum(5));
        System.out.println("Using Math Formula : "+MathFormula(6));
    }
}
