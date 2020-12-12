import javax.swing.*;
import java.awt.*;

public class Gui {

    public String name;
    public boolean visible;
    public int size;
    public JFrame screen;

    public Gui(String name, boolean visible, int size) {
        this.name = name;
        this.visible = visible;
        this.size = size;
    }

    public JFrame createScreen() {
        screen = new JFrame(name);
        screen.getContentPane().setBackground(Color.decode("#6C5137"));
        screen.setLayout(null);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen.setResizable(false);
        screen.setVisible(visible);
        screen.setSize(size,size);

        return screen;
    }

    public JButton createButton1() {
        JButton button = new JButton(name);
        button.setVisible(visible);
        button.setSize(800, 100);

        return button;
    }

    public JButton createReturnButton() {
        JButton r = new JButton(name);
        r.setVisible(visible);
        r.setSize(size, size);
        r.setLocation(0, 0);

        return r;
    }

    public JLabel createJLabel() {
        JLabel label = new JLabel();
        label.setVisible(visible);
        label.setSize(size, size / 4);
        label.setHorizontalAlignment(JLabel.CENTER);

        return label;
    }

    public JTextField createJTextField() {
        JTextField field = new JTextField(20);
        field.setVisible(visible);
        field.setSize(size, size);
        field.setHorizontalAlignment(JTextField.CENTER);

        return field;
    }

    public JTextArea createInstruction() {
        JTextArea text = new JTextArea(name);
        text.setVisible(visible);
        text.setSize(size + 150, size);
        text.setLocation(50, 0);

        return text;
    }

    public JMenuBar createMenuBar() {
        JMenuBar menuBar= new JMenuBar();

        menuBar.setVisible(visible);
        menuBar.setSize(800, 100);
        menuBar.setLocation(0, 650);
        menuBar.setBackground(Color.GRAY);

        return menuBar;
    }

    public JMenu createMenu() {
        JMenu menu = new JMenu("Menu");
        menu.setVisible(visible);
        JMenuItem option1 = new JMenuItem("Back");
        JMenuItem option2 = new JMenuItem("Save Game");
        JMenuItem option3 = new JMenuItem("Option 3");
        JMenuItem option4 = new JMenuItem("Option 4");
        JMenuItem option5 = new JMenuItem("Upgrades & Buffs");
        menu.add(option1);
        menu.add(option2);
        menu.add(option3);
        menu.add(option4);
        menu.add(option5);

        return menu;
    }

    public JPanel createJPanel() {
        JPanel panel = new JPanel();
        panel.setVisible(true);
        panel.setSize(size, size);

        return panel;
    }

    public void setName(String name) {
        this.name = name;
    }
}
