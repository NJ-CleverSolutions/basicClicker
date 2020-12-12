import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//#4D1B58 dark dark purple
//#607A51 olive green
//#FF6100 orange
//#6C5137 brown

public class Main {

    //JFrame
    public static Gui screen;
    public static JFrame gui;

    //JButton
    public Gui button;

    //JPanel
    public Gui panel;

    //JLabel
    public Gui label;

    //JTextField
    public Gui field;

    //JMenuBar
    public Gui menuBar;

    //JMenu
    public Gui menu;

    //FileLoader and FileWriter class objects
    public FileLoader loader;
    public FileWriter saver;

    //User class object
    public User user;

    //Game class object
    public Game game;

    //Main method start
    public static Main main = new Main();

    //Game Setup Array Counter
    public int nameCurrent = 0;

    public Main() {

        //JFrame
        screen = new Gui();
        panel = new Gui();
        label = new Gui();
        field = new Gui();
        button = new Gui();
        menuBar = new Gui();
        menu = new Gui();

        user = new User("Guest");

        game = new Game();

        loader = new FileLoader();
        saver = new FileWriter();
    }

    public static void main(String[] args){
        gui = screen.createJFrame();
        main.tittyScreen();
    }

    public void tittyScreen() {

        JButton start = button.createJButton("Start", 50);
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

        JButton play = button.createJButton("Play", 30);
        play.setSize(820,100);
        play.setLocation(-10,100);
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

        JButton settings = button.createJButton("Settings", 30);
        settings.setSize(820,100);
        settings.setLocation(-10,200);
        gui.add(settings);

        settings.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                settings();
            }
        });

        JButton credits = button.createJButton("Credits", 30);
        credits.setSize(820,100);
        credits.setLocation(-10,300);
        gui.add(credits);

        credits.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                credits();
            }
        });

        JButton back = button.createJButton("<", 20);
        back.setSize(50,50);
        back.setLocation(0,0);
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

        JPanel name = panel.createJPanel();
        name.setSize(800,50);
        name.setLocation(0,0);

        JLabel nameLabel = label.createJLabel("Select Your Agent", 30);
        nameLabel.setSize(820,50);
        nameLabel.setLocation(-10,0);
        name.add(nameLabel);
        gui.add(name);

        JLabel agentName = label.createJLabel("Agent Name: " + agents[nameCurrent], 20);
        agentName.setSize(800, 50);
        agentName.setLocation(0,100);
        gui.add(agentName);

        JLabel agentCompany = label.createJLabel("Agent Company: " + agentsCompany[nameCurrent],20);
        agentCompany.setSize(800, 50);
        agentCompany.setLocation(0,200);
        gui.add(agentCompany);

        JButton left = button.createJButton("<", 20);
        left.setSize(50,600);
        left.setLocation(0,50);
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

        JButton right = button.createJButton(">", 20);
        right.setSize(50,600);
        right.setLocation(737,50);
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

        JButton submit = button.createJButton("Submit", 30);
        submit.setSize(820,100);
        submit.setLocation(-10,650);
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

        JButton game = button.createJButton("Game Settings", 20);
        game.setSize(820,100);
        game.setLocation(-10,100);
        gui.add(game);

        game.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                gameSettings();
            }
        });

        JButton user = button.createJButton("User Settings", 20);
        user.setSize(820,100);
        user.setLocation(-10,200);
        gui.add(user);

        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gui.getContentPane().removeAll();
                gui.repaint();
                userSettings();
            }
        });

        JButton back = button.createJButton("<", 20);
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

        JLabel credits = label.createJLabel("Sleepy Lizard Studios", 30);
        credits.setSize(820,50);
        credits.setLocation(-10,100);
        gui.add(credits);

        JButton back = button.createJButton("<", 20);
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

        JButton back = button.createJButton("<", 20);
        back.setSize(50,50);
        back.setLocation(0,0);
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

        JButton back = button.createJButton("<", 20);
        back.setSize(50,50);
        back.setLocation(0,0);
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

        JLabel totalLbl = label.createJLabel("Net Worth", 30);
        totalLbl.setSize(800,30);
        totalLbl.setLocation(0,0);

        JTextField netWorth = field.createJTextField("$ " + game.getNetWorth());
        netWorth.setSize(800,30);
        netWorth.setLocation(0, 30);
        gui.add(netWorth);

        JButton main = button.createJButton("Click Me Linus", 30);
        main.setSize(820,100);
        main.setLocation(-10,550);
        gui.add(main);

        main.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                game.setNetWorth(game.getIncrementClick());
                netWorth.setText("$ " + game.getNetWorth());
                netWorth.repaint();
                gui.repaint();
            }
        });

//        JMenuBar jMenuBar = menuBar.createJMenuBar();
//        JMenu jMenu = menu.createJMenu();
//
//        jMenu.getItem(0).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Back option
//            }
//        });
//
//        jMenu.getItem(1).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Save Game option
//            }
//        });
//
//        jMenu.getItem(2).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //option 3
//            }
//        });
//
//        jMenu.getItem(3).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //option 4
//            }
//        });
//
//        jMenu.getItem(4).addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //Will display a panel of Upgrades & Buffs
//
//            }
//        });
//
//        jMenuBar.add(jMenu);
//
//        gui.add(jMenuBar);
    }

    public void upgradesAndBuffs() {

    }

}
