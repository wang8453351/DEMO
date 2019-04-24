package manuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import common.IJMenuBar;

public class JMenuWindow implements IJMenuBar {

    JMenu   mWindowJMenu;
    JMenuBar mJMenuBar;

    public JMenuWindow(JMenuBar mJMenuBar) {
        this.mJMenuBar = mJMenuBar;
        this.addJMenuItemToJMenu();
        this.addJMenuToJMenuBar();

    }

    @Override
    public void addJMenuToJMenuBar() {
        // TODO Auto-generated method stub
        mWindowJMenu.setMnemonic('W');
        mJMenuBar.add(mWindowJMenu);

    }
    @Override
    public void addJMenuItemToJMenu() {
        // TODO Auto-generated method stub
        mWindowJMenu = new JMenu("Window(W)");
        JMenuItem mJMenuItem1 = new JMenuItem("reset perspective");
        JMenuItem mJMenuItem2 = new JMenuItem("exit");
        addExitActionListener(mJMenuItem2);
        mWindowJMenu.add(mJMenuItem1);
        mWindowJMenu.add(mJMenuItem2);
    }

    public void addExitActionListener(JMenuItem mExit) {
        mExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                System.exit(0);
            }
        });
    }




}
