import java.util.Scanner;

public class Incsurance {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the year of your birth: ");
      int birthYear = input.nextInt();
      System.out.print("Enter the current year: ");
      int curYear = input.nextInt();
      
      int premAmount = calcAmount(birthYear, curYear);
      System.out.println("The premium amount is $" +premAmount);
   }
   
   public static int calcAmount(int birthYear, int curYear) {
      int decade = (curYear - birthYear) / 10;
      int premAmount = (decade + 15) * 20;
      return premAmount;
   }
}