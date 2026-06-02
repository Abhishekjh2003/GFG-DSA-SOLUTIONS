class Solution {
    public int maxOnes(int nums[], int k) {
        // code here
        int i=0;
        int count =0;
        int maxlen =0;
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]==0)
            {
                count++;
            }
            while(count>k)
            {
                if(nums[i]==0)
                {
                    count--;
                    
                }
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
        }
        return maxlen;
        
    }
}