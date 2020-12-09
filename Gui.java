import javax.swing.*;
import java.awt.*;

public class Gui {

    public String name;
    public boolean resize;
    public boolean visible;
    public int sizeX;
    public int sizeY;
    public int location;
    public int locationIncrement;
    public int[] buttonSpacing = {25, 75, 125, 175, 225, 275};

    public Gui(String name, boolean resize, boolean visible, int sizeX) {
        this.name = name;
        this.resize = resize;
        this.visible = visible;
        this.sizeX = sizeX;
        sizeY = sizeX;
    }

    public Gui(String name, boolean resize, boolean visible, int sizeX, int sizeY) {
        this.name = name;
        this.resize = resize;
        this.visible = visible;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public Gui(String name, boolean visible, int size, int location, int locationIncrement) {
        this.name = name;
        this.visible = visible;
        this.location = location;
        this.locationIncrement = locationIncrement;
        this.sizeX = size;
        sizeY = sizeX;
    }

    public Gui(String name, boolean visible, int size) {
        this.name = name;
        this.visible = visible;
        this.sizeX = size;
        sizeY = sizeX;
    }

    public JFrame createScreen() {
        JFrame screen = new JFrame(name);
        screen.setLayout(null);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen.setResizable(resize);
        screen.setVisible(visible);
        screen.setSize(sizeX, sizeY);

        return screen;
    }

    public int screenSizeX() {
        JFrame screen = new JFrame();
        screen.setResizable(true);
        screen.setLocation(0, 0);
        screen.setState(Frame.NORMAL);
        Rectangle r = screen.getBounds();
        int x = r.height;

        return x;
    }

    public int screenSizeY() {
        JFrame screen = new JFrame();
        screen.setResizable(true);
        screen.setLocation(0, 0);
        screen.setState(Frame.NORMAL);
        Rectangle r = screen.getBounds();
        int y = r.width;

        return y;
    }

    public JButton createButton1() {
        JButton button = new JButton(name);
        button.setVisible(visible);
        button.setSize(sizeX, sizeY / 4);
        button.setLocation(location, locationIncrement);

        return button;
    }

    public JButton createReturnButton() {
        JButton r = new JButton(name);
        r.setVisible(visible);
        r.setSize(sizeX, sizeY);
        r.setLocation(0, 0);

        return r;
    }

    public JLabel createJLabel() {
        JLabel label = new JLabel();
        label.setVisible(visible);
        label.setSize(sizeX, sizeY / 4);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLocation(location, locationIncrement);

        return label;
    }

    public JTextField createJTextField() {
        JTextField field = new JTextField(20);
        field.setVisible(visible);
        field.setSize(sizeX, sizeY / 4);
        field.setHorizontalAlignment(JTextField.CENTER);
        field.setLocation(location, locationIncrement);

        return field;
    }

    public JTextArea createInstruction() {
        JTextArea text = new JTextArea(name);
        text.setVisible(visible);
        text.setSize(sizeX + 150, sizeY);
        text.setLocation(50, 0);

        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationIncrement(int location) {
        this.locationIncrement = buttonSpacing[location];
    }

    public void setSizeX(int size) {
        this.sizeX = size;
    }

    public void setSizeY(int size) {
        this.sizeY = size;
    }
}
