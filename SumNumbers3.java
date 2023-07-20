public class SumNumbers3 {
 public static void main(String[] args) {
 int sum = 0;
 int number = 1;
 while (number <= 50) {
 if (number % 2 != 0) {
 sum += number;
 }
 number++;
 }
 System.out.println("The sum of odd numbers from 1 to 50 is: " + sum);
 }
}
