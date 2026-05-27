class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate = false;
        for(int i=0; i<nums.length;i++){
            int temp = 0;
             for(int j=0; j<nums.length;j++){
                if(i!=j){
                    if(nums[i] == nums[j]){
                        isDuplicate = true;
                    }
                }
             }
        }
        return isDuplicate;
    }
}