/**
 *
 */
package SwingTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 * @author demo
 *
 */
public class JTableDemo3 extends JFrame{

    public JTableDemo3() {
        super();
        this.setTitle("Define Table");
        this.setBounds(100,100,500,375);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] columnNames = {"A","B","C","D","E","F","G"};
        Vector<String> columnNameV = new Vector<>();
        for(int column=0;column<columnNames.length;column++) {
            columnNameV.add(columnNames[column]);
        }
        Vector<Vector<String>> tableValueV = new Vector<>();
        for(int row = 0;row<21;row++) {
            Vector<String> rowV = new Vector<>();
            for(int column=0;column<columnNames.length;column++) {
                rowV.add(columnNames[column]+row);
            }
            tableValueV.add(rowV);
        }


        JTable jtb = new MTtable(tableValueV,columnNameV);//JTable jtb = new JTable(tableValueV,columnNameV);
        jtb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jtb.setSelectionBackground(Color.YELLOW);
        jtb.setSelectionForeground(Color.RED);
        jtb.setRowHeight(30);

        final JScrollPane jsp = new JScrollPane(jtb);
        this.getContentPane().add(jsp,BorderLayout.CENTER);
//        jsp.setViewportView(jtb);
//        jsp.add(jtb);


    }

    private class MTtable extends JTable{
        public MTtable(Vector<Vector<String>> rowdata,Vector<String> columnNames) {
            super(rowdata,columnNames);
        }

        @Override
        public JTableHeader getTableHeader() {

            JTableHeader tableHeader = super.getTableHeader();
            tableHeader.setReorderingAllowed(false);
            DefaultTableCellRenderer hr = (DefaultTableCellRenderer)tableHeader.getDefaultRenderer();
            hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            return tableHeader;
        }

        @Override
        public TableCellRenderer getDefaultRenderer(Class<?> columnClass) {
            DefaultTableCellRenderer cr = (DefaultTableCellRenderer)super.getDefaultRenderer(columnClass);
            cr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
            return cr;
        }

        @Override
        public boolean isCellEditable(int row,int column) {
            return false;
        }

    }





    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JTableDemo3 frame = new JTableDemo3();
        frame.setVisible(true);
    }

}
