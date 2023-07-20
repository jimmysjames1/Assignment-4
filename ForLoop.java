public class ForLoop {
    public static void main(String[] args) {
        // Using a for loop to output the numbers
        for (int i = 12; i <= 28; i += 2) {
            System.out.print(i);
            if (i < 28) {
                System.out.print(", ");
            }
        }
    }
}
