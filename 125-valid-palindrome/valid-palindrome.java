class Solution {
    public boolean isPalindrome(String s) {
       
        String str_after_removing = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                str_after_removing += Character.toLowerCase(c);
            }
        }

       
        int n = str_after_removing.length();
        
        for (int i = 0; i < n/2; i++) {
            char first_char = str_after_removing.charAt(i);
            char last_char = str_after_removing.charAt(n - 1 - i);
            if (first_char != last_char) {
                return false;
            }
        }

        return true;
    }

   
        
    
}