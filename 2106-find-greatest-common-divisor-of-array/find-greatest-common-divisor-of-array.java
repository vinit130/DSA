class Solution {
    public int findGCD(int[] nums) {
    
            int max = nums[0];
           int min = nums[0];
           for(int i = 1;i<=nums.length-1;i++) {
                if(nums[i]>max)
                   max = nums[i];
                else if(nums[i]<min)
                     min = nums[i];
                }
           for(int m=min; m>=1; m--){
            if(max%m==0 && min%m==0) 
                 return m;
           }
           
           return 1;
        }
        
    

}   
    