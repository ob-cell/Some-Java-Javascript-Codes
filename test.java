import javax.swing.JOptionPane;

public class swearsgen{
    public static void main(String[] args){
        String password = JOptionPane.showInputDialog("Password here");
        JOptionPane.showMessageDialog(null,"Password: "+ password);
    }
}
