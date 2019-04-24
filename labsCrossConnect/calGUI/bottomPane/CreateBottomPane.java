package bottomPane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JPanel;

import common.IPaneSet;
import flowLayout.BoardLayoutDemo;
import middlePane.CalConditionPane;

public class CreateBottomPane implements IPaneSet {

    public JPanel mBottomPane;

    public CreateBottomPane(Container pane) {
        mBottomPane = new JPanel();
        addBottomPane();
        pane.add(mBottomPane,BorderLayout.SOUTH);
    }

    private void addBottomPane() {
        JButton mButton1 = new JButton("Update");
        JButton mButton2 = new JButton("Close");
        mBottomPane.add(mButton1);
        mButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                final Map<String,String> condition= CalConditionPane.getInstance().updateListMap();

                new Thread(new Runnable() {

                    @Override
                    public void run() {
                        // TODO Auto-generated method stub
                        BoardLayoutDemo.condition =  CalConditionPane.getInstance().updateListMap();
                    }
                }).start();
            }
        });
//        mBottomPane.add(mButton2);
        mButton2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

//                 System.exit(0);




            }
        });
    }
    @Override
    public void setPaneLayout() {
        // TODO Auto-generated method stub

    }

}
