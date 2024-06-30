package Array;

public class ReversalArray {
    public static void main(String[] args) {
        int[]  array = {1,2,3,4,5,6,7,8};
        int n = array.length;

        // Time Complexcity is O(n)
        // Space Complexcity is O(1)
        
        for(int i=0;i<n/2;i++) {
            // Swap the elements b/w array[i] and array[n-i-1]
            int temp = array[i];
            array[i]=array[n-i-1];
            array[n-i-1]=temp;
        }

        System.out.println("Reversal Array is:");
        for(int i=0;i<n;i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
