package hu.heroes.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI {

    JFrame window;
    public JTextArea messageText;
    public JPanel bgPanel[] = new JPanel[50];
    public JLabel bgLabel[] = new JLabel[50];

    //Player UI
    JPanel playerPanel;
    JPanel thunderPanel;
    JPanel fireballPanel;
    JPanel revivePanel;
    JPanel frozePanel;
    JPanel arcanePanel;

    JLabel playerLabel;
    JPanel inventoryPanel;
    public JLabel thunderLabel, fireballLabel, reviveLabel, frozeLabel, arcaneLabel;


    public UI() {
        createMainField();
        createPlayer();
        createScreen();

        window.setVisible(true);
    }

    public void createMainField() {
        //window
        window = new JFrame();
        window.setSize(1200, 800);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);

        messageText = new JTextArea("Text");
        messageText.setBounds(50, 660, 1090, 80);
        messageText.setBackground(Color.blue);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua", Font.PLAIN, 23));
        window.add(messageText);
    }

    public void createBackGround(int bgNum, String bgFile) {
        //palya generalas
        bgPanel[bgNum] = new JPanel();
        bgPanel[bgNum].setBounds(100, 30, 990, 600);
        bgPanel[bgNum].setBackground(Color.CYAN);
        bgPanel[bgNum].setLayout(null);
        window.add(bgPanel[0]);


        bgLabel[bgNum] = new JLabel();
        bgLabel[bgNum].setBounds(0, 0, 990, 600);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFile));
        bgLabel[bgNum].setIcon(bgIcon);
    }

    public void createPlayer() {
        //player generalas
        playerPanel = new JPanel();
        playerPanel.setBounds(13, 300, 75, 100);
        playerPanel.setBackground(Color.GRAY);
        window.add(playerPanel);


        //player magic generalasa
        thunderPanel = new JPanel();
        thunderPanel.setBounds(30, 30, 40, 40);
        thunderPanel.setBackground(Color.yellow);
        window.add(thunderPanel);

        fireballPanel = new JPanel();
        fireballPanel.setBounds(30, 80, 40, 40);
        fireballPanel.setBackground(Color.red);
        window.add(fireballPanel);

        revivePanel = new JPanel();
        revivePanel.setBounds(30, 130, 40, 40);
        revivePanel.setBackground(Color.white);
        window.add(revivePanel);

        frozePanel = new JPanel();
        frozePanel.setBounds(30, 180, 40, 40);
        frozePanel.setBackground(Color.blue);
        window.add(frozePanel);

        arcanePanel = new JPanel();
        arcanePanel.setBounds(30, 230, 40, 40);
        arcanePanel.setBackground(Color.MAGENTA);
        window.add(arcanePanel);
    }

    public void createObject(int bgNum, int x, int y, int w, int h, String file, String choice1, String choice2, String choice3) {
        //Popup menu
        JPopupMenu popupMenu = new JPopupMenu();

        JMenuItem menuItem[] = new JMenuItem[3];
        menuItem[0] = new JMenuItem(choice1);
        popupMenu.add(menuItem[0]);
        menuItem[1] = new JMenuItem(choice2);
        popupMenu.add(menuItem[1]);
        menuItem[2] = new JMenuItem(choice3);
        popupMenu.add(menuItem[2]);

        //egyseg generalas
        JLabel objLabel = new JLabel();
        objLabel.setBounds(x, y, w, h);

        ImageIcon objIcon = new ImageIcon(getClass().getClassLoader().getResource(file));
        objLabel.setIcon(objIcon);

        objLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) ;
                popupMenu.show(objLabel, e.getX(), e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        bgPanel[bgNum].add(objLabel);
        bgPanel[bgNum].add(bgLabel[bgNum]);


    }

    public void createScreen() {
        //Screen
        createBackGround(0, "background.png");
        createObject(0, 86, 4, 76, 54, "archer.png", "Move", "Wait", "Attack");
        createObject(0, 4, 4, 76, 54, "archer.png", "Move", "Wait", "Attack");
        createObject(0, 4, 64, 76, 54, "archer.png", "Move", "Wait", "Attack");

    }

    public static void main(String[] args) {
        UI ui = new UI();
    }
}
