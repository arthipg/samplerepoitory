package automation;

import java.util.Scanner;

public class assertionExample {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the id : ");
		String name;
		name=obj.nextLine();
		assert name.contentEquals ("shankar") : "not valid";
		System.out.println("Name is correct");
	}
}
