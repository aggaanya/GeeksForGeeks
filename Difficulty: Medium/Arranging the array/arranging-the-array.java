// User function Template for Java

class Solution {

    
    public static void Rearrange(int [] a, int n) {
        int low = 0;
        int high = n - 1;
        divide(a, low, high);
    }
    public static void divide(int [] arr, int low, int high){
        int middle = low + (high - low) / 2;
        if (low >= high){
            return;
        }
        divide(arr, low, middle);
        divide(arr, middle + 1, high);
        merge(arr, low, middle, high);
    }
    public static void merge(int [] arr, int low, int mid, int high){
        int[] mix = new int[high - low + 1];
        int k = 0;

        // copy negatives first (maintain order)
        for (int i = low; i <= mid; i++) {
            if (arr[i] < 0)
                mix[k++] = arr[i];
        }
        for (int i = mid + 1; i <= high; i++) {
            if (arr[i] < 0)
                mix[k++] = arr[i];
        }
        
        // then copy non-negatives
        for (int i = low; i <= mid; i++)
            if (arr[i] >= 0)
                mix[k++] = arr[i];
        for (int i = mid + 1; i <= high; i++)
            if (arr[i] >= 0)
                mix[k++] = arr[i];

        // copy back into original array
        System.arraycopy(mix, 0, arr, low, mix.length);
    }
}