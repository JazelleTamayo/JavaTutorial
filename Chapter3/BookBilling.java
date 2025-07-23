import java.util.Scanner;

public class BookBilling {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of books ordered: ");
      int book = input.nextInt();
      System.out.print("Enter the coupon value: ");
      double coupon = input.nextInt();
      
      double due1 = computeBill();
      double due2 = computeBill(book);
      double due3 = computeBill(book, coupon);
      
      System.out.println("The total dues are: ");
      System.out.println(due1);
      System.out.println(due2);
      System.out.println(due3);
   }
   
   public static double computeBill() {
      double due1 = 14.99 + (14.99 * 0.08);
      return due1;
   }
   
   public static double computeBill(int book) {
      double bookValue = 14.99 * book;
      double due2 = bookValue + (bookValue * 0.08); 
      return due2;
   }
   
   public static double computeBill(int book, double coupon) {
      double bookValue = (14.99 * book) - coupon;
      double due3 = bookValue + (bookValue * 0.08);
      return due3;
   }
}