package com.pack.testlogic;

import org.junit.Test;
import static org.junit.Assert.*;  
import com.pack.Calculation;

public class TestLogic {
	 @Test
	    public void testFindMax(){  
	        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	    }  

}
