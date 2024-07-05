package Number;

import java.util.ArrayList;

// Sum of Previous three Numbers , Where the Series start for 0,1,2
public class TribonacciNumber {
    static ArrayList<Integer> TribonacciSeries(int n) {
        int a , b, c, d, i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        a = 0;
        b = 1;
        c = 2;
        al.add(a);
        al.add(b);
        al.add(c);
        for(i=1;i<=n-3;i++) {
            d = a+b+c;
            al.add(d);
            a = b;
            b = c;
            c = d;
        }
        return al;
    } 
    
    public static void main(String[] args) {
        System.out.println(TribonacciSeries(10));
    }
}
