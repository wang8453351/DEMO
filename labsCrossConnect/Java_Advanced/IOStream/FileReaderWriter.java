package IOStream;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FileReaderWriter extends JFrame {

    @SuppressWarnings("unused")
    private static final long serialVerisonUID = 1L;
    @SuppressWarnings("unused")
    private JPanel jContentPane = null;
    private JTextArea jTextArea = null;
    private JPanel controlPane = null;
    private JButton openButton = null;
    private JButton closeButton = null;

    public static void main(String[] args) {
       FileReaderWriter frw = new FileReaderWriter();
//       frw.setLayout(new BorderLayout());
//       frw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       frw.setVisible(true);
    }

    private JButton getOpenButton() {
        if(openButton==null) {
            openButton = new JButton();
            openButton.setText("Write File");
            openButton.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    File file = new File("word.txt");
                    try {
                        FileWriter fw = new FileWriter(file);
                        String s = jTextArea.getText();
                        fw.write(s);
                        fw.close();
                    }catch (Exception e1) {
                        // TODO: handle exception
                        e1.printStackTrace();
                    }
                }
            });
        }
        return openButton;

    }

    private JButton getCloseButton() {
        if(closeButton == null) {
           closeButton = new JButton();
           closeButton.setText("Read File");
           closeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                File file = new File("word.txt");
                try {
                    FileReader fr = new FileReader(file);
                    char s[] = new char[1024];
                    int len = fr.read(s);
                    jTextArea.setText(new String(s,0,len));
                    fr.close();
                }catch(Exception e2) {
                    e2.printStackTrace();
                }

            }
        });
        }
        return closeButton;
    }

    public FileReaderWriter() {
//        super();
        initalize();
    }
    private void initalize() {
        this.add(getJTextArea(),BorderLayout.CENTER);
        this.add(getControlPanel(),BorderLayout.SOUTH);
        this.setTitle("JFrame");
        this.setSize(340,270);
        this.setLocation(300,280);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    private JTextArea getJTextArea() {
        if(jTextArea == null) {
            jTextArea = new JTextArea(20,50);
//            jTextArea.setSize(20, 50);
        }
        return jTextArea;

    }
    private JPanel getControlPanel() {
        if(controlPane==null) {
            controlPane = new JPanel();
            controlPane.setLayout(new FlowLayout());
            controlPane.add(getOpenButton());
            controlPane.add(getCloseButton());
//            controlPane.setSize(50, 80);
        }
        return controlPane;
    }
//    private JPanel getJContentPanel() {
//        if(jContentPane == null) {
//           jContentPane = new JPanel();
//           jContentPane.setLayout(new BorderLayout());
//           jContentPane.add(getJTextArea(),BorderLayout.CENTER);
//           jContentPane.add(getControlPanel(),BorderLayout.SOUTH);
//        }
//        return jContentPane;
//    }



}
