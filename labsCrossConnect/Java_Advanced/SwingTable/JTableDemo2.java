package SwingTable;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class JTableDemo2 extends JFrame {

    public JTableDemo2() {
        super();
        this.setTitle("Create Unresizable table");
        this.setBounds(100,100,240,150);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Vector<String> columnNameV = new Vector<>();
        columnNameV.add("A");
        columnNameV.add("B");

        Vector<Vector<String>> tableValueV = new Vector<>();
        for(int row=0;row<6;row++) {
            Vector<String> rowV = new Vector<>();
            rowV.add("A"+row);
            rowV.add("B"+row);
            tableValueV.add(rowV);

        }

        JTable table = new JTable(tableValueV,columnNameV);
        table.setSelectionMode(2);
        this.getContentPane().add(table,BorderLayout.CENTER);//put table into container instead of scrollpane
        JTableHeader tableHeader = table.getTableHeader();
//        this.getContentPane().add(tableHeader,BorderLayout.NORTH);
        this.getContentPane().add(tableHeader,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JTableDemo2 frame = new JTableDemo2();
        frame.setResizable(false);
        frame.setVisible(true);
    }


}
