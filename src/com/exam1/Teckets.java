package com.exam1;

import java.util.Scanner;

public class Teckets {

	Scanner scanner = new Scanner(System.in);

	public void getTicket() {
		System.out.println("Please enter number of tickets:");
		int total = scanner.nextInt();
		System.out.println("How many round-trip tickets:");
		int roundTrip = scanner.nextInt();
		float price = (float) ((total - roundTrip) * 1000f + (roundTrip * 2000 * 0.9));
		System.out.printf(" Total tickets: %d Round-trip: %d Total: %.0f", total, roundTrip, price);

	}
}
