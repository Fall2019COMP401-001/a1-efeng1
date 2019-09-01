package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Your code follows here.
		
		int numCustomers = scan.nextInt();
		
		for (int i = 0; i < numCustomers; i++) {
			String out = String.valueOf(scan.next().charAt(0));
			out = out + ". " + scan.next() + ": ";
			
			int numItems = scan.nextInt();
			
			double itemPrice = 0.0;
			for (int j = 0; j < numItems; j++) {
				int amount = scan.nextInt();
				scan.next();
				itemPrice += amount*scan.nextDouble();
			}
		
			System.out.println(out + String.format("%.2f", itemPrice));
		}
		
		scan.close();
		
	}
}
