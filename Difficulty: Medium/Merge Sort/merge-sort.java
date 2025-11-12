class Solution {

    void mergeSort(int arr[], int l, int r) {
        //here we have to f=divide the array into 2 parts, 
        //hence we will be dividing the array by taking the middle
        //elemnt of the array
        int middle = l + (r - l) / 2;
        if(l >= r){
            return;
        }
        mergeSort(arr, l, middle);
        mergeSort(arr, middle + 1, r);
        merge(arr, l, middle, r);
    }
    void merge(int [] arr, int l, int middle, int r){
        int [] mix = new int[r - l + 1];
        int start = l;
        int end = middle + 1;
        int k = 0;
        while(start <= middle && end <= r){
            if(arr[start] <= arr[end]){
                mix[k++] = arr[start++];
            }else{
                mix[k++] = arr[end++];
            }
        }
        while(start <= middle){
            mix[k++] = arr[start++];
        }
        while(end <= r){
            mix[k++] = arr[end++];
        }
        for(int i = 0; i < mix.length; i++){
            arr[l + i] = mix[i];
        }
    }
}