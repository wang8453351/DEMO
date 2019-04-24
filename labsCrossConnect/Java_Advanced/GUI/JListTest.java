package GUI;

import java.awt.Container;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class JListTest extends JFrame {
    public static void main(String args[]){
        new JListTest();
    }
    class MyListModel extends AbstractListModel<String> {
        private String[] contents={"List1","List2","List3","List4","List5","List6","List7"};
        @Override
        public String getElementAt(int x){
            if(x<contents.length){
                return contents[x];
            }
            else{
                return null;
            }

        }
        @Override
        public int getSize(){
            return contents.length;
        }
    }
    public JListTest(){
        JFrame jf = new JFrame();
        Container cp = jf.getContentPane();
        cp.setLayout(null);
        JList<String> jl = new JList<>(new MyListModel());
        JScrollPane jp = new JScrollPane(jl);
        jp.setBounds(10, 10, 100, 100);
        cp.add(jp);
        jf.setTitle("This is JFrame");
        jf.setBounds(200, 200, 500, 500);
        //        jf.setSize(500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }



}
