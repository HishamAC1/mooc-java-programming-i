
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = 0;
        double positiveaverage = 0;
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            if (number < 0) {
                continue;
            }
            input++;
            positiveaverage = positiveaverage + number;

        }
        if (input == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(positiveaverage / input);
        }
    }
}
