package GUI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame{

    class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{

        String selectedItem = null;
        String[] test ={"ID1","ID2","ID3","ID4"};
        @Override
        public int getSize() {
            // TODO Auto-generated method stub
            return test.length;
        }

        @Override
        public String getElementAt(int index) {
            // TODO Auto-generated method stub
            return test[index];
        }

        @Override
        public void setSelectedItem(Object Item) {
            // TODO Auto-generated method stub
            selectedItem = (String) Item;
        }

        @Override
        public Object getSelectedItem() {
            // TODO Auto-generated method stub
            return selectedItem;
        }

    }
    JComboBox<String> jc = new JComboBox<>(new MyComboBox());
    JLabel jl = new JLabel("pls select ID");
    public JComboBoxTest(){
        JFrame jf = new JFrame();
        Container container = jf.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jl);
        container.add(jc);
        jf.setTitle("This is JFrame");
        jf.setBounds(200,200,500,500);
        jf.setVisible(true);
        jf.setResizable(false);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new JComboBoxTest();
    }



}
