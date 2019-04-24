/**
 * @author demo
 * For setJMenuBar, you can not use extends JFrame, because it can not generate Menu in Container
 */

package SwingTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuItem extends JFrame {

    static JFrame f;
    public static JMenuBar menuBar;
    static JMenu x;
    static JMenuItem m1,m2,m3;

//    public MenuItem(JMenuBar menuBar) {
//        super();
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.setBounds(100, 100, 500, 500);
//        this.setTitle("Menu Demo");
//
//
////        JMenuBar menuBar = new JMenuBar();
//        JMenu menu = new JMenu();
//        JMenuItem menuItem = new JMenuItem("MenuName");
//        menuItem.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // TODO Auto-generated method stub
//                JMenuItem menuItem1 = (JMenuItem)e.getSource();
//                System.out.println("Clicked MenuItem : "+menuItem1.getText());
//            }
//        });
//
//        menu.add(menuItem);
//        menuBar.add(menu);
//
////        this.setJMenuBar(mb);
//    }

    public static void main(String[] args) {
//        JMenuBar mb = new JMenuBar();
//        MenuItem frame = new MenuItem(mb);
//        frame.setJMenuBar(mb);
//        frame.setVisible(true);
        f = new JFrame("Menu Demo");
        menuBar = new JMenuBar();
        x = new JMenu("Menu");
        JMenu x1 = new JMenu("Menusub");

        m1 = new JMenuItem("MenuItem1");
        m2 = new JMenuItem("MenuItem2");
        m3 = new JMenuItem("MenuItem3");

        m1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JMenuItem menuItem1 = (JMenuItem)e.getSource();
                System.out.println("Clicked Item : "+menuItem1.getText());
            }
        });
        m2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JMenuItem menuItem1 = (JMenuItem)e.getSource();
                System.out.println("Clicked Item : "+menuItem1.getText());
            }
        });
        m3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JMenuItem menuItem1 = (JMenuItem)e.getSource();
                System.out.println("Clicked Item : "+menuItem1.getText());
            }
        });


        x1.add(m1);
        x1.add(m2);
        x1.add(m3);
        x.add(x1);
        menuBar.add(x);

        f.setJMenuBar(menuBar);

        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}
