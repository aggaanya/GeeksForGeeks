// User function Template for Java

class Solution {
    public static void sortLastMelements(int[] nums, int n, int m) {
        divide(nums, nums.length - m, nums.length - 1);
    }
    //here the start and the end will be for the IInd part of the array
    public static void divide(int [] arr, int start, int end){
        int middle = start + (end - start) / 2;
        if (start == end){
            return;
        }
        divide(arr, start, middle);
        divide(arr, middle + 1, end);
        merge(arr, start, middle, end);
    }
    public static void merge(int [] arr, int start, int middle, int end){
        int low = start;
        int high = middle + 1;
        int [] temp = new int[end - start + 1];
        int k = 0;
        while (low <= middle && high <= end){
            if (arr[low] <= arr[high]){
                temp[k++] = arr[low++];
            }else{
                temp[k++] = arr[high++];
            }
        }
        while (low <= middle){
            temp[k++] = arr[low++];
        }
        while(high <= end){
            temp[k++] = arr[high++];
        }
        System.arraycopy(temp, 0, arr, start, temp.length);

    }
}