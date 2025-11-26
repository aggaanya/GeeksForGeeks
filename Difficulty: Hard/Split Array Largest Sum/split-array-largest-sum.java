class Solution {
    public boolean isValid(int maxValue, int [] arr, int k){
        int sum = 0;
        int partitions = 1;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > maxValue){
                partitions++;
                sum = arr[i];
            }
            if(partitions > k){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] arr, int k) {
        int sum = 0;
        int max = -1;
        int ans = -1;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int start = max;
        int end = sum;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isValid(mid, arr, k)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}