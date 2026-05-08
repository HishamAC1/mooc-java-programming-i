
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberone = Integer.valueOf(scanner.nextLine());
        int numbertwo = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(numberone + numbertwo);
        System.out.println(squareRoot);
    }
}
