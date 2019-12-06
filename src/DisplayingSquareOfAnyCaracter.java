import java.util.Scanner;

public class DisplayingSquareOfAnyCaracter {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter lenght of the square  :");
        size = input.nextInt();

        System.out.println("Enter your char: ");
        char c = input.next().charAt(0);

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++)
                System.out.print(c+" ");
                System.out.println();


        }
    }
}

