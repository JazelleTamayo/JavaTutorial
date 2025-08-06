import java.util.Scanner;

public class FruitsType {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Fruit item1 = new Fruit();
      
      System.out.print("Enter the name of fruit: ");
      String fruit = input.nextLine();
      System.out.print("Enter the weight of fruit: ");
      double weight = input.nextDouble();
      System.out.print("Enter the price of fruit: ");
      double price = input.nextDouble();
      
      item1.setFruit(fruit);
      item1.setWeight(weight);
      item1.setPrice(price);
      
      System.out.println("Fruit: " +item1.getFruit());
      System.out.println("Weight: " +item1.getWeight()+ "kl");
      System.out.println("Price: $" +item1.getPrice());
      
   }
}