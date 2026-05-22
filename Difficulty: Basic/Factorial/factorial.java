class Solution {
    // Function to calculate factorial of a number.
    // System.out.println(factorial(n));
    int factorial(int n) {
        // code here
        
        if(n==1 || n==0)
        {
            return 1;
            
        }
        else 
        {
            return n*factorial(n-1);
        }
    }
}
