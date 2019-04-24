package SwingTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class PersonalMenu extends JFrame {

    static JMenuBar menuBar;
    static JMenu F;
    static JMenu E;
    static JMenu H;

    private class ItemListener implements ActionListener{
        @Override
        public void actionPerformed (ActionEvent e) {
            JMenuItem menuItem = (JMenuItem)e.getSource();
            System.out.println("Clicked Menu Item : "+menuItem.getText());
        }
    }
    public PersonalMenu() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);
        this.setTitle("Personal Menu");
        menuBar  = new JMenuBar();

        F= new JMenu("File(F)");
        F.setMnemonic('F');//quick click
        menuBar.add(F);
        final JMenuItem newItem = new JMenuItem("Create(N)");
        newItem.setMnemonic('N');
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK));
        F.add(newItem);
        final JMenu openMenu = new JMenu("Open(O)");
        openMenu.setMnemonic('O');
        F.add(openMenu);
        final JMenuItem openNewItem = new JMenuItem("Not Open (N)");
        openNewItem.setMnemonic('N');
        openNewItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_MASK|InputEvent.ALT_MASK));
        openNewItem.addActionListener(new ItemListener());
        openMenu.add(openNewItem);
        final JMenuItem openClosedItem = new JMenuItem("Opened (C)");
        openClosedItem.setEnabled(false);
        openClosedItem.addActionListener(new ItemListener());
        openMenu.add(openClosedItem);
        F.addSeparator();

        E = new JMenu("Edit(E)");
        E.setMnemonic('E');
        menuBar.add(E);
        final JMenu fontMenu = new JMenu("Font(F)");
        fontMenu.setMnemonic('F');
        E.add(fontMenu);
        final JCheckBoxMenuItem bCheckBoxItem = new JCheckBoxMenuItem("Rough(B)");
        bCheckBoxItem.setMnemonic('B');
        bCheckBoxItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,InputEvent.ALT_MASK|InputEvent.CTRL_MASK));
        bCheckBoxItem.addActionListener(new ItemListener());
        fontMenu.add(bCheckBoxItem);
        final JCheckBoxMenuItem iCheckBoxItem = new JCheckBoxMenuItem("Italic(I)");
        iCheckBoxItem.setMnemonic('I');
        iCheckBoxItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I,InputEvent.ALT_MASK|InputEvent.CTRL_MASK));
        iCheckBoxItem.addActionListener(new ItemListener());
        fontMenu.add(iCheckBoxItem);
        final ButtonGroup buttonGroup = new ButtonGroup();
        final JMenu attributeMenu = new JMenu("Attribute(A)");
        attributeMenu.setMnemonic('A');
        E.add(attributeMenu);
        final JRadioButtonMenuItem rRadioButtonItem = new JRadioButtonMenuItem("Read(R)");
        rRadioButtonItem.setMnemonic('R');
        buttonGroup.add(rRadioButtonItem);
        rRadioButtonItem.addActionListener(new ItemListener());
        rRadioButtonItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,InputEvent.CTRL_MASK|InputEvent.ALT_MASK));
        attributeMenu.add(rRadioButtonItem);
        final JRadioButtonMenuItem eRadioButtonItem = new JRadioButtonMenuItem("Edit(E)");
        eRadioButtonItem.setMnemonic('E');
        buttonGroup.add(eRadioButtonItem);
        eRadioButtonItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,InputEvent.CTRL_MASK|InputEvent.ALT_MASK));
        eRadioButtonItem.addActionListener(new ItemListener());
        attributeMenu.add(eRadioButtonItem);

        this.setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        PersonalMenu frame = new PersonalMenu();

        frame.setVisible(true);
    }


}
