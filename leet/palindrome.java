/*
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left. */

package leet;
public class palindrome {
    private static boolean checkPalindrome(String num){
        int left = 0;
        int right = num.length() - 1;
        while (left < right){
            if (num.charAt(left) != num.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        String num = x + "";
        return checkPalindrome(num);
    }
}
