package Trip;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String tripType;
		Scanner scanner = new Scanner(System.in);
		tripType = scanner.nextLine();
		if (tripType.matches("luxury")) {
			System.out.println("luxury");
			Trip trip = new LuxuryPackage();
			trip.description();
		} else if (tripType.matches("delux")) {
			System.out.println("delux");
			Trip trip2 = new DeluxPackage();
			trip2.description();
		} else {
			System.out.println("economy");
			Trip trip3 = new EconomyPackage();
			trip3.description();
		}
	}
}
