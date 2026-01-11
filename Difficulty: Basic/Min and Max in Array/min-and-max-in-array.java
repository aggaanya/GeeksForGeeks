class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        ans.add(min);
        ans.add(max);
        return ans;
    }
}
