//Enter 5 Elements of list 1: 1 2 3 4 5
//Enter 5 Elements of List 2: 1 2 3 4 5
//two lists are strictly identical

//Declaring the Class File
public class StrictlyIdenticall {
	
	//Declaring the main function (what gets executed)
	public static void main(String[] args) {
	    
		//Create a scanner object that will read from console 
		//and import from scanner library
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//Sending message to console for user to enter elements of list 1
		System.out.print("Enter 5 Elements of list 1: ");	
		
		//Creating an integer object, declaring size and naming an input
		int[] list1 = new int[5];
		
		//Creating an integer object, declaring size and naming an input 
		int[] list2 = new int[5];
		
		//Loop through the string 'list1' character by character to check 
		for (int i = 0; i < 5; i++) { 
		
			//Stores the user input in the variable list1 value
			list1[i] = input.nextInt(); 
		}
		//Sending message to console for user to enter elements of list 2
		System.out.print("Enter 5 Elements of List 2: ");

		//Loop through the string 'list2' character by character to check
		for (int i = 0; i < 5; i++) {
		
			//Stores the user input in the variable list2 value
			list2[i] = input.nextInt(); 
		}
		//checking to see if arrays are identical 
		if (equals(list1, list2)== true) {
			
			//if both arrays are equals, return the lists are identical 
			System.out.println("two lists are strictly identical");
		}
		//if arrays are not identical 
		else {
			
			//return the lists are not identical 
			System.out.println("two lists are not strictly identical");
		}
			//input.close();
	}
	//creating new method for loop to run in 
	public static boolean equals(int[] list1, int[] list2) {

		//Loop through both arrays to check similarity  
		for (int i = 0; i < 5; i++) {
            
			//if arrays are not identical
			if (list1[i] != list2[i]) 
            	
				//it is false
				return false;
        }
        //otherwise it is true 
        return true;
	
}
}

