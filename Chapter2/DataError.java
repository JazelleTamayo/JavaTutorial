import javax.swing.JOptionPane;

public class DataError {
   public static void main(String[] arg) {
      int selection = JOptionPane.showConfirmDialog(null, "A data input error has occred. Continue?", "Data input error", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
      //boolean isYes = (selection == JOptionPane.YES_OPTION);
      
      if (selection == JOptionPane.YES_OPTION) {
         JOptionPane.showMessageDialog(null, "EMPTY!");
      } 
   }
} 