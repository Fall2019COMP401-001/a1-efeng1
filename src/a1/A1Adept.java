package a1;

import java.util.Scanner;
import java.util.Hashtable;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		Hashtable<String, Double> prices = new Hashtable<String, Double>();
		int numStoreItems = scan.nextInt();
		for (int i = 0; i < numStoreItems; i++) {
			prices.put(scan.next(), scan.nextDouble());
		}
		
		int numCustomers = scan.nextInt();
		double totalSpent = 0;
		String highestCustomer = "";
		double highestSpent = 0;
		String lowestCustomer = "";
		double lowestSpent = Double.POSITIVE_INFINITY;
		
		for (int i = 0; i < numCustomers; i++) {
			String currentCustomer = scan.next() + " " + scan.next();
			double currentSpent = 0;
			int numPurchases = scan.nextInt();
			
			for (int j = 0; j < numPurchases; j++) {
				currentSpent += scan.nextInt() * prices.get(scan.next());
			}
			totalSpent += currentSpent;
			
			if (currentSpent > highestSpent) {
				highestCustomer = currentCustomer;
				highestSpent = currentSpent;
			}
			if (currentSpent < lowestSpent) {
				lowestCustomer = currentCustomer;
				lowestSpent = currentSpent;
			}
		}
		
		System.out.printf("Biggest: %s (%.2f)%n", highestCustomer, highestSpent);
		System.out.printf("Smallest: %s (%.2f)%n", lowestCustomer, lowestSpent);
		System.out.printf("Average: %.2f%n", totalSpent/numCustomers);
		
		scan.close();
	}
}
