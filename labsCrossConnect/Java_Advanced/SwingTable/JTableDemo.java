/**
 *
 */
package SwingTable;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author demo
 *@see
 ************A        B**************
 ************A1       B1*************
 ************A2       B2*************
 ************A3       B3*************
 */
public class JTableDemo extends JFrame {

public JTableDemo() {
    super();
    this.setTitle("Create Scroll Table");
    this.setBounds(100,100,240,150);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    String[] columnNames = {"A","B"};//define column name
    String[][] tableValues = {{"A1","B1"},{"A2","B2"},{"A3","B3"},{"A4","B4"},{"A5","B5"}};//define table data

    JTable table = new JTable(tableValues,columnNames);
    JScrollPane scrollPane = new JScrollPane(table);
    this.getContentPane().add(scrollPane,BorderLayout.CENTER);



}
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JTableDemo jtd = new JTableDemo();
        jtd.setVisible(true);
//        jtd.setResizable(false);
    }



}
