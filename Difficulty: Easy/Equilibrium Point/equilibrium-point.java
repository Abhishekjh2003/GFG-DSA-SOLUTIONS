class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int total=0;
        for(int num:arr)
        {
            total+=num;
        }
        int leftsum =0;
        for(int i=0;i<arr.length;i++)
        {
            int rightsum =total-leftsum-arr[i];
            
            if(leftsum ==rightsum )
            {
                return i;
            }
            
            leftsum+=arr[i];
        }
        return -1;
    }
}
