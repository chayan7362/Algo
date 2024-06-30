package Array;

public class MissingArray {

    // Time complexcity is O(n)
    // Space Complexcity is O(1)
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6,7};
        int n = array.length;

        int sum =0;

        // Sum of natural number in Array
        int Sum_natural_Number=((n+1)*(n+2))/2;
        
        // Sum of Element present in an Array
        for(int i=0;i<n;i++) {
            sum+=array[i];
        }

        int Missing_Element=0;
        Missing_Element=Sum_natural_Number-sum;
        System.out.println("Missing Element is:"+Missing_Element);
    }
}
