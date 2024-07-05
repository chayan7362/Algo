package Number;

public class FindMaxTwo {
    static void FindMaxNum(int a, int b) {
        // Logic : 1
        int maxNum1 =(a>b)?a:b;
        System.out.println("Maximum Number : -> "+maxNum1);
        // Logic : 2 using Inbuild Method
        int maxNum2 = Math.max(a, b);
        System.out.println("Maximum Number : -> "+maxNum2);
    }
    public static void main(String[] args) {
        FindMaxTwo.FindMaxNum(10, 20);
    }
}
