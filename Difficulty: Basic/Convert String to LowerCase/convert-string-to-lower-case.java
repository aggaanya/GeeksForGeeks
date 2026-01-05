// User function template for Java

class Solution {
    static String toLower(String s) {
       StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char)(ch + 32));
            } else {
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}