package GUI;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JButtonTest extends JFrame {

    public JButtonTest(){
        JFrame jf = new JFrame();
        Icon icon = new ImageIcon("../labsCrossConnect/image/Icon.png");
        jf.setLayout(new GridLayout(3,2,5,5));
        Container c = jf.getContentPane();
        for(int i =0;i<5;i++)
        {
            JButton J = new JButton("button"+i,icon);
            c.add(J);
            if(i%2 == 0) {
                J.setEnabled(false);
            }
        }
        JButton jb = new JButton();
        jb.setMaximumSize(new Dimension(90,30));
        jb.setIcon(icon);
        jb.setHideActionText(true);
        jb.setToolTipText("PicButton");
        jb.setBorderPainted(false);
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, "Open Dialog");
            }
        });
        c.add(jb);
        jf.setTitle("JButtonTest");
        jf.setBounds(200,200,500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        new JButtonTest();
    }

}
