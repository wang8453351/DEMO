package GUI;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JTextFieldTest extends JFrame{

    public static void main(String[] args){
        new JTextFieldTest();
    }
    public JTextFieldTest(){
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();
        JPanel panel = new JPanel();
        final JTextField jt = new JTextField(20);
        jt.setFont(new Font(null,Font.PLAIN,20));
        panel.add(jt);
        //        jt.setLocation(100,100);
        final JButton jb = new JButton("Clear");
        jb.setFont(new Font(null,Font.PLAIN,20));
        //        jb.setBorderPainted(true);
        //        jb.setBounds(200, 200, 20, 11);
        //        jt.addActionListener(new ActionListener() {
        //
        //            @Override
        //            public void actionPerformed(ActionEvent e) {
        //                // TODO Auto-generated method stub
        //                jt.setText("Key Touch");
        //            }
        //        });
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                jt.setText("wangping");
                //                jt.requestFocus();//return textfield point
                System.out.println("Click : wangping");
            }
        });


        panel.add(jb);
        jf.add(panel);
        jf.setTitle("This is JFrame");
        jf.setBounds(200, 200, 500, 500);
        //        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setResizable(false);
        //        jf.setContentPane(panel);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
