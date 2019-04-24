package manuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import common.IJMenuBar;

public class JMenuHelp implements IJMenuBar {

    JMenu   mHelpJMenu;
    JMenuBar mJMenuBar;

    public JMenuHelp(JMenuBar mJMenuBar) {
        this.mJMenuBar = mJMenuBar;
        this.addJMenuItemToJMenu();
        this.addJMenuToJMenuBar();

    }

    @Override
    public void addJMenuToJMenuBar() {
        // TODO Auto-generated method stub
        mHelpJMenu.setMnemonic('H');
        mJMenuBar.add(mHelpJMenu);

    }
    @Override
    public void addJMenuItemToJMenu() {
        // TODO Auto-generated method stub
        mHelpJMenu = new JMenu("Help(H)");
        JMenuItem mJMenuItem1 = new JMenuItem("about Tool");
        addHelpActionListener(mJMenuItem1);
//        mJMenuItem1.addActionListener(new HelpActionListener());
        mHelpJMenu.add(mJMenuItem1);
    }
    public void addHelpActionListener(JMenuItem mTool) {
        mTool.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                        System.out.println("Debug............");
                        String message = "Name: AUTO CAL Tool\n"+"Author: KrisWang\n"+"Copyright: ADVANTEST\n"+"Email: ping.wang@advantest.com\n";
                      JOptionPane.showMessageDialog(null,message,"about Tool",JOptionPane.PLAIN_MESSAGE);



            }
        });
    }
    class HelpActionListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "Name: AUTO CAL Tool\n"+"Author: KrisWang\n"+"Copyright: ADVANTEST\n"+"Email: ping.wang@advantest.com\n";
            JOptionPane.showMessageDialog(null,message,"about Tool",JOptionPane.PLAIN_MESSAGE);

        }
    }




}
