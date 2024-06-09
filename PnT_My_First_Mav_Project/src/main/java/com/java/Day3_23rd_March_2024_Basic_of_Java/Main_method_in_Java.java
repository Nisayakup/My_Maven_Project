package com.java.Day3_23rd_March_2024_Basic_of_Java;

public class Main_method_in_Java {
	
	
	// execution of a program in a simple java code - happens within main() method 
	//main () method is the execution engine in a java program 
	//main() method may or may not have the logic but it is still the execution center
	//if any logic exists in other methods then they have to call 
	// ------ themselves within the main method for the execution
	// nomenclature of main method cannot be changed 
	
	
	
	
	
	
	public static void main(String[] args) {	
		System.out.println(20 + 30);
		multiplyLogic();
		subtractlogic();
		
		
	}
	
	public static void multiplyLogic() {
		System.out.println(10 * 10);
	}
	
	public static void subtractlogic() {
		System.out.println(100 - 90);
	}

}

/*
   Public static void main(String[] args {
   
   public - is an access modifier
   static - is a keyword associated with class
   void - it is a return type
   String[] - String array - capability to store any input 
   args- arguments 
   
   
   
   
   
   
*/