/**
 *
 */
package TCP_IP;
import java.net.InetAddress;

/**
 * @author demo
 * @category use getHostName() and getHostAddress() to get local server name and IP address.
 */
public class InetAddressClass {

        public static void main (String[] args) {

            InetAddress ip;
            InetAddress subip;
            try {
                ip =InetAddress.getLocalHost();
                String localname = ip.getHostName();
                String localip = ip.getHostAddress();
                System.out.println("Local name: "+localname);
                System.out.println("Local ip: "+localip);

                subip = InetAddress.getByName("wangping");
                String sublocalip = subip.getHostAddress();
                System.out.println("subLocal ip :"+sublocalip);

            }catch (Exception e) {
                System.out.println("Throw Exception!!!");
                e.printStackTrace();
            }
        }
}
