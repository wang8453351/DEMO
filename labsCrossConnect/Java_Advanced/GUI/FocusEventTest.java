package GUI;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FocusEventTest extends JFrame{
    public FocusEventTest(){
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        JTextField jt1 = new JTextField("CLick others",10);
        JTextField jt2 = new JTextField("Click me",10);
        jp.add(jt1);
        jp.add(jt2);
        jt1.addFocusListener(new FocusListener() {

            @Override
            public void focusLost(FocusEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(null, "Lose focus");
            }

            @Override
            public void focusGained(FocusEvent e) {
                // TODO Auto-generated method stub

            }
        });
        jf.add(jp);
        jf.setTitle("This is JFrame");
        jf.setBounds(200, 200, 500, 500);
        //        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new FocusEventTest();
    }

}
