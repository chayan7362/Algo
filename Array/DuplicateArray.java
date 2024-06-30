package Array;

/**
 * DuplicateArray
 */
public class DuplicateArray {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,2};
        int n=array.length;

        // Time complexcity is O(n^2)
        // Space complexcity is O(1)
        
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(array[i]==array[j]) {
                    System.out.println("Duplicate Element is :"+array[i]);
                }
            }
        }
    }
}
