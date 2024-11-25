class Solution {

    public static boolean isPalindrome(String s) {
        
        String ascii_onli = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                ascii_onli+= Character.toLowerCase(c);
            }
        }

        int n = ascii_onli.length();
        for (int i = 0; i < n / 2; i++) {
            if (ascii_onli.charAt(i) != ascii_onli.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}