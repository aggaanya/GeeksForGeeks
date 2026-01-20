class Solution {
    public int findTarget(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if((mid  - 1) >= start && target == arr[mid - 1]){
                return mid - 1;
            }
            if((mid + 1) <= end && target == arr[mid + 1]){
                return mid + 1;
            }
            if(target < arr[mid]){
                end = mid - 2;
            }else{
                start = mid + 2;
            }
        }
        return -1;
    }
}
