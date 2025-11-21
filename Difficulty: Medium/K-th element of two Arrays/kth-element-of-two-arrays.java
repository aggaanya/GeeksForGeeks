class Solution {
    public int kthElement(int a[], int b[], int index) {
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int[a.length + b.length];
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                mix[k++] = a[i++];
            }else{
                mix[k++] = b[j++];
            }
        }
        while(i < a.length){
            mix[k++] = a[i++];
        }
        while(j < b.length){
            mix[k++] = b[j++];
        }
        return mix[index - 1];
    }
}