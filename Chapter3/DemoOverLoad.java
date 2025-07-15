public class DemoOverLoad {
   public static void main(String[] args) {
      int month = 6, day = 24, year = 2023;
      displayDate(month);
      displayDate(month, day);
      displayDate(month, day, year);
   }
   
   public static void displayDate(int month) {
      System.out.println("Event Date " +month+ "/1/2025");
   }
   
   public static void displayDate(int month, int day) {
      System.out.println("Event Date " +month+ "/" +day+ "/2025");
   }
   
   public static void displayDate(int month, int day, int year) {
      System.out.println("Event Date " +month+ "/" +day+ "/" +year);
   }
}