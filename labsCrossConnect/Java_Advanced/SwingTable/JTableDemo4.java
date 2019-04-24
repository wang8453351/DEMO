package SwingTable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JTableDemo4 extends JFrame{

    private JTable jtb;
    private DefaultTableModel tableModel;
    private JTextField aTextField;
    private JTextField bTextField;

    public static void main(String[] args) {

        JTableDemo4 frame = new JTableDemo4();
        frame.setVisible(true);
    }

    public JTableDemo4() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 510, 375);
        this.setTitle("maintain Table Model");

        String[] columnNames = {"A","B"};
        Vector<String> colunmNameV = new Vector<>();
        for(int column=0;column<columnNames.length;column++) {
            colunmNameV.add(columnNames[column]);
        }
        Vector<Vector<String>> tableValueV = new Vector<>();
        for(int row=1;row<4;row++) {
            Vector<String> rowValueV = new Vector<>();
            for(int column=0;column<columnNames.length;column++) {
                rowValueV.add(columnNames[column]+row);
            }
            tableValueV.add(rowValueV);
        }

         tableModel = new DefaultTableModel(tableValueV,colunmNameV); //get Cell value
         jtb = new JTable(tableValueV,colunmNameV);
        jtb.setSelectionBackground(Color.YELLOW);
        jtb.setSelectionForeground(Color.RED);
        jtb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jtb.setRowHeight(30);

        final JScrollPane jsp = new JScrollPane(jtb);
        this.getContentPane().add(jsp,BorderLayout.CENTER);

        final JPanel jp = new JPanel();
        this.getContentPane().add(jp,BorderLayout.SOUTH);
        jp.add(new JLabel("A:"));
        aTextField = new JTextField("A1",10);



        jp.add(aTextField);
        jp.add(new JLabel("B:"));
         bTextField = new JTextField("B1",10);
        jp.add(bTextField);

        jtb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = jtb.getSelectedRow();
                Object oa =  tableModel.getValueAt(selectedRow,0);//A column
                Object ob = tableModel.getValueAt(selectedRow, 1);//B column
                aTextField.setText(oa.toString());
                bTextField.setText(ob.toString());

            }

        });
        final JButton jb1 = new JButton("ADD");
        final JButton jb2 = new JButton("MOD");
        final JButton jb3 = new JButton("DEL");
        jp.add(jb1); jp.add(jb2); jp.add(jb3);

        jb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String[] rowValues = {aTextField.getText(),bTextField.getText()};
                tableModel.addRow(rowValues);
                int rowCount = jtb.getRowCount()+1;
                aTextField.setText("A"+rowCount);
                bTextField.setText("B"+rowCount);

            }
        });
        jb2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                String[] rowValues = {aTextField.getText(),bTextField.getText()};
                int selectedRow = jtb.getSelectedRow();
                if(selectedRow!=-1) {
                    tableModel.setValueAt(rowValues[0], selectedRow,0);
                    tableModel.setValueAt(rowValues[1], selectedRow,1);
                }

            }
        });
        jb3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                int selectedRow = jtb.getSelectedRow();
                if(selectedRow!=-1) {
                    tableModel.removeRow(selectedRow);
                }

            }
        });





    }

}
