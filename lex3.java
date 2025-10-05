public class lex3 {
    

        public static String removeOneChar(String s) {
        int n = s.length();
        
        // Find first index where s[i] > s[i+1]
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                // Remove s[i]
                return s.substring(0, i) + s.substring(i + 1);
            }
        }
        
        // If no such index found, remove last character
        return s.substring(0, n - 1);
    }

    public static void main(String[] args) {
        String[] tests = {"bac", "zx ", "cbacd", "zzz", "azby"};
        for (String t : tests) {
            System.out.println("Input: " + t + " -> Smallest after removal: " + removeOneChar(t));
        }
    }
}
