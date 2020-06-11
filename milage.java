import java.util.Scanner;

class mileage {

	private static int milesCovered;
	private static int gallonsUsed;
	private static Float milePerGallon;

	public static void main(String[] args) {
		System.out.println("Please enter the miles driven..\n");
		Scanner miles = new Scanner(System.in);
		System.out.println("Now enter the amount of gallons used.. \n");
		Scanner gallons = new Scanner(System.in);
		// Convert miles input to integers
		
	try {
		milesCovered = Integer.parseInt(miles.next());
		gallonsUsed = Integer.parseInt(gallons.next());
		Float result = (Float)(milesCovered/gallonsUsed);
		//milePerGallon = Float.parseFloat(result);
		System.out.println("The miles per gallon used: "+result);
	}
	catch (Exception e) {
		System.out.println("Wrong data input: "+e.getMessage());
	}

	}
}
