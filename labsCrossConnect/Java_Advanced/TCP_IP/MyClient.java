/**
 *
 */
package TCP_IP;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

/**
 * @author demo
 *
 */
public class MyClient extends JFrame {

    private PrintWriter writer;
    private BufferedWriter buffos;
    private OutputStreamWriter osw;
    Socket socket;
    private JTextArea jta = new JTextArea();
    private JTextField jtf = new JTextField();
    Container cc;

    public MyClient(String title) {
        super(title);//JFrame(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cc= this.getContentPane();
        final JScrollPane jsp = new JScrollPane();
        jsp.setBorder(new BevelBorder(BevelBorder.RAISED));
        cc.add(jsp,BorderLayout.CENTER);
        jsp.setViewportView(jta);
        cc.add(jtf,BorderLayout.SOUTH);
        jtf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                writer.println(jtf.getText());//write text into outputStream.
//                writer.write(jtf.getText());
                jta.append(jtf.getText()+"\n");
                jta.setSelectionEnd(jta.getText().length());
                jtf.setText("");

            }
        });


    }
    private void connect() {
        jta.append("try to connect..."+"\n");
        try {
            socket =new Socket("10.150.110.214",8998);
            writer = new PrintWriter(socket.getOutputStream(),true);//socket.getOutputStream, send data stream to server
//            osw = new OutputStreamWriter(socket.getOutputStream(), "UTF-8");
//            writer.write(jtf.getText());
            jta.append("finish connect...\n");

        }catch(Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyClient client = new MyClient("Send message to Server");
        client.setSize(200,200);
        client.setVisible(true);
        client.connect();

    }

}
