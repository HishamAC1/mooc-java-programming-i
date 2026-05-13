import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where to? ");
        System.out.print("Where from?");
        int end = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }
}