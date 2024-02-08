public class NumberSeparator {
    private int[] even;
    private int[] odd;
    private int evenCount;
    private int oddCount;

    public NumberSeparator(int size) {
        even = new int[size];
        odd = new int[size];
        evenCount = 0;
        oddCount = 0;
    }

    public void addNumber(int num) {
        if (num % 2 == 0) {
            even[evenCount++] = num;
        } else {
            odd[oddCount++] = num;
        }
    }

    public void displayEvenNumbers() {
        System.out.println("Even numbers:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();
    }

    public void displayOddNumbers() {
        System.out.println("Odd numbers:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();
    }
}
