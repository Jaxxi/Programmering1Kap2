import javax.swing.*;

public class dialog{
  public static void main (String[] arg) {
    String namn;
    String hälsning;
    namn = JOptionPane.showInputDialog("Vad heter du?");
    hälsning = "Välkommen " + namn;
    JOptionPane.showMessageDialog(null, hälsning);
  }
}
