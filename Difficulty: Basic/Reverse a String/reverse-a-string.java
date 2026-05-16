// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char [] a = s.toCharArray();
        int i=0,j= a.length-1;
        while(i<j)
        {
            char t =a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        String rev="";
    
        for(int k=0;k<a.length;k++)
        {
            rev+=a[k]; 
        }
        return rev;
        
        
    }
}