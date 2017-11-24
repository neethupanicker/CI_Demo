package com.ci.demo.math;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class PrintPrimeNumbers_Test
 
{
	@Test
    public void testCase1()
    {
    	PrintPrimeNumbers pn = new PrintPrimeNumbers();
    	int total1 = pn.total;
    	if (total1 == 25){
        assertTrue( true);
        System.out.println("Prime Numbers Test Passed");
        }
    	else{
    		assertTrue(false);
    		System.out.println("Prime Numbers Test Failed");
    	}
    }
}
