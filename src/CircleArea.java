import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;

        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();

        System.out.println("The area of the cirle is: "+circleArea(radius));
    }
    public static double circleArea(double radius){
        return Math.PI*Math.pow(radius,2);
    }
}
