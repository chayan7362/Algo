package Number;

public class Factorial {
    // Logic : 1 --> Using Loop
    static int UsingLoop(int n) {
        int f = 1;
        for(int i = 1;i<=n;i++) {
            f*=i;
        }
        return f;
    }

    // Logic : 2 --> Using Recursion
    static int fac(int n) {
        if(n==0) {
            return 1;
        }
        else {
            return n*fac(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Using Loop : "+UsingLoop(5));
        System.out.println("Using Recursion : "+fac(5));
    }
}
