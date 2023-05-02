class Solution {
    public int arraySign(int[] nums) {
        int negatives =0;
        for(int s: nums){
            if(s==0){
                return 0;
            }

            else if(s<0){
                negatives++;
            }

        }

        return negatives%2 == 0 ? 1 : -1;
        
    }
}