import java.util.Scanner;

public class MinutesConversion {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter the number of minutes you want to convert: ");
      int minute = input.nextInt();
      
      int hours = minute / 60;
      float days = (float) hours / 24;
      System.out.println(minute+ " minutes equals " +hours+ " hours and equals " +days+ " days");
      
   }
}