package SwingTable;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame {

    public static void main(String[] args) {
        GridBagLayoutDemo frame = new GridBagLayoutDemo();

        frame.setVisible(true);
    }

    public GridBagLayoutDemo() {
        super();
        GridBagLayout layout = new GridBagLayout();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("GridBagLayOutDemo");
        this.setBounds(100, 100, 500, 500);
        this.setLayout(layout);

        final JButton button = new JButton("A");
        final GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridy=0;
        gridBagConstraints.gridx=0;
        gridBagConstraints.weightx=10;//10% From Horizontal area, total length is 100%
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
//        this.getContentPane().add(button,gridBagConstraints);
        layout.setConstraints(button, gridBagConstraints);

        final JButton button_1 = new JButton("B");
        final GridBagConstraints gridBagConstraints_1 = new GridBagConstraints();
        gridBagConstraints_1.gridy = 0;
        gridBagConstraints_1.gridx = 1;
        gridBagConstraints_1.insets = new Insets(0, 5, 0, 0);//(top,left,bottom,right);
        gridBagConstraints_1.weightx = 20;
        gridBagConstraints_1.fill = GridBagConstraints.HORIZONTAL;
//        this.getContentPane().add(button_1,gridBagConstraints_1);
        layout.setConstraints(button_1, gridBagConstraints_1);

        final JButton button_2 = new JButton("C");
        final GridBagConstraints gridBagConstraints_2 = new GridBagConstraints();
        gridBagConstraints_2.gridy = 0;
        gridBagConstraints_2.gridx = 2;
        gridBagConstraints_2.gridheight=2;
        gridBagConstraints_2.insets = new Insets(0, 5, 0, 0);
        gridBagConstraints_2.weightx = 30;
        gridBagConstraints_2.fill = GridBagConstraints.BOTH;
//        this.getContentPane().add(button_2,gridBagConstraints_2);
        layout.setConstraints(button_2, gridBagConstraints_2);

        final JButton button_3 = new JButton("D");
        final GridBagConstraints gridBagConstraints_3 = new GridBagConstraints();
        gridBagConstraints_3.gridy = 0;
        gridBagConstraints_3.gridx = 3;
        gridBagConstraints_3.gridheight = 4;
        gridBagConstraints_3.insets = new Insets(0, 5, 0, 5);
        gridBagConstraints_3.weightx=40;
        gridBagConstraints_3.fill = GridBagConstraints.BOTH;
//        this.getContentPane().add(button_3,gridBagConstraints_3);
        layout.setConstraints(button_3, gridBagConstraints_3);

        final JButton button_4 = new JButton("E");
        final GridBagConstraints gridBagConstraints_4 = new GridBagConstraints();
        gridBagConstraints_4.gridy = 1;
        gridBagConstraints_4.gridx = 0;
        gridBagConstraints_4.gridwidth = 2;
        gridBagConstraints_4.insets = new Insets(5, 0, 0, 0);
        gridBagConstraints_4.fill = GridBagConstraints.HORIZONTAL;
//        this.getContentPane().add(button_4,gridBagConstraints_4);
        layout.setConstraints(button_4, gridBagConstraints_4);

        final JButton button_5 = new JButton("F");
        final GridBagConstraints gridBagConstraints_5 = new GridBagConstraints();
        gridBagConstraints_5.gridy = 2;
        gridBagConstraints_5.gridx = 0;
        gridBagConstraints_5.insets = new Insets(5, 0, 0, 0);
        gridBagConstraints_5.fill = GridBagConstraints.HORIZONTAL;
//        this.getContentPane().add(button_5,gridBagConstraints_5);
        layout.setConstraints(button_5, gridBagConstraints_5);

        final JButton button_6 = new JButton("G");
        final GridBagConstraints gridBagConstraints_6 = new GridBagConstraints();
        gridBagConstraints_6.gridy = 2;
        gridBagConstraints_6.gridx = 1;
        gridBagConstraints_6.gridwidth =2;
        gridBagConstraints_6.gridheight = 2;
        gridBagConstraints_6.insets = new Insets(5, 5, 0, 0);
        gridBagConstraints_6.fill = GridBagConstraints.BOTH;
//        this.getContentPane().add(button_6,gridBagConstraints_6);
        layout.setConstraints(button_6, gridBagConstraints_6);

        final JButton button_7 = new JButton("H");
        final GridBagConstraints gridBagConstraints_7 = new GridBagConstraints();
        gridBagConstraints_7.gridy = 3;
        gridBagConstraints_7.gridx =0;
        gridBagConstraints_7.insets = new Insets(5, 0, 0, 0);
        gridBagConstraints_7.fill = GridBagConstraints.HORIZONTAL;
//        this.getContentPane().add(button_7,gridBagConstraints_7);
        layout.setConstraints(button_7, gridBagConstraints_7);


        this.add(button);
        this.add(button_1);
        this.add(button_2);
        this.add(button_3);
        this.add(button_4);
        this.add(button_5);
        this.add(button_6);
        this.add(button_7);
    }
}
