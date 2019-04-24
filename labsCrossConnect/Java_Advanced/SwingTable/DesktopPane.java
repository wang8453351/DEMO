package SwingTable;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DesktopPane extends JFrame {

    public DesktopPane() {
        super();
        this.setTitle("Desktop Pane");
        this.setBounds(100,100,500,375);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        final JDesktopPane desktopPane = new JDesktopPane();
        this.getContentPane().add(desktopPane,BorderLayout.CENTER);
        final JLabel backlabel = new JLabel();
        URL resource = DesktopPane.class.getResource("./ADV.png");
        ImageIcon icon = new ImageIcon(resource);
        backlabel.setIcon(icon);
        backlabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        desktopPane.add(backlabel,new Integer(Integer.MIN_VALUE));
    }

    public static void main(String args[]) {
        DesktopPane frame = new DesktopPane();
        frame.setVisible(true);
    }

}
