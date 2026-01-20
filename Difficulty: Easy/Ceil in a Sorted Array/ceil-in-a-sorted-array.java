// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        if(x > arr[arr.length - 1]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == x){
                end = mid - 1;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else if(arr[mid] > x){
                end = mid - 1;
            }
        }
        return start;
    }
}
