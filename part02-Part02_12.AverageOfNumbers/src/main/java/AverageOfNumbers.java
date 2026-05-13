
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  inputs = 0;
        double sum = 0;
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            }
            inputs++;
            sum = sum + number;
        }
        System.out.print("Average of the numbers: " + (sum / inputs));
    }
}
