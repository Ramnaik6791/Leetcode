class Solution {
    public int pivotIndex(int[] nums) {
        int total =0;
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            total = nums[i]+ total;
        }

        for(int j=0;j<nums.length;j++){
            if(leftSum == total - nums[j]-leftSum){
                return j;
            }

            leftSum = leftSum + nums[j];

        }
        return -1;
    }
}