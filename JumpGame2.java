public class JumpGame2 {
    
        public int jump(int[] nums) {
            int n = nums.length;
            int jumps = 0,currentEnd=0, farthest=0;
    
            for(int i=0;i<nums.length-1;i++){
                farthest= Math.max(farthest,i + nums[i]);
    
                if(i== currentEnd){
                    jumps ++;
                    currentEnd= farthest;
    
                    if(currentEnd >= n-1)break;
                }
            }
            return jumps;
    
        }
    
}
