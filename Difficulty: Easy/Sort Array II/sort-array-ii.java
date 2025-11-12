class Solution {
    static void sortArr(int[] arr) {
        PriorityQueue<Integer> MinHeap = new PriorityQueue<>();
        for(int n: arr){
            //this will automatically arrange the numbers,
            //the way you have defined the priorityQueue
            MinHeap.add(n);
        }
        int size = MinHeap.size();
        //here we have added the elements into the array
        for(int i = 0; i < size; i++){
            arr[i] = MinHeap.remove();
        }
    }
}
