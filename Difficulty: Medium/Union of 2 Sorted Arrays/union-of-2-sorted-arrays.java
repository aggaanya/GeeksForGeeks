class Solution {
    public static ArrayList<Integer> findUnion(int [] a, int [] b) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int n: a){
            set.add(n);
        }
        for(int n: b){
            set.add(n);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        int size = set.size();
        for(int i = 0; i < size; i++){
            ans.add(set.getFirst());
            set.removeFirst();
        }
        return ans;
    }
}
