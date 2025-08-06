public class Main {
   public static void main(String[] args) {
      Person driver = new Person();
      Person guard = new Person();
      
      driver.firstName = "Pedro";
      driver.lastName = "Santos";
      driver.sex = 'M';
      driver.age = 26;
      
      guard.firstName = "David";
      guard.lastName = "Mendoza";
      guard.sex = 'M';
      guard.age = 30;
      
      System.out.println("The Driver Details");
      System.out.println("Name: " +driver.firstName+ " " +driver.lastName);
      System.out.println("Sex: " +driver.sex);
      System.out.println("Age: " +driver.age);
      
      System.out.println("\nThe Guard Details");
      System.out.println("Name: " +guard.firstName+ " " +driver.lastName);
      System.out.println("Sex: " +guard.sex);
      System.out.println("Age: " +guard.age);
      
   }
}