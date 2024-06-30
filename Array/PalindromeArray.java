package Array;

class PalindromeArray {

    public static void main(String[] args) {
        int[] array ={1,2,3,2,1};
        int n = array.length;

        int count=0;

        // Time Complexcity = O(n)
        // Space Complexcity = O(1) because didn't use any extra spaces
        
        for(int i=0;i<n/2;i++) {
            if(array[i]!=array[n-i-1]) {
                count = 1;
                System.out.println("It is not a Palindrome Number");
                break;
            }
        }

        if(count==0) {
            System.out.println("it is a Palinedrome Number");
        }
    }
    
}