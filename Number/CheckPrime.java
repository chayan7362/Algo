package Number;

public class CheckPrime {
    // Logic : 1 --> Using Loop
    static boolean Check(int n) {
        int factor = 0;
        for(int i=1;i<=n;i++) {
            if(n%i==0) {
                factor++;
            }
        }
        if(factor==2) {
            return true;
        }
        else {
            return false;
        }
    }
    // Logic : 2 --> Using Recursion   
    static boolean Check1(int n, int i) { // here i=n/2
        if(i==1) { 
            return true;
        }
        else if (n%i==0) {
            return false;
        }
        else {
            return Check1(n, --i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Check Number Prime or Not Using Loop : "+Check(5));
        System.out.println("Check Number Prime or Not Using Loop : "+Check(4));

        int n = 5; 
        int i = n/2;
        System.out.println("Using Recursion : "+Check1(n, i));
    }
}
