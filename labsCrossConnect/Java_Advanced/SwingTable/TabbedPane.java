package SwingTable;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPane extends JFrame {

    public TabbedPane() {
        super();
        this.setTitle("TabbedPane");
        this.setBounds(100, 100, 500, 375);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        tabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {
                // TODO Auto-generated method stub
                int selectedIndex = tabbedPane.getSelectedIndex();
                String title = tabbedPane.getTitleAt(selectedIndex);
                System.out.println(title);
            }
        });

        this.getContentPane().add(tabbedPane,BorderLayout.CENTER);
        String a = TabbedPane.class.getName();
        URL resource = TabbedPane.class.getResource("./ADV.png");
        ImageIcon imageIcon = new ImageIcon(resource);

        final JLabel tabLabelA = new JLabel("OptionA");
        tabbedPane.addTab("OptionA",imageIcon,tabLabelA,"Click to check OptionA" );
        final JLabel tabLabelB = new JLabel("OptionB");
        tabbedPane.addTab("OptionB",imageIcon,tabLabelB,"Click to check OptionB");
        final JLabel tabLabelC = new JLabel("OptionC");
        tabbedPane.addTab("OptionC", imageIcon,tabLabelC,"Click to check OptionC");

        tabbedPane.setSelectedIndex(2);
        tabbedPane.setEnabledAt(0,false);
    }

    public static void main (String[] args) {
        TabbedPane frame = new TabbedPane();
        frame.setVisible(true);
    }

}
