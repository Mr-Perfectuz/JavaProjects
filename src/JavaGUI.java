import  javax.swing.JOptionPane;
public class JavaGUI {
     public static void main(String [] args){

         String name = JOptionPane.showInputDialog("Enter your name ");
         JOptionPane.showMessageDialog(null, "Hello "+ name);

         int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
         JOptionPane.showMessageDialog(null, "Your age is "+ name);




         // GUI = Graphical User Interface

     }
}
