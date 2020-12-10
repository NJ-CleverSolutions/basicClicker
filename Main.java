import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//#4D1B58 dark dark purple
//#607A51 olive green
//#FF6100 orange
//#6C5137 brown

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
    public Gui menu;
    public Gui panel;
    public static JFrame gui;
    public FileLoader loader;
    public FileWriter saver;
    public Game game;
    public static Main main = new Main();
    public int nameCurrent = 0;
    public Font buttonFont = new Font("Arial", Font.BOLD, 30);
    public Font arrowButtonFont = new Font("Arial", Font.BOLD, 20);

    public Main() {
        user = new User("Guest");
        screen = new Gui("basicClicker", true, 800);
        label1 = new Gui("", true, 200);
        textField1 = new Gui("", true, 200);
        button1 = new Gui("Generic", true, 200);
        returnButton = new Gui("<", true, 50);
        menuBar = new Gui("menuBar", true, 400);
        menu = new Gui("Menu", true, 0);
        wordField = new Gui("", true, 50);
        clickMe = new Gui("Click me", true, 100);
        panel = new Gui("Panel", true, 100);
        game = new Game();
        loader = new FileLoader();
        saver = new FileWriter();
    }

    public static void main(String[] args){
        gui = screen.createScreen();
        main.tittyScreen();
    }

    public void tittyScreen() {

        button1.setName("START");
        JButton start = button1.createButton1();
        start.setBackground(Color.decode("#4D1B58"));
        start.setForeground(Color.decode("#FF6100"));
        start.setFont(buttonFont);
        start.setSize(820,100);
        start.setLocation(-10,300);
        gui.add(start);

        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loader.reading();

                if(user.getName().equals("Guest"))
                {
                    gui.getContentPane().removeAll();
                    gui.repaint();
                    gameSetup();

                }else
                {
                    gui.getContentPane().removeAll();
                    gui.repaint();
                    menuScreen();
                }
            }
        });
    }

    public void menuScreen() {

        button1.setName("Play");
        JButton play = button1.createButton1();
        play.setBackground(Color.decode("#4D1B58"));
        play.setForeground(Color.decode("#FF6100"));
        play.setFont(buttonFont);
        play.setLocation(0,100);
        gui.add(play);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                gui.getContentPane().removeAll();
                gui.repaint();

                if (user.getName().equals("stupid")) {
                    //play();
                } else {
                    game();
                }
            }
        });

        button1.setName("Settings");
        JButton settings = button1.createButton1();
        settings.setBackground(Color.decode("#4D1B58"));
        settings.setForeground(Color.decode("#FF6100"));
        settings.setFont(buttonFont);
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
        credits.setBackground(Color.decode("#4D1B58"));
        credits.setForeground(Color.decode("#FF6100"));
        credits.setFont(buttonFont);
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
        back.setBackground(Color.decode("#4D1B58"));
        back.setForeground(Color.decode("#FF6100"));
        back.setFont(arrowButtonFont);
        gui.add(back);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                tittyScreen();
            }
        });
    }

    public void gameSetup() {

        String[] agents = {"Bling Bling", "Trindy Minds", "Workshape", "Reboot", "Koupon Karen"};
        String[] agentsCompany = {"Luxury Property Management", "Black Point Businesses", "Wealthy Wharf Wingman", "Coldwell Computers and Sons", "Half-Price Homes"};

        JLabel nameLabel = label1.createJLabel();
        nameLabel.setText("Select Your Agent:");
        nameLabel.setSize(800,50);
        nameLabel.setLocation(0,0);
        gui.add(nameLabel);

        JLabel agentName = label1.createJLabel();
        agentName.setText("Agent Name: " + agents[nameCurrent]);
        agentName.setSize(800, 50);
        agentName.setLocation(0,50);
        gui.add(agentName);

        JLabel agentCompany = label1.createJLabel();
        agentCompany.setText("Agent Company: " + agentsCompany[nameCurrent]);
        agentCompany.setSize(800, 50);
        agentCompany.setLocation(0,100);
        gui.add(agentCompany);

        button1.setName("<");
        JButton left = button1.createButton1();
        left.setBackground(Color.decode("#4D1B58"));
        left.setForeground(Color.decode("#FF6100"));
        left.setFont(arrowButtonFont);
        left.setSize(50,650);
        left.setLocation(0,0);
        gui.add(left);

        left.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(nameCurrent == 0)
                {
                    nameCurrent = 4;
                }else
                {
                    nameCurrent = nameCurrent - 1;
                }
                agentName.setText("Agent Name: " + agents[nameCurrent]);
                agentCompany.setText("Agent Company: " + agentsCompany[nameCurrent]);
                agentName.repaint();
                agentCompany.repaint();
                gui.repaint();
            }
        });

        button1.setName(">");
        JButton right = button1.createButton1();
        right.setBackground(Color.decode("#4D1B58"));
        right.setForeground(Color.decode("#FF6100"));
        right.setFont(arrowButtonFont);
        right.setSize(50,650);
        right.setLocation(737,0);
        gui.add(right);

        right.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(nameCurrent == 4)
                {
                    nameCurrent = 0;
                }else
                {
                    nameCurrent = nameCurrent + 1;
                }
                agentName.setText("Agent Name: " + agents[nameCurrent]);
                agentCompany.setText("Agent Company: " + agentsCompany[nameCurrent]);
                agentName.repaint();
                agentCompany.repaint();
                gui.repaint();
            }
        });

        button1.setName("Submit");
        JButton submit = button1.createButton1();
        submit.setBackground(Color.decode("#4D1B58"));
        submit.setForeground(Color.decode("#FF6100"));
        submit.setFont(buttonFont);
        submit.setLocation(0,650);
        gui.add(submit);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                user.setName(agentName.getText());
                user.setCompanyName(agentCompany.getText());
                gui.getContentPane().removeAll();
                gui.repaint();
                menuScreen();
            }
        });
    }

    public void settings() {

        button1.setName("Game Settings");
        JButton game = button1.createButton1();
        game.setBackground(Color.decode("#4D1B58"));
        game.setForeground(Color.decode("#FF6100"));
        game.setFont(buttonFont);
        game.setLocation(0,100);
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
        user.setBackground(Color.decode("#4D1B58"));
        user.setForeground(Color.decode("#FF6100"));
        user.setFont(buttonFont);
        user.setLocation(0,200);
        gui.add(user);

        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                userSettings();
            }
        });

        JButton back = returnButton.createReturnButton();
        back.setBackground(Color.decode("#4D1B58"));
        back.setForeground(Color.decode("#FF6100"));
        back.setFont(arrowButtonFont);
        back.setSize(50,50);
        back.setLocation(0,0);
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

        JLabel credits = label1.createJLabel();
        credits.setText("Sleepy Lizard Studios");
        credits.setFont(new Font("Arial", Font.BOLD, 30));
        credits.setForeground(Color.decode("#5B2C6F"));
        credits.setSize(800,50);
        credits.setLocation(0,100);
        gui.add(credits);

        JButton back = returnButton.createReturnButton();
        back.setBackground(Color.decode("#4D1B58"));
        back.setForeground(Color.decode("#FF6100"));
        back.setFont(arrowButtonFont);
        back.setSize(50,50);
        back.setLocation(0,0);
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
        back.setBackground(Color.decode("#4D1B58"));
        back.setForeground(Color.decode("#FF6100"));
        back.setFont(arrowButtonFont);
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
        back.setBackground(Color.decode("#4D1B58"));
        back.setForeground(Color.decode("#FF6100"));
        back.setFont(arrowButtonFont);
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

        JLabel totalLbl = label1.createJLabel();
        totalLbl.setText("Net Worth");
        totalLbl.setFont(new Font("Arial", Font.BOLD, 20));
        totalLbl.setBackground(Color.decode("#4D1B58"));
        totalLbl.setForeground(Color.decode("#FF6100"));
        totalLbl.setSize(800,30);
        totalLbl.setLocation(0,0);

        JTextField netWorth = wordField.createJTextField();
        netWorth.setEditable(false);
        netWorth.setText("$ " + game.getNetWorth());
        netWorth.setFont(new Font("Arial", Font.BOLD, 20));
        netWorth.setBackground(Color.decode("#4D1B58"));
        netWorth.setForeground(Color.decode("#FF6100"));
        netWorth.setSize(800,30);
        netWorth.setLocation(0, 30);
        gui.add(netWorth);

        button1.setName("Click Me Linus");
        JButton main = button1.createButton1();
        main.setBackground(Color.decode("#4D1B58"));
        main.setForeground(Color.decode("#FF6100"));
        main.setFont(buttonFont);
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
        JMenuBar jMenuBar = menuBar.createMenuBar();
        JMenu jMenu = menu.createMenu();
        jMenu.getItem(0).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Back option
            }
        });
        jMenu.getItem(1).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Save Game option
            }
        });
        jMenu.getItem(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //option 3
            }
        });
        jMenu.getItem(3).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //option 4
            }
        });
        jMenu.getItem(4).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Will display a panel of Upgrades & Buffs

            }
        });
        jMenuBar.add(jMenu);
        gui.add(jMenuBar);
    }

    public void upgradesAndBuffs() {

    }

}
