class Solution {
    int maxSubarraySum(int[] arr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            currentSum += arr[i];
            maxSum = Math.max(currentSum, maxSum);
            if(currentSum < 0){
                currentSum = 0;
            }
            i++;
        }
        return maxSum;
    }
}
