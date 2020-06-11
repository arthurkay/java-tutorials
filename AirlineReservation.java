import java.util.ArrayList;
import java.util.Scanner;

class AirlineReservation {
    static int[] seats = new int[20];
    static ArrayList<Integer> occupied = new ArrayList<>();
    public static void main(String[] args) {
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
        Boolean terminate = false;
        Scanner input = new Scanner(System.in);
        
        while (!terminate) {
            availableSeats();
            System.out.println("Please choose a seat from the available ones "+ occupied);
            int seatNumber = input.nextInt();
            seats[seatNumber] = 1;
            if (seatNumber > 8) {
                System.out.println("That seat number is only available in economy");
                terminate = true;
            } 
        }
        return 0;
    }

    private static int economyClass() {
        return 0;
    }

    private static int availableSeats() {
        occupied.clear();
        for (int i = 1; i <= 8; i++) {
            if (seats[i] == 0) {
                occupied.add(i);
            }
        }
        return 0;
    }
}