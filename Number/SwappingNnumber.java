package Number;

public class SwappingNnumber {
    static void SingleLineSwapping(int a, int b) {
        System.out.println("Before Swapping : a = "+a+" b = "+b);

        a=(a+b)-(b=a); // Single Line of Code.
        System.out.println("after Swapping : a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        SwappingNnumber.SingleLineSwapping(20, 10);
    }
}
