import java.util.Scanner;

public class SeparateEvenOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        NumberSeparator separator = new NumberSeparator(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();

            separator.addNumber(num);
        }

        separator.displayEvenNumbers();
        separator.displayOddNumbers();
    }
}
