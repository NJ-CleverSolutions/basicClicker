import javax.swing.*;

public class Gui {

    public String name;
    public boolean resize;
    public boolean visible;
    public int size;
    public int location;
    public int locationIncrement;
    public int[] buttonSpacing = {25, 75, 125, 175, 225, 275};

    public Gui(String name, boolean resize, boolean visible, int size) {
        this.name = name;
        this.resize = resize;
        this.visible = visible;
        this.size = size;
    }

    public Gui(String name, boolean visible, int size, int location, int locationIncrement) {
        this.name = name;
        this.visible = visible;
        this.size = size;
        this.location = location;
        this.locationIncrement = locationIncrement;
    }

    public Gui(String name, boolean visible, int size) {
        this.name = name;
        this.visible = visible;
        this.size = size;
    }

    public JFrame createScreen() {
        JFrame screen = new JFrame(name);
        screen.setLayout(null);
        screen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        screen.setResizable(resize);
        screen.setVisible(visible);
        screen.setSize(size, size);

        return screen;
    }

    public JButton createButton1() {
        JButton button = new JButton(name);
        button.setVisible(visible);
        button.setSize(size, size / 4);
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

    public JTextArea createInstruction() {
        JTextArea text = new JTextArea(name);
        text.setVisible(visible);
        text.setSize(size + 150, size);
        text.setLocation(50, 0);

        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationIncrement(int location) {
        this.locationIncrement = buttonSpacing[location];
    }
}
