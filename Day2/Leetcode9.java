class Solution {
    public boolean isPalindrome(int x) {
        // Check for negative numbers
        if (x < 0) {
            return false;
        }

        int dupx = x;
        int rev = 0;
        
        while (x != 0) {
            int ld = x % 10;
            x = x / 10;
            rev = rev * 10 + ld;
        }
        
        // Check if the reversed number is the same as the original
        return rev == dupx;
    }
}

class Leetcode9{
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.isPalindrome(121));   // Output: true
        System.out.println(solution.isPalindrome(-121));  // Output: false
        System.out.println(solution.isPalindrome(10));    // Output: false
    }
}
