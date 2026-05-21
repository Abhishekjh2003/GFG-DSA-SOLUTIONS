class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        Arrays.sort(a);
        Arrays.sort(b);
        
        if(Arrays.equals(a,b))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}