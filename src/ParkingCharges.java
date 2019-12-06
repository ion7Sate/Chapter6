import java.util.Scanner;

public class ParkingCharges {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberCustumer;
        double totalParkingCharges = 0;

        System.out.println("Enter the number of custumer");
        numberCustumer = input.nextInt();

       for (int i = 0; i < numberCustumer; i++) {

            System.out.println("Enter the number of hours parked: ");
            double hours = input.nextDouble();

           System.out.println(" The custumer must pay "+calculateCharges(Math.ceil(hours)));

           totalParkingCharges +=calculateCharges(hours);
    }
        System.out.println("Total yesterday's recips have value of " + totalParkingCharges + "$");

    }
    public static double calculateCharges(double hours) {
        double parkingCharges = 0;
        if (hours < 3) {
            parkingCharges = 2.0D;
        }
        if (hours > 3.01D && hours <= 24) {
            parkingCharges = (hours - 3) * 0.5D + 2;
        }
        if (hours > 24) {
            parkingCharges = 10;
        }
        return parkingCharges;

    }

}



