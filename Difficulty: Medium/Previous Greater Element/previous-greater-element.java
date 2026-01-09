class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(stack.size() == 0){
                ans.add(-1);
            }else if(stack.size() > 0 && stack.peek() > arr[i]){
                ans.add(stack.peek());
            }else if(stack.size() > 0 && stack.peek() <= arr[i]){
                while(stack.size() > 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    ans.add(-1);
                }else{
                    ans.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }
        return ans;
    }
}
