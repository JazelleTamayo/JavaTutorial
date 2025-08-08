public class Character {
   String name, dialog;
   int hp, mp, lvl;
   
   Character(String name, String dialog, int hp, int mp, int lvl) {
      this.name = name;
      this.dialog = dialog;
      this.hp = hp;
      this.mp = mp;
      this.lvl = lvl;
     
   }
   
   public void introduce() {
      System.out.println("I am " +name+ "!");
   }
   
   public void dialog() {
      System.out.println(dialog);
   }
   
   public void talkTo(String firstName) {
      System.out.println(name+ ": Hello " +firstName);
   }
}