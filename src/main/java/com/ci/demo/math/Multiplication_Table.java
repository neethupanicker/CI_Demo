package com.ci.demo.math;

import java.util.ArrayList;
import java.util.Scanner;
public class Multiplication_Table 
{
	static ArrayList<String> AL = null;
	static String num;
	String integ;
    public static String multi(String val){
    	
		
    	
    	AL=new ArrayList<String>();
//added changes again
	 for(int n=1; n<=100;n++){
		//System.out.println(" ");
        for(int i=1; i <= 10; i++)
        {
            //System.out.println(n+" * "+i+" = "+n*i);
            num=num.valueOf(n+" * "+i+" = "+n*i);
            AL.add(num);
       }
	}
	 
	 if(!AL.get(AL.indexOf(val)).isEmpty()){
		 //System.out.println("index for the given value is: "+AL.indexOf(val));
		 //System.out.println(AL.get(AL.indexOf(val)));
		 return AL.get(AL.indexOf(val)); 

	 }
	 
	 else{
		 
		 System.out.println("Please check the given value that is not found");
		 return "Not found";
	 }
	

 
    }
    
}