package SwingTable;

import java.awt.BorderLayout;
import java.util.Vector;

import javax.swing.JFrame;

public class JTableDemo5 extends JFrame{

    public JTableDemo5() {

        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,510,375);
        this.setTitle("DEMO");
        Vector<String> columnNameV = new Vector<>();
        columnNameV.add("date");
        for(int i=1;i<21;i++) {
            columnNameV.add("Good"+i);
        }
        Vector<Vector<Object>> tableValueV = new Vector<>();
        for(int row =1;row<31;row++) {
            Vector<Object> rowV = new Vector<>();
            rowV.add(row);
            for(int col=0;col<20;col++) {
                rowV.add((int)(Math.random()*1000));
            }
            tableValueV.add(rowV);
        }
        final FixedTableColumn panel = new FixedTableColumn(columnNameV, tableValueV, 1);
        this.getContentPane().add(panel,BorderLayout.CENTER);

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JTableDemo5 frame = new JTableDemo5();
        frame.setVisible(true);



    }

}
