public class SumNumbers{
 public static void main(String[] args) {
 int start = 20;
 int end = 25;
 int sum = 0;
 int num = start;
 do {
 sum += num;
 num++;
 } while (num <= end);
 System.out.println("The sum of numbers between " + start + " and " + end + " is: " +
sum);
 }
}
