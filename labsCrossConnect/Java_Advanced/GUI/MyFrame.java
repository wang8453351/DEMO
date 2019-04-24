package GUI;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

class MyDialog extends JDialog {

    public MyDialog (MyFrame frame){
        super(frame,"First Dialog window",true);
        Container container = getContentPane();
        container.add(new JLabel("This is Dialog!"));
        setBounds(300,300,200,200);

    }

}
public class MyFrame extends JFrame{
    public static void main(String args[]){
        MyFrame  myJFrame = new MyFrame();
        JOptionPane.showMessageDialog(null, "INFO: Continue?");//zu se
        System.out.println("I will continue !");
    }
    public MyFrame(){
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();
        container.setLayout(null);
        JLabel jl = new JLabel("This is JFrame!!!");
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jl);
        JButton bl = new JButton("Open dialog@wp");
        bl.setBounds(10,10,300,21);
        bl.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new MyDialog(MyFrame.this).setVisible(true);

            }
        });
        container.add(bl);
        //        container.setBackground(Color.white);
        jf.setTitle("This is JFrame");
        jf.setBounds(200, 200, 500, 500);
        //        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
