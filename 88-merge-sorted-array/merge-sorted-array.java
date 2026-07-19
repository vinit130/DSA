class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

  
  
     for(int k=0;k<n;k++){
         
        nums1[m+k]=nums2[k];
        
        
     }
      for(int j = 0;j<nums1.length-1;j++) {
        for(int i=0 ; i<nums1.length-1-j;i++) {
         int temp;
            if(nums1[i]>nums1[i+1]) {
                temp = nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1]=temp;
            }
           
        }
      }
        System.out.println(nums1);
    
    }
}


   