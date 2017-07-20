package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.*/

public class MajorityElement_169 {
    
    
    //Using hashmap O(n) space and time
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> localMap=new HashMap<>();
        int majority=0;
        
        for(int i=0;i<nums.length;i++) {
            if(localMap.containsKey(nums[i])){
                localMap.put(nums[i],  localMap.get(nums[i])+1);
            } else {
                localMap.put(nums[i],1);
            }           
        }
        
        for (int key : localMap.keySet()) {
           if(localMap.get(key)> (nums.length/2)) {
               majority=key;

           }
        }
                 
        return majority;
    }   
    
    //O(n) time and O(1) space , moore's algorithm
    public int majorityElementOne(int[] num) {

        int major=num[0], count = 1;
        for(int i=1; i<num.length;i++){
            if(count==0){
                count++;
                major=num[i];
            }else if(major==num[i]){
                count++;
            }else count--;
            
        }
        return major;
    }
    
    
    public int majorityElementTwo(int[] num) {
        Arrays.sort(num);
        return num[num.length/2];
    }
    

}
