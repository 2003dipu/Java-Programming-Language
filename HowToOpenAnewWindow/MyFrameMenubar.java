// project name: Java menubar

import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.concurrent.Flow;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrameMenubar extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("file");
    JMenu editMenu = new JMenu("edit");
    JMenu helpMenu = new JMenu("help");

    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenuItem exitItem = new JMenuItem("Exit");

    Image file = new ImageIcon("file.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon loadIcon = new ImageIcon(file);
    Image save = new ImageIcon("save.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon saveIcon = new ImageIcon(save);
    Image exit = new ImageIcon("exit.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
    ImageIcon exitIcon = new ImageIcon(exit);

    MyFrameMenubar() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(new FlowLayout());
        this.setTitle("Project:  File Menu");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        //loadItem.setIcon(loadIcon);
        loadItem.setIcon(saveIcon);
        loadItem.setIcon(exitIcon);


        fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f = file
        editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e = edit
        helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h = help

        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loadItem) {
            System.out.println("You clicked on this to load a file");
        }
        else if (e.getSource() == saveItem) {
            System.out.println("You clicked on this to save a file");
        }
        else if (e.getSource() == exitItem) {
            System.exit(0);
        }
        System.out.println();
    }

}
