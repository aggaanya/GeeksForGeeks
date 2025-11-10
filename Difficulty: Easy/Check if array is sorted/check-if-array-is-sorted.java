class Solution {
    public boolean isSorted(int[] arr) {
        return helper(arr, 0);
    }
    private boolean helper(int [] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index + 1]){
            return false;
        }
        return helper(arr, index + 1);
    }
}