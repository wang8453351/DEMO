package SwingTable;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class ToolBar extends JFrame {

    public ToolBar() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("ToolBar");
        this.setBounds(100,100,500,500);
        final JToolBar toolBar = new JToolBar("Tool");
        toolBar.setFloatable(true);
        this.getContentPane().add(toolBar,BorderLayout.NORTH);
        final JButton newbutton = new JButton("New");
//        newbutton.addActionListener(new ButtonListener());
        toolBar.add(newbutton);
        toolBar.addSeparator();
        final JButton savebutton = new JButton("Save");
        toolBar.add(savebutton);
        toolBar.addSeparator();
    }




    public static void main(String[] args) {
        ToolBar frame = new ToolBar();
        frame.setVisible(true);
    }
}
