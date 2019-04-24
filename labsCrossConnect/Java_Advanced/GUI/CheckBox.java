package GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class CheckBox extends JFrame {
    public CheckBox(){
        JFrame jf = new JFrame();
        Container c = jf.getContentPane();

        JPanel panel1 = new JPanel();
        final JTextArea jt = new JTextArea(10,30);
        c.setLayout(new BorderLayout());
        final JScrollPane scrollPane = new JScrollPane(jt);
        panel1.add(scrollPane);
        c.add(panel1,BorderLayout.NORTH);

        JPanel panel2 = new JPanel();
        JCheckBox jc1 = new JCheckBox("wp");
        panel2.add(jc1);
        c.add(panel2,BorderLayout.SOUTH);
        jc1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //                jt.append("OK");
                jt.append("check Box 1 is selected!\n");
            }
        });
        jf.setTitle("This is JFrame");
        jf.setBounds(200, 200, 500, 500);
        //        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new CheckBox();
    }
}
