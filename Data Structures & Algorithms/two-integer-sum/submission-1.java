class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int k = 0; 
        int arr[] = new int[2];
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    arr[k] = i;
                    k++;
                    arr[k] = j;
                }
            }
        }
        return arr;
    }
}
