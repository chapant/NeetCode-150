public class Q10 {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

    public static void main(String[] args) {
        Q10 q10 = new Q10();

        System.out.println(q10.isPalindrome("tab a cat"));
        System.out.println(q10.isPalindrome("Was it a car or a cat I saw?"));
    }
}
