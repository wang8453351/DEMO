package SwingTable;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InternalWindow extends JFrame {

    JDesktopPane  desktopPane = null;
    InternalFrame pInFrame = null;
    InternalFrame rInFrame = null;
    InternalFrame tInFrame = null;

    public static void main(String args[]) {
        InternalWindow frame = new InternalWindow();
        frame.setVisible(true);
    }

    public InternalWindow() {
        super();
        this.setTitle("ADVANTEST");
        this.setBounds(100,100,570,470);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        desktopPane = new JDesktopPane();
        desktopPane.setDragMode(JDesktopPane.OUTLINE_DRAG_MODE);
        this.getContentPane().add(desktopPane,BorderLayout.CENTER);

        final JLabel backLabel = new JLabel();
        URL resource = InternalWindow.class.getResource("./ADV.png");
        ImageIcon imageIcon = new ImageIcon(resource);
        backLabel.setIcon(imageIcon);
        backLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
        desktopPane.add(backLabel,new Integer(Integer.MIN_VALUE));

//        final JTabbedPane tabbedPane = new JTabbedPane();
//        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        final JPanel jp = new JPanel();
        this.getContentPane().add(jp,BorderLayout.NORTH);
        final JButton tabLabelA = new JButton("OptionA");
//        tabbedPane.addTab("OptionA",imageIcon,tabLabelA,"Click to check OptionA" );
        final JButton tabLabelB = new JButton("OptionB");
//        tabbedPane.addTab("OptionB",imageIcon,tabLabelB,"Click to check OptionB");
        final JButton tabLabelC = new JButton("OptionC");
//        tabbedPane.addTab("OptionC", imageIcon,tabLabelC,"Click to check OptionC");
        jp.add(tabLabelA);
        jp.add(tabLabelB);
        jp.add(tabLabelC);

//        tabbedPane.setSelectedIndex(2);
//        tabbedPane.setEnabledAt(0,false);

        tabLabelA.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                BAListener BAL_A = new BAListener(pInFrame, "OptionA");
                BAL_A.actionPerformed(e);
            }
        });
        tabLabelB.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                BAListener BAL_B = new BAListener(rInFrame, "OptionB");
                BAL_B.actionPerformed(e);
            }
        });
        tabLabelC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                BAListener BAL_C = new BAListener(tInFrame, "OptionC");
                BAL_C.actionPerformed(e);
            }
        });
    }

    private class BAListener implements ActionListener{
        InternalFrame inFrame;
        String title;
        public BAListener(InternalFrame inFrame,String title) {
            this.inFrame = inFrame;
            this.title = title;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            if(inFrame == null || inFrame.isClosed()) {
                JInternalFrame[] allFrames = desktopPane.getAllFrames();
                int titleBarHight = 30 * allFrames.length;
                int x = 10 + titleBarHight,y=x;
                int width = 250, height = 180;
                inFrame = new InternalFrame(title);
                inFrame.setBounds(x, y, width, height);
                inFrame.setVisible(true);
                desktopPane.add(inFrame);
            }

            try {
                inFrame.setSelected(true);
            }catch(PropertyVetoException propertyVetoE) {
                propertyVetoE.printStackTrace();
            }
        }
    }


    private class InternalFrame extends JInternalFrame{
        public InternalFrame(String title) {
            super();
            this.setTitle(title);
            this.setResizable(true);
            this.setClosable(true);
            this.setIconifiable(true);
            this.setMaximizable(true);
            URL resource = InternalWindow.class.getResource("./ADV.png");
            ImageIcon icon = new ImageIcon(resource);
            this.setFrameIcon(icon);
        }
    }



}
