package com.ci.demo.math;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Multiplication_Table_Test {
	 @Test
	    public void testCase2()
	    {
	    	/*Multiplication_Table mt = new Multiplication_Table();*/
	    	String multiRow1 = "97 * 2 = 194";
	    	    if(Multiplication_Table.multi("97 * 2 = 194").equalsIgnoreCase(multiRow1))
	    	    {
	    	    	assertTrue(true);
	        System.out.println("Multiplication Test Passed");
	        }
	    	else{
	    		assertTrue(false);
	    		System.out.println("Multiplication Test Failed");
	    	}
			}
	    }

