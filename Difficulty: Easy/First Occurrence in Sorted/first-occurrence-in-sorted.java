class Solution {
    public int firstSearch(int[] arr, int tar) {
        // Code Here
        int i=0;
        int index=0;
        boolean found= false;
        int j=arr.length-1;
         for(int k=0;k<j+1;k++)
         {
             if(arr[k]==tar)
             
             {
                 
                 return k;
       
                 
             }
         }
        return -1;
    }
}