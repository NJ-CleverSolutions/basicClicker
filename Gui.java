import javax.swing.*;
import java.awt.*;

public class Gui {

    public Gui() {

    }

    public JFrame createJFrame() {

        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(800, 800);
        jFrame.getContentPane().setBackground(Color.decode("#6C5137"));

        return jFrame;
    }

    public JButton createJButton(String name, int font) {

        JButton jButton = new JButton(name);
        jButton.setVisible(true);
        jButton.setBorderPainted(false);
        jButton.setBackground(Color.decode("#4D1B58"));
        jButton.setForeground(Color.decode("#FF6100"));
        jButton.setFont(new Font("Arial", Font.BOLD, font));

        return jButton;
    }

    public JPanel createJPanel() {
        JPanel jPanel = new JPanel();
        jPanel.setVisible(true);
        jPanel.setBackground(Color.decode("#4D1B58"));

        return jPanel;
    }

    public JLabel createJLabel(String name, int font) {

        JLabel jLabel = new JLabel();
        jLabel.setText(name);
        jLabel.setVisible(true);
        jLabel.setBackground(Color.decode("#4D1B58"));
        jLabel.setForeground(Color.decode("#FF6100"));
        jLabel.setFont(new Font("Arial", Font.BOLD, font));
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);

        return jLabel;
    }

    public JTextField createJTextField(String name) {

        JTextField jTextField = new JTextField();
        jTextField.setText(name);
        jTextField.setEditable(false);
        jTextField.setVisible(true);
        jTextField.setSize(800, 50);
        jTextField.setFont(new Font("Arial", Font.BOLD, 20));
        jTextField.setBackground(Color.decode("#4D1B58"));
        jTextField.setForeground(Color.decode("#FF6100"));
        jTextField.setHorizontalAlignment(JTextField.CENTER);

        return jTextField;
    }

    public JMenuBar createJMenuBar() {

        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setVisible(true);
        jMenuBar.setBackground(Color.decode("#4D1B58"));

        return jMenuBar;
    }

    public JMenu createJMenu() {

        JMenu jMenu = new JMenu();
        jMenu.setVisible(true);

//        JMenuItem option1 = new JMenuItem("Back");
//        JMenuItem option2 = new JMenuItem("Save Game");
//        JMenuItem option3 = new JMenuItem("Option 3");
//        JMenuItem option4 = new JMenuItem("Option 4");
//        JMenuItem option5 = new JMenuItem("Upgrades & Buffs");
//        menu.add(option1);
//        menu.add(option2);
//        menu.add(option3);
//        menu.add(option4);
//        menu.add(option5);

        return jMenu;
    }

}
