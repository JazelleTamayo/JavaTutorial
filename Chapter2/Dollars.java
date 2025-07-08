import java.util.Scanner;

public class Dollars {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter integer number of dollar: ");
      int dollar = input.nextInt();
      
      int twenties = dollar / 20;
      dollar %= 20;
      System.out.println(twenties+ " twenty-dollar bill/bills");
      
      int tenths = dollar / 10;
      dollar %= 10;
      System.out.println(tenths+ " ten-dollar bill/bills");
      
      int fifths = dollar / 5;
      dollar %= 5;
      System.out.println(fifths+ " five-dollar bill/bills");
      
      int ones = dollar / 1;
      dollar %= 1;
      System.out.println(ones+ " one-dollar bill/bills");
      
      
      
   }
}