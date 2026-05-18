import java.util.*;
class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>fmax)
            {
                smax=fmax;
                fmax=arr[i];
            }
            else if(smax<arr[i]  && arr[i]!=fmax)
            {
                smax=arr[i];
            }
        }
        return smax == Integer.MIN_VALUE ? -1 : smax;
    }
}