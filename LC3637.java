public class LC3637 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 3, 5, 4, 2, 6, 8};
        System.out.println(sol.isTrionic(nums));
    }
}

class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length < 4) return false;
        // int state = 0;
        // for(int i=0; i<nums.length-1; i++){
        //     if(nums[i+1] > nums[i]){
        //         state |= 1;
        //     }else if(nums[i+1] < nums[i] && (state == 1 || state == 2)){
        //         state = 2;
        //     }else{
        //         return false;
        //     }
        // }
        // return state == 3;
        int state = 0;
        for(int i=0; i<nums.length-1; i++){

            if(nums[i+1]>nums[i]){
                if(state == 0){
                    state = 1;
                }else if(state == 1){
                    state = 1;
                }else if(state == 2){
                    state = 3;
                }else if(state == 3){
                    state = 3;
                }
            }else if(nums[i+1]<nums[i]){
                if(state == 1 || state == 2){
                    state = 2;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    return state == 3;
    }
}