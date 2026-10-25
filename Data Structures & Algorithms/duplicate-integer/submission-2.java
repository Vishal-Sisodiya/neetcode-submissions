class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int len = nums.length;
        // boolean res = false;
        // for(int i=0;i<len;i++){
        //     for(int j=i+1;j<len;j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return res;

        
        int len = nums.length;
        if(len <=1 ){
            return false;
        }
        boolean res = false;
        Arrays.sort(nums);
        int curr = nums[0];
        for(int i=1;i<len;i++){
            if(curr == nums[i]){
                res = true;      
            }
            curr = nums[i];
        }
        return res;
    }
}
