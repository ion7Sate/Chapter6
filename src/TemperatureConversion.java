import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choise;
        double fahrenheit=0;
        double celsius=0;

        System.out.println("Enter:");
        System.out.println("1 to convert from fahrenheit to celsius ");
        System.out.println("2  to convert from celsius to fahrenheit ");

        choise = input.nextInt();

        switch (choise){
            case 1:
                System.out.println("Enter temperature in fahrenheit: ");
                fahrenheit = input.nextDouble();
                System.out.println("Temperature in celsius is "+conversionToCelsius(fahrenheit));
                break;

            case 2:
                System.out.println("Enter temperature in celsius: ");
                celsius = input.nextDouble();
                System.out.println("Temperature in fahrenheit is :"+conversionToFahrenheit(celsius));
                break;

        }
    }

    public static double   conversionToCelsius(double fahrenheit){
        double celsius;
        return (celsius = (5.0 / 9.0) * (fahrenheit - 32));
    }

    public static double conversionToFahrenheit(double celsius){
        double fahrenheit;
        return (fahrenheit = (9.0 / 5.0) * (celsius + 32));
    }
}
