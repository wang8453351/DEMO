/**
 *
 */
package TCP_IP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author demo
 *
 */
public class ReceiveUdp extends JFrame implements Runnable,ActionListener {

    int port;
    InetAddress group = null;
    MulticastSocket socket= null;
    JButton jbstart = new JButton("Start");
    JButton jbstop = new JButton("Stop");
    JTextArea jtstart = new JTextArea(10,10);
    JTextArea jtstop = new JTextArea(10,10);

    Thread thread;
    boolean b = false;
    public ReceiveUdp() {
        super("Broadcast");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        thread = new Thread(this);
        jbstart.addActionListener(this);
        jbstop.addActionListener(this);
        jtstart.setForeground(Color.blue);// text word color

        JPanel north = new JPanel();
        north.add(jbstart);
        north.add(jbstop);
        add(north,BorderLayout.NORTH);

        JPanel center = new JPanel();
        center.setLayout(new GridLayout(1, 2));
        center.add(jtstart);
        center.add(jtstop);
        add(center,BorderLayout.CENTER);

        validate();//refresh

        port = 8888;
        try {
            group = InetAddress.getByName("224.255.10.0");//must be same with SendUdp
            socket = new MulticastSocket(port);
//            socket.setTimeToLive(1);
            socket.joinGroup(group);
        }catch(Exception e) {
            e.printStackTrace();
        }
        setBounds(100,50,360,380);
        setVisible(true);

    }
    @Override
    public void run() {
        while(true){
            byte data[] = new byte[1024];
            DatagramPacket packet = null;
            packet = new DatagramPacket(data, data.length,group,port);

            try {
                socket.receive(packet);
                String message = new String(packet.getData(),0,packet.getLength());

//                jtstart.setText("Receiving data : \n" + message);
//                jtstop.setText(message+  "\n");
                jtstart.append("Receiving data : \n" + message);
                jtstop.append(message + "\n");

            }catch(Exception e) {
                e.printStackTrace();
            }
            if(b == true) {
                break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbstart) {
            jbstart.setBackground(Color.red);
            jbstop.setBackground(Color.yellow);
            if(!(thread.isAlive())) {
                thread = new Thread(this);// if thread is is null, create new one
            }
            thread.start();
            b= false;
        }
        if(e.getSource() == jbstop) {
            jbstart.setBackground(Color.yellow);
            jbstop.setBackground(Color.red);
            b= true;
        }
    }




    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ReceiveUdp rec = new ReceiveUdp();
        rec.setSize(460,200);


    }

}
