package GUI;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Register extends JFrame{

    // flow / grid / border(choose)
    JLabel bq1; // North
    JButton an1,an2,an3; JPanel mb1;//South
    JTabbedPane xxk; //Center
    JPanel mb2,mb3,mb4;
    JLabel bq2,bq3,bq4,bq5;
    JTextField wbk;
    JPasswordField mmk;
    JButton an4;
    JCheckBox fxk1,fxk2;

    public static void  main(String args[]) {
        Register register= new Register();

    }

    public Register ()
    {
        //North Area:
        bq1 = new JLabel(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        this.add(bq1,BorderLayout.NORTH);



        //Center Area:
        xxk = new JTabbedPane();
        mb2 = new JPanel();
        mb3 = new JPanel();   mb3.setBackground(Color.DARK_GRAY);
        mb4 = new JPanel();   mb4.setBackground(Color.PINK);
        //setting in mb2:
        //first line
        mb2 = new JPanel();
        mb2.setLayout(new GridLayout(3,3));
        bq2 = new JLabel("Account   :",JLabel.CENTER);
        wbk= new JTextField();
        an4 = new JButton(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        //second line
        bq3 = new JLabel("PassWord :",JLabel.CENTER);
        mmk = new JPasswordField();
        bq4 = new JLabel("Forget",JLabel.CENTER);
        //        bq4.setFront(new Font());
        bq4.setForeground(Color.BLUE);
        //third line
        fxk1 =new JCheckBox("Log In");
        fxk2 = new JCheckBox("Remember");
        bq5 = new JLabel("<html><a href='www.qq.com'>Protect</a>");
        bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        mb2.add(bq2);       mb2.add(wbk);       mb2.add(an4);
        mb2.add(bq3);       mb2.add(mmk);       mb2.add(bq4);
        mb2.add(fxk1);      mb2.add(fxk2);      mb2.add(bq5);

        xxk.add("WangPing",mb2);  xxk.add("ZhouKai",mb3);  xxk.add("ZhangTianYu",mb4);
        this.add(xxk,BorderLayout.CENTER);


        //South Area:
        mb1 = new JPanel();
        an1 = new JButton(new ImageIcon("../labsCrossConnect/image/Icon.png"));
        an2 = new JButton(new ImageIcon("../labsCrossConnect/image/Icon.png"));
        an3 = new JButton(new ImageIcon("../labsCrossConnect/image/Icon.png"));

        mb1.add(an1);   mb1.add(an2);   mb1.add(an3);
        this.add(mb1,BorderLayout.SOUTH);







        //        ImageIcon ADV = new ImageIcon("../labsCrossConnect/image/1.png");
        //        try {
        //            this.setIconImage(ImageIO.read(new File("../labsCrossConnect/image/1.png")));
        //        } catch (IOException e) {
        //            // TODO Auto-generated catch block
        //            e.printStackTrace();
        //        }
        //        this.setIconImage(new ImageIcon("../labsCrossConnect/image/Icon.png").getImage());
        Image img = Toolkit.getDefaultToolkit().createImage("../labsCrossConnect/image/1.png");
        this.setIconImage(new ImageIcon(img).getImage());
        this.setTitle("ADV");
        this.setSize(340,270);
        this.setLocation(300,280);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }


}
