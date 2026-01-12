// User function Template for Java

class Solution {
    static void rotateArr(int arr[], int k) {
        k = k % arr.length;
        int [] temp = new int[k];
        for(int i = 0; i < k; i++){
            temp[i] = arr[i];
        }
        for(int i = k; i < arr.length; i++){
            arr[i - k] = arr[i];
        }
        int j = 0;
        for(int i = arr.length - k; i < arr.length; i++){
            arr[i] = temp[j];
            j++;
        }
    }
}