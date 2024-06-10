package com.java.Day3_23rd_March_2024_Basic_of_Java;

public class Topic11_Increment_Decrement {
	
	
	//++ means +1
	//-- means -1
	//post increment  i++
	//pre increment  ++i
	//post decrement i--
	//pre decrement --i
	
	
	
	
	public static void main(String[] args) {
		
		int i = 1;
		System.out.println(i);
		
		int j = i++;
		System.out.println(j);//1
		System.out.println(i);//2
		
		
		int k = ++i;
		System.out.println(k); //3
		System.out.println(i); //3
		
		
		int l = i++ + ++i + i++ + ++i;
		    // l = 3  +(+1)+4   +5   + (+1)+6 = 3 +5 + 5 + 7 = 20
		    // i = 4 , 5, 6, 7 
		 
		System.out.println(l);
		System.out.println(i);
				

	}
	
	

}
