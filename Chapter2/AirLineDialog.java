import javax.swing.JOptionPane;

public class AirLineDialog {
   public static void main(String[] args) {
      int selection = JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?");
      boolean isYes = (selection == JOptionPane.NO_OPTION);
      
      JOptionPane.showMessageDialog(null, "You responded " +isYes);
   }
}