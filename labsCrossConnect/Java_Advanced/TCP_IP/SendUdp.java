package TCP_IP;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
/**
 * @author demo
 * @category
 * Step1: configure data package
 * Step2: point data,data length,address,port
 * step3: set socket to transfer data package
 * @pay attention to IP address
 */



public class SendUdp extends Thread {
    String message = "Pls Call me Now!!!!";
    int port = 8888;
    InetAddress iaddress = null;
    MulticastSocket socket =null;

    SendUdp(){
        try {
            iaddress = InetAddress.getByName("224.255.10.0");//224.0.0.0 to 239.255.255 range, if over the range, throw exception
            socket = new MulticastSocket();
            socket.setTimeToLive(1);// Local netWork
            socket.joinGroup(iaddress);//join in iaddress;

        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            DatagramPacket packet = null; //data package;
            byte data[] = message.getBytes();
            //package data now
            packet = new DatagramPacket(data, data.length,iaddress,port);
            System.out.println(new String(data));

            try {
                socket.send(packet);
                sleep(3000);
            }catch (Exception e) {
                e.printStackTrace();
            }



        }
    }

    public static void main(String[] args) {
       SendUdp w = new SendUdp();
       w.start();

    }

}
