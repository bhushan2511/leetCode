package arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTest {

    @Test
    public void Solution_169() {
        MajorityElement_169 local=new MajorityElement_169();
        
        int [] arry={2,2,2,2,2,2,4,5,6,7,8};
        int val=local.majorityElementOne(arry);
        
        assertEquals(2,val);

    }

}
