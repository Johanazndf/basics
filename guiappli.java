import javax.swing.JOptionPane;
public class guiappli {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter the name");
        JOptionPane.showMessageDialog(null,"Helloo " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
        JOptionPane.showMessageDialog(null,"You are " +age+"years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height"));
        JOptionPane.showMessageDialog(null,"You are " +height+"cm tall");
    }
}
