package SwingTable;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileChooser extends JFrame{

    static JPanel jp;

    public FileChooser() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("FileChooser");
        this.setBounds(100,100,500,500);

        jp = new JPanel();
        final JLabel jl = new JLabel("File:");
        final JTextField jt = new JTextField(20);
        jt.setFont(new Font(null,Font.PLAIN,20));
        final JButton jb = new JButton("upload");
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JFileChooser fileChooser = new JFileChooser();
                int i = fileChooser.showOpenDialog(getContentPane());
                if(i == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    jt.setText(selectedFile.getName());
                }
            }
        });
        jp.add(jl);
        jp.add(jt);
        jp.add(jb);

        this.getContentPane().add(jp,BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        FileChooser frame = new FileChooser();
        frame.setVisible(true);
    }
}
