package SwingTable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopupMenu extends JFrame{

    static JFrame f;
    static JPopupMenu popup;
    static JMenuItem m1,m2;

    public PopupMenu() {
//        f = new JFrame();
        popup =new JPopupMenu();
        m1 = new JMenuItem("Copy");
        m2 = new JMenuItem("Paste");
        popup.add(m1);popup.add(m2);
        m1.setHorizontalAlignment(JMenuItem.RIGHT);
        m2.setHorizontalAlignment(JMenuItem.RIGHT);

        class MousePopupListener extends MouseAdapter{
            @Override
            public void mouseClicked(MouseEvent e) {
                checkPopup(e);
            }
            @Override
            public void mousePressed(MouseEvent e) {
                checkPopup(e);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                checkPopup(e);
            }
            public void checkPopup(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    popup.show(PopupMenu.this,e.getX(),e.getY());
                }
            }
        }

        this.getContentPane().addMouseListener(new MousePopupListener());
    }




    public static void main(String[] args) {
        PopupMenu frame = new PopupMenu();
        frame.setTitle("Popup Demo");
      frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//      frame.setContentPane(new PopupMenu());
      frame.setSize(300,300);
      frame.setVisible(true);

    }
}
//public class PopupMenu extends JPanel {
//
//    public JPopupMenu popup;
//
//    public PopupMenu() {
//
//        popup = new JPopupMenu();
//        JMenuItem m1 = new JMenuItem("COPY");
//        JMenuItem m2 = new JMenuItem("PASTE");
//        popup.add(m1);
//        popup.add(m2);
//        m1.setHorizontalAlignment(JMenuItem.RIGHT);
//        m2.setHorizontalAlignment(JMenuItem.RIGHT);
////        popup.addSeparator();//Debug!
//
//        popup.setLabel("Justification");
//        popup.setBorder(new BevelBorder(BevelBorder.RAISED));
//        popup.addPopupMenuListener(new PopupMenuListener() {
//
//            @Override
//            public void popupMenuWillBecomeVisible(PopupMenuEvent e) {
//                // TODO Auto-generated method stub
//                System.out.println("Popup menu will be visible!");
//            }
//
//            @Override
//            public void popupMenuWillBecomeInvisible(PopupMenuEvent e) {
//                // TODO Auto-generated method stub
//                System.out.println("Popup menu will be invisible!");
//            }
//
//            @Override
//            public void popupMenuCanceled(PopupMenuEvent e) {
//                // TODO Auto-generated method stub
//                System.out.println("Popup menu will be hidden!");
//            }
//        });
//
//        class MousePopupListener extends MouseAdapter{
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                checkPopup(e);
//            }
//
//
//            @Override
//            public void mousePressed(MouseEvent e) {
//                checkPopup(e);
//            }
//
//
//            @Override
//            public void mouseReleased(MouseEvent e) {
//                checkPopup(e);
//            }
//            public void checkPopup(MouseEvent e) {
//                if(e.isPopupTrigger()) {
//                    popup.show(PopupMenu.this,e.getX(),e.getY());
//                }
//            }
//        }
//
//        addMouseListener(new MousePopupListener());
//
//
//
//    }
//
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("PopupMenu");
//        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//        frame.setContentPane(new PopupMenu());
//        frame.setSize(300,300);
//        frame.setVisible(true);
//    }
//}
