package GUI;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPaneDemo extends JFrame {

    public JScrollPaneDemo(){
        Container container = getContentPane();

        JTextArea ta = new JTextArea(20,20);
        JScrollPane sp = new JScrollPane(ta);
//        ta.setLineWrap(true);
        container.add(sp);
        //        container.add(sp);

        setTitle("JScrollPane_JTextArea");
        setSize(300,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new JScrollPaneDemo();
    }
}
