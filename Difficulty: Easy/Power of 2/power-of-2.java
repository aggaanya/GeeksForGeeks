class Solution {
    public static boolean isPowerofTwo(int n) {
        // code here
        if(n > 0){
            if(( n & ( n - 1 ) ) == 0){
                return true;
            }
        }
        return false;
    }
}