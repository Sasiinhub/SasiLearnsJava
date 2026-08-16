import java.util.Scanner;
public class Comparing_numbers {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Please enter a first number: ");
	String first_number = scanner.nextLine();
	System.out.print("Please enter the second number to compare: ");
	String second_number = scanner.nextLine();
	
	int i = -1;
	for(char top_number : first_number.toCharArray()) {
		i += 1;
		if (first_number.length() != second_number.length()) {
			System.out.println("The given numbers are not equal in length");
			break; }
		if (top_number == second_number.charAt(i)) {
			if (i < first_number.length()-1)  { 
				continue;}
		        /*check with total same len num every time with -1.
		          so it points the actual end index number.
		          so, if the len 5 - 1 = 4,
		           when the i has been reaching upto 3 it proceed continue(skips the loop)
		           when it reaches i= 4, the condition is false, because len - 1 also 4.
		           so, it move to else, prints , then breaks.
		 	*/
			else {
				System.out.println("Both \n"+ first_number + " and \n" + second_number + " are equal.");
				break; 
				}}

		else if (top_number > second_number.charAt(i)) {
			System.out.println("The first_number " +first_number +" is greater than\nThe second_number "+second_number);
       			break; }
		else if (top_number < second_number.charAt(i)) {
			System.out.println("The second_number " +second_number +" is greater than\nThe first_number "+first_number);
       			break; } 

		} // closes loop body
	scanner.close();	} // closes main method body
} // closses the class

