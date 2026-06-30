class Solution {
    public int removeDuplicates(int[] nums) {
     //[1,1,2], i =1, k = 0 , nums[k] = {1, }, k=2
     // i = 1, k = 2-1 = 1, nums[k] = {1, }
     // i=2, k 
     int k=1; //k to track the unique elements
     for(int i=0; i<nums.length; i++){
        if(nums[i] != nums[k-1]){
            nums[k] = nums[i];
            k++;
        }
     }
     return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna