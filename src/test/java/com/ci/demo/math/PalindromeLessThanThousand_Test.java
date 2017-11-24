package com.ci.demo.math;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PalindromeLessThanThousand_Test 
{
 @Test
    public void testCase2()
    {
    	PalindromeLessThanThousand pl = new PalindromeLessThanThousand();
    	int num2=pl.reverse(39);
    	if (num2 == 93){
        assertTrue(true);
        System.out.println("Palindrome Test Passed");
        }
    	else{
    		assertTrue(false);
    		System.out.println("Palindrome Test Failed");
    	}
    	
    }
}
