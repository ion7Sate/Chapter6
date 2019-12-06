import java.util.Scanner;

public class HypotenuseCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         double size1;
         double size2;

        System.out.println("Enter first size: ");
        size1 = input.nextDouble();

        System.out.println("Enter second size: ");
        size2 = input.nextDouble();

        double hypotenuse = calculateHypotenuse(size1,size2);
        System.out.println("Hypotenuse is: " + hypotenuse);
    }

    public static double calculateHypotenuse(double size1,double size2){
        return  Math.sqrt(Math.pow(size1,2) + Math.pow(size2,2));

    }
}
