package com.java.Day3_23rd_March_2024_Basic_of_Java;

public class Topic12_Increment_Decrement_Operators_AnotherExample {

	public static void main(String[] args) {
		
		//example1();
		example2();

	}

	public static void example1() {
		
		int i = 10;
		int j = --i;  //j=9  / i=9
		int k = i++ - --j; //k = 9 - (-1)+9 = 1
		                   //j = 8
		                   //i = 10 
		int l = --i - --i + ++j - --k;
		    // l = 9 - 8 + 9  - 0  = 10
		    // i = 9, 8
		   // j = 9
		   //k = 0 
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	
	public static void example2() {
		
		int i = 1;
		int j = i-- + --i;// j=0 / i = -1
		int k = i++ + --i - j++ + ++j; // k = -1 + (-1) - 0 + 2 = 0  // i = -1  // j = 2
		int l = i++ + j++ + k++ - --i - --j - --k; // l = -1 + 2 + 0 - (-1) - 2 - 0 = 0 / i = -1// j = 2 //k = 0  
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);	
	}
	
}
