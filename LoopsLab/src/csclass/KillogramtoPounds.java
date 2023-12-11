//Name: Chukwujika Ofordu
//Date: 9/22/2023
//Loops
//**********************************
package csclass;

public class KillogramtoPounds {
	
	 public static void main(String[] args) {
		 
		    //Table header
		    System.out.println("------------------------");
		    System.out.println("Kilograms  Pounds");
		    System.out.println("------------------------");

		    
		    //for loop for kilos 1 to 199   
		    for (int kilograms = 1; kilograms <= 199; kilograms += 2) {
		    	double pounds = kilograms * 2.2;
		    	System.out.printf("%-4d       %.1f%n", kilograms, pounds);
		    }
		    
		    //table footer
		    System.out.println("------------------------");
		  }

}
