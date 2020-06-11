import java.util.ArrayList;
import java.util.Scanner;

public class AirlineReservation {
    static int[] seats = new int[20];
    public static void main(String args[]) {
        System.out.println("Type 1 for first class or 2 for economy class");
        Scanner input = new Scanner(System.in);
        int flightClass = input.nextInt();

        switch(flightClass) {
            case 1:
            firstClass();
            break;
            case 2:
            economyClass();
            break;
            default:
            System.out.println("Invalid option, you can only choose 1 or 2");
        }
    }

    private static int firstClass() {
        ArrayList<Integer> occupied = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 8; i++) {
            if (seats[i] == 0) {
                occupied.add(i);
            }
            System.out.println("Please choose a seat from the available ones "+ occupied);
            int seatNumber = input.nextInt();
            seats[seatNumber] = 1;
        }
        return 0;
    }

    private static int economyClass() {
        return 0;
    }
}