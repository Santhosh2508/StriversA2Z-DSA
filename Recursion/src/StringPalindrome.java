public class StringPalindrome {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        boolean ans = checkPalindrome(0,str.length(),str);
        if(ans)
            System.out.println("Palindrome");
        else
            System.out.println("NOt Palindrome");
    }

    static boolean checkPalindrome(int i  ,int n , String str) {
        if(i >= n/2)
            return true;

        if(str.charAt(i) != str.charAt(n-i-1))
            return false;
        return checkPalindrome(i+1,n,str);
    }

}
