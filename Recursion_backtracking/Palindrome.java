package Recursion_backtracking;

public class Palindrome {

    static boolean checkPalindrome(char c[], int i, int n){
        if(i >= n/2)
            return true;
        if(c[i] != c[n-i-1])
            return false;
        return checkPalindrome(c, i+1, n);
    }

    public static void main(String args[]){
        String word = "11211";
       boolean result = checkPalindrome(word.toCharArray(), 0, word.length());
       if(result)
           System.out.println(word + " is palindrome");
       else
           System.out.println(word + " is not palindrome");
    }
}
