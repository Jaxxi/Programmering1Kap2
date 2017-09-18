import javax.swing.*;
public class initieringar{
  public static void main(String[] arg) {
    String namn,adress,number,var;

    namn = "Linus";
    adress = "Hidden";
    number = "00102130124";
    var = namn +"\n"+ adress +"\n"+ number;

    JOptionPane.showMessageDialog(null,var);

  }
}
