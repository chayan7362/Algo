package Number;

public class FindMaxThree {
    // Logic : 1 --> Single line of Code
    static int MaxThree(int a, int b, int c) {
        int Max = (a>b && a>c)?a:((b>c)?b:c);
        return Max;
    }

    // Logic : 2 --> Using Inbuild Methods
    static int MaxThree2(int a, int b, int c) {
        int Max1= Math.max(Math.max(a, b),c);
        return Max1;
    }
    public static void main(String[] args) {

        System.out.println("Using Single Line Code : "+MaxThree(10, 30, 20));
        System.out.println("Using Inbuild Function : "+MaxThree2(20, 10, 30));
    }
}
