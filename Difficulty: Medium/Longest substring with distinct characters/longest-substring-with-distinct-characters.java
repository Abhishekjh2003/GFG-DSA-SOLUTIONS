class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character> set =new HashSet<>();
        
        int i=0;
        int maxlength=0;
        for(int j=0;j<s.length();j++)
        {
            while(set.contains(s.charAt(j)))
            {
                set.remove(s.charAt(i));
                i++;
                
            }
            set.add(s.charAt(j));
            maxlength=Math.max(maxlength,j-i+1);
            
        }
        return maxlength;
    }
}