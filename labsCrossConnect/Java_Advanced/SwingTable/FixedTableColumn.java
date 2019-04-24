package SwingTable;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;




public class FixedTableColumn extends JPanel {

    private Vector<String> columnNameV;
    private Vector<Vector<Object>> tableValueV;
    private int fixedColumn = 1;
    private JTable fixedColumnTable;
    private FixedColumnTableModel fixedColumnTableModel;
    private JTable floatingColumnTable;
    private FloatingColumnTalbeModel floatingColumnTableModel;


    @SuppressWarnings("static-access")
    public FixedTableColumn(Vector<String> columnNameV, Vector<Vector<Object>> tableValueV,int fixedColumn) {
        super();
        setLayout(new BorderLayout());
        this.columnNameV = columnNameV;
        this.tableValueV = tableValueV;
        this.fixedColumn = fixedColumn;

        fixedColumnTableModel = new FixedColumnTableModel();
        fixedColumnTable = new JTable(fixedColumnTableModel);
        ListSelectionModel fixed = fixedColumnTable.getSelectionModel();
        fixed.addListSelectionListener(new MListSelectionListener(true));

        floatingColumnTableModel = new FloatingColumnTalbeModel();
        floatingColumnTable = new JTable(floatingColumnTableModel);
        floatingColumnTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        ListSelectionModel floating = floatingColumnTable.getSelectionModel();
        floating.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        MListSelectionListener listener = new MListSelectionListener(false);
        floating.addListSelectionListener(listener);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setCorner(JScrollPane.UPPER_LEADING_CORNER, fixedColumnTable.getTableHeader());//debug!!!

        JViewport viewPort = new JViewport();
        viewPort.setView(fixedColumnTable);
        viewPort.setPreferredSize(fixedColumnTable.getPreferredSize());

        scrollPane.setRowHeader(viewPort);
        scrollPane.setViewportView(floatingColumnTable);//set fixed viewer
        this.add(scrollPane,BorderLayout.CENTER);


    }

//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        Vector<String> columnNameV = new Vector<>();
//        columnNameV.add("date");
//        for(int i=1;i<21;i++) {
//            columnNameV.add("Good"+i);
//        }
//        Vector<Vector<Object>> tableValueV = new Vector<>();
//        for(int row =1;row<31;row++) {
//            Vector<Object> rowV = new Vector<>();
//            rowV.add(row);
//            for(int col=0;col<20;col++) {
//                rowV.add((int)(Math.random()*1000));
//            }
//            tableValueV.add(rowV);
//        }
//        final FixedTableColumn panel = new FixedTableColumn(columnNameV, tableValueV, 1);
//        new JFrame().getContentPane().add(panel,BorderLayout.CENTER);
//
//    }


    private class FixedColumnTableModel extends AbstractTableModel{

        @Override
        public int getRowCount() {
            // TODO Auto-generated method stub
            return tableValueV.size();
        }
        @Override
        public int getColumnCount() {
            // TODO Auto-generated method stub
            return fixedColumn;
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            // TODO Auto-generated method stub
            return tableValueV.get(rowIndex).get(columnIndex);
        }
        @Override
        public String getColumnName(int columnIndex) {
            return columnNameV.get(columnIndex);
        }
    }

    private class FloatingColumnTalbeModel extends AbstractTableModel{

        @Override
        public int getRowCount() {
            // TODO Auto-generated method stub
            return tableValueV.size();
        }
        @Override
        public int getColumnCount() {
            // TODO Auto-generated method stub
            return columnNameV.size()-fixedColumn;
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            // TODO Auto-generated method stub
            return tableValueV.get(rowIndex).get(columnIndex+fixedColumn);
        }
        @Override
        public String getColumnName(int columnIndex) {
            return columnNameV.get(columnIndex+fixedColumn);
        }

    }

    private class MListSelectionListener implements ListSelectionListener{

         boolean isFixedColumnTable = true;
         public MListSelectionListener(boolean isFixedColumnTable) {

             this.isFixedColumnTable= isFixedColumnTable;
         }
         @Override
        public void valueChanged(ListSelectionEvent e) {

             if(isFixedColumnTable) { //true : then sync.

                 int row = fixedColumnTable.getSelectedRow();
                 floatingColumnTable.setRowSelectionInterval(row, row);
             }else {
                 int row = floatingColumnTable.getSelectedRow();
                 fixedColumnTable.setRowSelectionInterval(row, row);
             }
         }

    }





}
