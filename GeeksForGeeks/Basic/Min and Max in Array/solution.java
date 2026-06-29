class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i: arr){
            if(i> max){
                max = i;
            }
            if(i<min){
                min = i;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(min);
        ans.add(max);
        return ans;
    }
    
}
