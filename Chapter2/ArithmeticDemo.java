import java.util.Scanner;

public class ArithmeticDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter an integer: ");
      int num1 = input.nextInt();
      
      System.out.print("Please enter another integer: ");
      int num2 = input.nextInt();
      
      int sum = num1 + num2;
      int difference = num1 - num2;
      int average = num1/num2;
      
      System.out.println(num1+ " + " +num2+ " = " +sum);
      System.out.println(num1+ " - " +num2+ " = " +difference);
      System.out.println("The average of " +num1+ " + " +num2+ " = " +average);


   }
}