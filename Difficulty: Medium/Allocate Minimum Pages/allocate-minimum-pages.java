class Solution {
    public boolean isValid(int [] arr, int noOfStudents, int size, int maxPages){
        int students = 1;
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > maxPages){
                students++;
                sum = arr[i];
            }
            if(students > noOfStudents){
                return false;
            }
        }
        return true;
    }
    public int findPages(int[] arr, int k) {
        int sum = 0;
        int ans = -1;
        int maxNum = -1;
        if(arr.length < k){
            return -1;
        }
        for(int j = 0; j < arr.length; j++){
            if(maxNum < arr[j]){
                maxNum = arr[j];
            }
        }
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        int start = maxNum;
        int end = sum;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isValid(arr, k, arr.length - 1, mid)){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }
}