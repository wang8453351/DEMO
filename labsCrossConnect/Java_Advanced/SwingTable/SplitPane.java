package SwingTable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class SplitPane extends JFrame{

    public SplitPane() {
        super();
        this.setTitle("Divide Pane");
        this.setBounds(100,100,500,375);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JSplitPane hSplitPane = new JSplitPane();
        hSplitPane.setOrientation(1);
        hSplitPane.setDividerLocation(40);
        hSplitPane.setDividerSize(5);
        this.getContentPane().add(hSplitPane,BorderLayout.CENTER);

        hSplitPane.setLeftComponent(new JLabel("     1"));

        final JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        vSplitPane.setDividerLocation(30);
        vSplitPane.setDividerSize(8);
        vSplitPane.setOneTouchExpandable(true);//Add UI parts
        vSplitPane.setContinuousLayout(true);
        hSplitPane.setRightComponent(vSplitPane);
        vSplitPane.setLeftComponent(new JLabel("     2"));
        vSplitPane.setRightComponent(new JLabel("     3"));

    }



    public static void main(String[] args) {
        SplitPane frame = new SplitPane();
        frame.setVisible(true);
    }
}
