import java.util.Scanner;

public class GetUserInfo {

   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
   
      System.out.print("Please enter your age: ");
      int age = input.nextInt();
      //Do this if the first input is not nextLine()
      input.nextLine();
      System.out.print("Please enter your name: ");
      String name = input.nextLine();
   
      System.out.println("Your name is " +name+ " and you are " +age+ " years old. ");
   }
   
}
