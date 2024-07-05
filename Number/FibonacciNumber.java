package Number;

import java.util.ArrayList;

public class FibonacciNumber {
    
    // Logic : 1 : Using ArrayList
    static ArrayList<Integer> getFibonacciNumber(int n) {
        int a, b, c, i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        a=0;
        b=1;
        al.add(a);
        al.add(b);
        for(i=1;i<=n-2;i++) {
            c=a+b;
            al.add(c);
            a=b;
            b=c;
        }
        return al;
    }

    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(15));
    }

}
