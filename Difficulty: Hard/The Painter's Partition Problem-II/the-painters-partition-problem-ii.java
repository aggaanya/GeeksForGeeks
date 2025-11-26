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
    public int minTime(int[] arr, int k) {
        
        if(arr.length < k){
            return -1;
        }
        
        int max = -1;
        int sum = 0;
        int ans = -1;
        
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        for(int n: arr){
            sum += n;
        }
        //this is the max area that the painter will paint
        int start = max;
        int end = sum;
        while(start <= end){
            
            int middle = start + (end - start) / 2;
            
            if(isValid(arr, k, arr.length - 1, middle)){
                ans = middle;
                end = middle - 1;
            }else{
                start = middle + 1;
            }
            
        }
        return ans;
    }
}
