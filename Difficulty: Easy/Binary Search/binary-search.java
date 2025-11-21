class Solution {
    public int binarysearch(int[] arr, int k) {
        return helper(arr, 0, arr.length - 1, k);
    }
    public int helper(int [] arr, int start, int end, int target){
        int ans = -1;
        while(start <= end){
            int middle = start + (end  - start) / 2;
            if(arr[middle] == target){
                ans = middle;
                
                end = middle - 1;
            }
            else if(arr[middle] < target){
                start = middle + 1;
            }
            else{
                end = middle - 1;
            }
        }
        return ans;
    }
}