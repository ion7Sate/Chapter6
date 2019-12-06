import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Enter your number: ");
        number = input.nextInt();

        System.out.println("Reverse for this number is "+reverse(number));
    }

    public static int reverse(int number){
        int revers = 0;
        while(number != 0){
            int digits = number % 10;
            revers = revers * 10 + digits;
            number /= 10;
        }
        return revers;

    }
}
