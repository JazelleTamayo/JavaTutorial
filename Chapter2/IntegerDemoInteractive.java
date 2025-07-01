import java.util.Scanner;

public class IntegerDemoInteractive {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter an integer: ");
      int anInt = input.nextInt();
      System.out.print("Please enter a byte: ");
      byte aByte = input.nextByte();
      System.out.print("Please enter a short integer: ");
      short aShort = input.nextShort();
      System.out.print("Please enter a long integer: ");
      long aLong = input.nextLong();
      input.nextLine();
      System.out.print("Please enter your name: ");
      String name = input.nextLine();
      
      System.out.println("The int is " +anInt);
      System.out.println("The byte is " +aByte);
      System.out.println("The short is " +aShort);
      System.out.println("The long is " +aLong);
      System.out.println("Your name is: " +name);
   }
}
