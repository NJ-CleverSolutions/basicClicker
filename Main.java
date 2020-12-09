import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public User user;
    public Gui screen;
    public Gui button1;
    public Gui label1;
    public Gui textField1;
    public Gui returnButton;
    public Gui wordField;
    public FileLoader loader;
    public FileWriter saver;
    public static Main main = new Main();

    public Main() {
        user = new User("Guest", "Unknown");
        screen = new Gui("basicClicker", false, true, 400);
        label1 = new Gui("", true, 200, 100, 25);
        textField1 = new Gui("", true, 200, 100, 25);
        button1 = new Gui("Generic", true, 200, 100, 25);
        returnButton = new Gui("<", true, 50);
        wordField = new Gui("", true, 50);
        loader = new FileLoader();
        saver = new FileWriter();
    }

    public static void main(String[] args) {
        main.titleScreen();
    }

    public void titleScreen() {
        JFrame title = screen.createScreen();

        button1.setName("Start");
        button1.setLocationIncrement(3);
        JButton start = button1.createButton1();
        title.add(start);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                title.dispose();
                menuScreen();
            }
        });
    }

    public void menuScreen() {

        JFrame menu = screen.createScreen();

        button1.setName("Play");
        button1.setLocationIncrement(0);
        JButton play = button1.createButton1();
        menu.add(play);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                menu.dispose();

                if (user.getName().equals("Guest")) {
                    newGame();
                } else {
                    game();
                }
            }
        });

        button1.setName("Settings");
        button1.setLocationIncrement(1);
        JButton settings = button1.createButton1();
        menu.add(settings);

        settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                settings();
            }
        });

        button1.setName("Credits");
        button1.setLocationIncrement(2);
        JButton credits = button1.createButton1();
        menu.add(credits);

        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                credits();
            }
        });

        JButton back = returnButton.createReturnButton();
        menu.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                titleScreen();
            }
        });
    }

    public void newGame() {

        JFrame game = screen.createScreen();

        label1.setLocationIncrement(1);
        JLabel nameLbl = label1.createJLabel();
        nameLbl.setText("Enter a username below");
        game.add(nameLbl);

        textField1.setLocationIncrement(2);
        JTextField enterName = textField1.createJTextField();
        game.add(enterName);

        enterName.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                user.setName(enterName.getText());
                user.setSaveName(enterName.getText());
                enterName.setText("");
            }
        });

        button1.setName("Continue");
        button1.setLocationIncrement(3);
        JButton continuing = button1.createButton1();
        game.add(continuing);

        continuing.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.dispose();
                game();
            }
        });

        button1.setName("Cancel");
        button1.setLocationIncrement(4);
        JButton cancel = button1.createButton1();
        game.add(cancel);

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.dispose();
                menuScreen();
            }
        });
    }

    public void settings() {

        JFrame settings = screen.createScreen();

        button1.setName("Game Settings");
        button1.setLocationIncrement(0);
        JButton game = button1.createButton1();
        settings.add(game);

        game.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                settings.dispose();
                gameSettings();
            }
        });

        button1.setName("User Settings");
        button1.setLocationIncrement(1);
        JButton user = button1.createButton1();
        settings.add(user);

        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                settings.dispose();
                userSettings();
            }
        });

        JButton back = returnButton.createReturnButton();
        settings.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                settings.dispose();
                menuScreen();
            }
        });
    }

    public void credits() {

        JFrame credits = screen.createScreen();

        wordField.setName("Sleepy Lizard Studios");
        JTextArea instruct = wordField.createInstruction();
        credits.add(instruct);

        JButton back = returnButton.createReturnButton();
        credits.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                credits.dispose();
                menuScreen();
            }
        });
    }

    public void gameSettings() {

        JFrame game = screen.createScreen();

        button1.setName("Maximize");
        button1.setLocationIncrement(0);
        JButton max = button1.createButton1();
        game.add(max);

        max.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //String name, boolean resize, boolean visible, int sizeX, int sizeY
                screen = new Gui("basicClicker", false, true, 0,0);
                screen.setSizeX(screen.screenSizeX());
                screen.setSizeY(screen.screenSizeY());
                settings();
            }
        });

        JButton back = returnButton.createReturnButton();
        game.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.dispose();
                settings();
            }
        });
    }

    public void userSettings() {

        JFrame user = screen.createScreen();

        JButton back = returnButton.createReturnButton();
        user.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                user.dispose();
                settings();
            }
        });
    }

    public void game() {

        JFrame game = screen.createScreen();
        game.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        JButton save = returnButton.createReturnButton();
        game.add(save);

        save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.dispose();
                saver.save();
                menuScreen();
            }
        });
    }

}
