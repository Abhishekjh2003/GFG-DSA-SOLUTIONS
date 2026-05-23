class Solution {
    int maxProduct(int[] arr) {
        // code here
        int minprod=arr[0];
        int maxprod=arr[0];
        int result =arr[0];
        for(int i =1;i<arr.length;i++)
        {
            int tempmax=Math.max(arr[i],Math.max(arr[i]*minprod,arr[i]*maxprod));
            int tempmin=Math.min(arr[i],Math.min(arr[i]*minprod,arr[i]*maxprod));
           minprod=tempmin;
           maxprod=tempmax; 
           result =Math.max(result,maxprod);
        }
        
        return result;
    }
}