package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int numStoreItems = scan.nextInt();
		String[] items = new String[numStoreItems];
		int[] customersBuying = new int[numStoreItems];
		int[] numBought = new int[numStoreItems];
		for (int i = 0; i < numStoreItems; i++) {
			items[i] = scan.next();
			scan.next();
		}
		
		int numCustomers = scan.nextInt();
		for (int i = 0; i < numCustomers; i++) {
			scan.next();
			scan.next();
			int numPurchases = scan.nextInt();
			for (int j = 0; j < numPurchases; j++) {
				int amount = scan.nextInt();
				String item = scan.next();
				
				for (int k = 0; k < numStoreItems; k++) {
					if (items[k].equals(item)) {
						customersBuying[k]++;
						numBought[k] += amount;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < numStoreItems; i++) {
			if (numBought[i] == 0) {
				System.out.printf("No customers bought %s%n", items[i]);
			}
			else {
				System.out.printf("%d customers bought %d %s%n", customersBuying[i], numBought[i], items[i]);
			}
		}
		
		scan.close();
	}
}
