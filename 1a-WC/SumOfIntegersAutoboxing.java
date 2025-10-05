import java.util.ArrayList;
import java.util.Scanner;

public class SumOfIntegersAutoboxing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            System.out.print("Enter number: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or 'done' to finish.");
            }
        }

        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }

        System.out.println("\nNumbers entered: " + numbers);
        System.out.println("Sum of integers: " + sum);

        scanner.close();
    }
}
