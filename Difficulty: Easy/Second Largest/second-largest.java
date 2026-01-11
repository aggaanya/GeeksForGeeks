class Solution {
    public int getSecondLargest(int[] arr) {
        //finding ht elargest element 
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        int secondLargest = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}