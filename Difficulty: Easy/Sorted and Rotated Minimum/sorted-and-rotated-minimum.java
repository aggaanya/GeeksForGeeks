// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        int ans = helper(arr);
        return arr[ans];
    }
    public int helper(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            if(arr[start] <= arr[end]){
                //this means the array is sprted
                return start;
            }
            int mid = start + (end - start) / 2;
            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            else if (arr[start] <= arr[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
