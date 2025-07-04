public class CB_Problem5_JumpGame2 {
    public static void main(String[] args) {
        
    }
    public static  int jump(int[] nums) {
        int count = 0;
        int cur_max = 0;
        int max = 0;
        for(int i = 0;i<nums.length-1;i++){
            max = Math.max(max,nums[i]+i);
            if(i==cur_max){
             cur_max = max;
            count++;
            }
        }
        return count;
    }
}
