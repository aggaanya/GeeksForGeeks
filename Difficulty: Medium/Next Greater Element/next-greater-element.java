class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int []  res = new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = arr.length - 1; i >= 0; i--){
            if(stack.size() == 0){
                res[i] = -1;
            }else if(stack.size() > 0 && stack.peek() > arr[i]){
                res[i] = stack.peek();
            }else if(stack.size() > 0 && stack.peek() <= arr[i]){
                while(stack.size() > 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() > 0){
                    res[i] = stack.peek();
                }else{
                    res[i] = -1;
                }
            }
            stack.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int num: res){
            ans.add(num);
        }
        return ans;
    }
}