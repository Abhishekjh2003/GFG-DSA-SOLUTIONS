class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        boolean found  =false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k)
            {
                found =true;
            }
        }
        if(!found )
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}