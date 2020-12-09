import javax.swing.*;
import java.awt.*;
import java.time.chrono.JapaneseChronology;

public class Gui {

    public String name;
    public boolean resize;
    public boolean visible;
    public int size;
    public int location;
    public int locationIncrement;
    public JFrame screen;

    public Gui(String name, boolean visible, int size, int location) {
        this.name = name;
        this.visible = visible;
        this.location = location;
        this.locationIncrement = locationIncrement;
        this.size = size;
    }

    public Gui(String name, boolean visible, int size) {
        this.name = name;
        this.visible = visible;
        this.size = size;
    }

    public JFrame createScreen() {
        screen = new JFrame(name);
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
        button.setLocation(location, locationIncrement);

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
        label.setLocation(location, locationIncrement);

        return label;
    }

    public JTextField createJTextField() {
        JTextField field = new JTextField(20);
        field.setVisible(visible);
        field.setSize(size, size / 4);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setLocation(location, locationIncrement);

        return field;
    }

    public JTextArea createInstruction() {
        JTextArea text = new JTextArea(name);
        text.setVisible(visible);
        text.setSize(size + 150, size);
        text.setLocation(50, 0);

        return text;
    }

    public JPanel createMenuBar() {
        JPanel menuBar = new JPanel();
        menuBar.setVisible(visible);
        menuBar.setSize(size, size);
        menuBar.setLocation(0, 0);
        menuBar.setBackground(Color.GRAY);

        return menuBar;
    }

    public JButton createClickMeButton() {
        JButton clickMe = new JButton(name);
        clickMe.setVisible(visible);
        clickMe.setSize(size, size / 4);
        clickMe.setLocation(location, locationIncrement);

        return clickMe;
    }

    public void setName(String name) {
        this.name = name;
    }
}
