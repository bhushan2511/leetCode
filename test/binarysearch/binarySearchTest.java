package binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class binarySearchTest {
    
    @Test
    public void solution_35() {
        SearchInsertPos_35 si=new SearchInsertPos_35();
        
        
        int [] arr={2,7,11,15};
        int target=9;
        
        int  ind=si.searchPosUsingBinarySearch(arr, target);
        
        assertEquals(2,ind);

        
    }

    @Test
    public void solution_167() {
        TwoSum_167 tw=new TwoSum_167();
        
        int [] arr={2,7,11,15};
        int target=9;
        
        int [] ind=tw.twoSum(arr, target);
        
        assertEquals(1,ind[0]);
        assertEquals(2,ind[1]);       
    }

}
