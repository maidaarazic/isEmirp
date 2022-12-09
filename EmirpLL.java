package assignments;

import java.util.Scanner;
import assignments.Node;


public class EmirpLL {
	
public static boolean isPrime (int number) {
	
	int counter = 0;
	
	if(number <= 1) 
		return false;
	
	for (int i = 2; i <= number; i++) {
		if(number % i == 0) {
			counter++;
		}
	}
	
	if (counter > 2) 
		return false;
	else
		
	    return true;
	
}

public static int reverse (int to_reverse) {
	
	int reversed = 0, remainder = 0;
	
	while(to_reverse != 0) {
		
			remainder = to_reverse % 10;
		    reversed = reversed * 10 + remainder;
		    to_reverse = to_reverse / 10;
	}
	        return reversed;
	
}

public static boolean isEmirp(int number) {
	
	int reversed_number = 0;
	
	if (number <= 1)
		return false;
	
	else if (isPrime(number)) {
		reversed_number = (reverse(number));  
	}
	    return isPrime(reversed_number);
}

public static int list_to_integer(Node list) {
	
	int new_integer = 0;
	
	//this loop is used to convert linked list to integer 
		// through traversing from beginning to and value at current element
			// is multiplied by 10^
	
	for (int i = 0; i < list.getSize(); i++) { 
		new_integer = new_integer * 10 + list.accessElement(i);
	}
	
	return new_integer;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number of elements in linked list");
		
		Node list1 = new Node(); 
		
		int number_of_elements = input.nextInt();
		
		System.out.println("Enter elements of linked list");
		
		int count = 0;
		
		while (number_of_elements > count) {
			list1.insert(input.nextInt());
			count++;
		}
	
		int result = list_to_integer(list1);
		
		//this statement checks if integer we get from converting the linked list
		// is emirp by calling isEmirp function
		
		if (isEmirp(result) == true)  
		    System.out.println("Yes, linked list: " + result + " is an emirp.");  
		else  
		    System.out.println("No, linked list: " + result + " is not an emirp number.");  
		
	
    
	
}

}
