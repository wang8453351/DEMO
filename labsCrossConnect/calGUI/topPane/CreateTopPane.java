package topPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JMenuBar;
import javax.swing.JPanel;

import common.IPaneSet;
import manuBar.JMenuFile;
import manuBar.JMenuHelp;
import manuBar.JMenuWindow;

public class CreateTopPane implements IPaneSet {

    public JPanel mTopPane;
    public CreateTopPane(Container pane) {

        mTopPane = new JPanel();
        setPaneLayout();
        addTopPane();
        pane.add(mTopPane,BorderLayout.PAGE_START);
    }



    private void addTopPane() {

        JMenuBar mJMenuBar = new JMenuBar();
        JMenuFile mJMenuFile = new JMenuFile(mJMenuBar);
        JMenuWindow mJMenuWindow = new JMenuWindow(mJMenuBar);
        JMenuHelp mJMenuHelp = new JMenuHelp(mJMenuBar);
        mTopPane.add(mJMenuBar);


    }

    @Override
    public void setPaneLayout() {
        // TODO Auto-generated method stub
        mTopPane.setLayout(new FlowLayout(FlowLayout.LEFT));

    }
}
