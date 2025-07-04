public class CB_Problem4_JumpGame1 {
    public static void main(String[] args) {
        
    }   
    public static boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max = Math.max(i+nums[i],max);
        }
        return true;
    }
}
