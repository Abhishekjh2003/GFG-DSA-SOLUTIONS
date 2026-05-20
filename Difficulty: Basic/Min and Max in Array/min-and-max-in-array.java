
import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> l1= new ArrayList<>();
        
        int fmax= Integer.MIN_VALUE;
        int fmin = Integer.MAX_VALUE;
        
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>fmax){
                fmax=arr[i];
            }
            if(arr[i]<fmin)
        {
          fmin=arr[i];  
        }
        
       
        }
        
         l1.add(fmin);
        l1.add(fmax);
        return l1;
    }
}
