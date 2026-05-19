class Solution {
    public static int largest(int[] arr) {
        // code here
        int fmax= Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>fmax)
            {
                fmax=arr[i];
            }
        }
        return fmax;
        
    }
}
