package binarysearch;

public class SearchInsertPos_35 {
    //O(N)
   public int searchInsert(int[] nums, int target) {
       
       int pos=0;
       
       for(int i=0;i<nums.length;i++) {
           pos=i;
           if(target==nums[i] || nums[i]>target){
               break;
           }
               
       }
       if(pos==nums.length-1){
           if(target>nums[nums.length-1]) pos++;
       }
       
       return pos;        
    }
   
   //O(log n)
   public int searchPosUsingBinarySearch(int[] nums, int target) {
       int left=0;
       int right=nums.length-1;
       
       while(left<=right) {
           int mid=(left+right)/2;
           
           if(nums[mid]==target) {
               return mid;
           } else if(nums[mid]<target) {
               left=mid+1;
           } else {
               right=mid-1;
           }
       }
    return left;       
   }

}
