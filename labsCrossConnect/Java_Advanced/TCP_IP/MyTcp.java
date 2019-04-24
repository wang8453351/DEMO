/**
 *
 */
package TCP_IP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author demo
 *@category TCP server : getServer() setup socket and use getClientMessage() to get client message
 */
public class MyTcp {

    private BufferedReader reader;
    private ServerSocket server;
    private Socket socket;
    void getServer() {
        try {

            server = new ServerSocket(8998);//port : 8998 , need be lower than 65535
            System.out.println("socket bounded port 8998 is created successfully in server!");
            while(true) {
                System.out.println("wait for requesting by client");
                socket = server.accept();//if client no response, wait...
                System.out.println("Connecting...");
                Reader readerInstance = new InputStreamReader(socket.getInputStream());//Reader is abstract function
                reader=new BufferedReader(readerInstance);

                getClientMessage();
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void getClientMessage() {
        try {
            while(true) {
                System.out.println("Client: "+reader.readLine());
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        try {

            if(reader!=null) {
                reader.close();
            }
            if(socket!=null) {
                socket.close();
            }
        }catch(Exception e) {
            e.printStackTrace();
        }

    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyTcp tcp = new MyTcp();
        tcp.getServer();
    }

}
