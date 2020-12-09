import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public User user;
    public static Gui screen;
    public Gui button1;
    public Gui label1;
    public Gui textField1;
    public Gui returnButton;
    public Gui wordField;
    public Gui clickMe;
    public Gui menuBar;
    public Gui panel;
    public static JFrame gui;
    public FileLoader loader;
    public FileWriter saver;
    public Game game;
    public static Main main = new Main();

    public Main() {
        user = new User("Guest");
        screen = new Gui("basicClicker", true, 800);
        label1 = new Gui("", true, 200, 100);
        textField1 = new Gui("", true, 200, 100);
        button1 = new Gui("Generic", true, 200, 100);
        returnButton = new Gui("<", true, 50);
        menuBar = new Gui("menuBar", true, 400, 0);
        wordField = new Gui("", true, 50);
        clickMe = new Gui("Click me", true, 100, 100);
        panel = new Gui("0.00", true, 100);
        game = new Game();
        loader = new FileLoader();
        saver = new FileWriter();
    }

    public static void main(String[] args) {
        gui = screen.createScreen();
        main.titleScreen();
    }

    public void titleScreen() {

        button1.setName("Start");
        JButton start = button1.createButton1();
        start.setLocation(0,300);
        gui.add(start);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                menuScreen();
            }
        });
    }

    public void menuScreen() {

        button1.setName("Play");
        JButton play = button1.createButton1();
        play.setLocation(0,100);
        gui.add(play);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                gui.getContentPane().removeAll();
                gui.repaint();

                if (user.getName().equals("Guest")) {
                    play();
                } else {
                    game();
                }
            }
        });

        button1.setName("Settings");
        JButton settings = button1.createButton1();
        settings.setLocation(0,200);
        gui.add(settings);

        settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                settings();
            }
        });

        button1.setName("Credits");
        JButton credits = button1.createButton1();
        credits.setLocation(0,300);
        gui.add(credits);

        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                credits();
            }
        });

        JButton back = returnButton.createReturnButton();
        gui.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                titleScreen();
            }
        });
    }

    public void play() {

        JLabel nameLbl = label1.createJLabel();
        nameLbl.setText("Enter a username below");
        gui.add(nameLbl);

        JTextField enterName = textField1.createJTextField();
        gui.add(enterName);

        enterName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                user.setName(enterName.getText());
                enterName.setText("");
            }
        });

        button1.setName("Continue");
        JButton continuing = button1.createButton1();
        continuing.setLocation(0,550);
        gui.add(continuing);

        continuing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                game();
            }
        });

        button1.setName("Cancel");
        JButton cancel = button1.createButton1();
        cancel.setLocation(0,650);
        gui.add(cancel);

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                menuScreen();
            }
        });
    }

    public void settings() {

        button1.setName("Game Settings");
        JButton game = button1.createButton1();
        gui.add(game);

        game.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                gameSettings();
            }
        });

        button1.setName("User Settings");
        JButton user = button1.createButton1();
        gui.add(user);

        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                userSettings();
            }
        });

        JButton back = returnButton.createReturnButton();
        gui.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                menuScreen();
            }
        });
    }

    public void credits() {

        wordField.setName("Sleepy Lizard Studios");
        JTextArea instruct = wordField.createInstruction();
        instruct.setEnabled(false);
        gui.add(instruct);

        JButton back = returnButton.createReturnButton();
        gui.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                menuScreen();
            }
        });
    }

    public void gameSettings() {

        JButton back = returnButton.createReturnButton();
        gui.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                settings();
            }
        });
    }

    public void userSettings() {

        JButton back = returnButton.createReturnButton();
        gui.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                settings();
            }
        });
    }

    public void game() {

        gui.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JMenuBar jMenuBar = menuBar.createMenuBar();
        JMenu menu = new JMenu("Menu");

        JMenuItem option1 = new JMenuItem("Option 1");
        JMenuItem option2 = new JMenuItem("Option 2");
        JMenuItem option3 = new JMenuItem("Option 3");
        JMenuItem option4 = new JMenuItem("Option 4");
        JMenuItem option5 = new JMenuItem("Option 5");
        menu.add(option1).add(option2);
        menu.add(option3).add(option4);
        menu.add(option5);

        jMenuBar.add(menu);

        gui.add(jMenuBar);

        JTextField netWorth = wordField.createJTextField();
        netWorth.setEditable(false);
        netWorth.setText("$ " + game.getNetWorth());
        netWorth.setFont(new Font("Arial", Font.BOLD, 18));
        netWorth.setSize(800,20);
        netWorth.setLocation(0, 0);
        gui.add(netWorth);

        button1.setName("Click Me Linus");
        JButton main = button1.createButton1();
        main.setLocation(0,550);
        gui.add(main);

        main.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.setNetWorth(game.getIncrementClick());
                netWorth.setText("$ " + game.getNetWorth());
                netWorth.repaint();
                gui.repaint();
            }
        });
    }
}
