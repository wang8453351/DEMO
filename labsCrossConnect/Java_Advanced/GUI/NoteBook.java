package GUI;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;


public class NoteBook extends JFrame{

    JMenuBar cd;
    JMenu cd1,cd2,cd3,cd4,cd5;//bu canyu buju!!! fixed layout
    JMenuItem cdx2,cdx3,cdx4,cdx5,cdx6,cdx7;
    JMenu ej;   JMenuItem edj1,edj2;
    //JMenuItem is final item; without next menu;
    //JMenu is not final item; with next menu;

    JToolBar gjt;
    JButton an1,an2,an3,an4,an5,an6;

    JTextArea wby;
    JScrollPane gdt;

    public static void main(String args[]){

        NoteBook construct = new NoteBook();


    }
    public NoteBook()
    {
        gjt = new JToolBar();
        an1 = new JButton(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        an1.setToolTipText("create");
        an2 = new JButton(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        an2.setToolTipText("open");
        an3 = new JButton(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        an3.setToolTipText("save");
        an4 = new JButton(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        an4.setToolTipText("copy");
        an5 = new JButton(new ImageIcon("../labsCrossConnect/image/ADV.png"));
        an5.setToolTipText("paste");

        cd = new JMenuBar();
        cd1 = new JMenu("File(F)");
        cd1.setMnemonic('F');
        cd2 = new JMenu("Edit(E)");
        cd2.setMnemonic('E');
        cd3 = new JMenu("Format(O)");
        cd3.setMnemonic('O');
        cd4 = new JMenu("View(V)");
        cd4.setMnemonic('V');
        cd5 = new JMenu("Help(H)");
        cd5.setMnemonic(5);

        ej = new JMenu("create");
        edj1 = new JMenuItem("File",new ImageIcon("../labsCrossConnect/image/ADV.png"));
        edj2 = new JMenuItem("Model",2);

        cdx2 = new JMenuItem("Open",new ImageIcon("../labsCrossConnect/image/ADV.png"));
        cdx3 = new JMenuItem("save",new ImageIcon("../labsCrossConnect/image/ADV.png"));
        cdx4 = new JMenuItem("save as");
        cdx5 = new JMenuItem("page set");
        cdx6 = new JMenuItem("print");
        cdx7 = new JMenuItem("exit");

        wby = new JTextArea();
        gdt = new JScrollPane(wby);


        gjt.add(an1); gjt.add(an2); gjt.add(an3); gjt.add(an4); gjt.add(an5);

        ej.add(edj1); ej.add(edj2);

        cd1.add(ej);  cd1.add(cdx2);    cd1.add(cdx3); cd1.add(cdx4);
        cd1.addSeparator();
        cd1.add(cdx5); cd1.add(cdx6);
        cd1.addSeparator();
        cd1.add(cdx7);

        cd.add(cd1); cd.add(cd2);cd.add(cd3);cd.add(cd4);cd.add(cd5);


        this.setJMenuBar(cd);
        this.add(gjt,BorderLayout.NORTH);
        this.add(gdt,BorderLayout.CENTER);

        ImageIcon tp1 = new ImageIcon("../labsCrossConnect/image/ADV.png");
        this.setIconImage(tp1.getImage());
        this.setTitle("NoteBook");
        this.setSize(570,370);
        this.setLocation(300,280);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(true);



    }


}
