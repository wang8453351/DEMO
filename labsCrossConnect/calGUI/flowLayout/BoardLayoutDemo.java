package flowLayout;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import bottomPane.CreateBottomPane;
import middlePane.CalLossResultPane;
import middlePane.CalResultPane;
import middlePane.CreateMiddlePane;
import topPane.CreateTopPane;
import xoc.dta.TestMethod;

public class BoardLayoutDemo extends TestMethod {


//     public static void main(String args[]) {
//         BoardLayoutDemo demo = new BoardLayoutDemo();
//     }
    public static int lock = 0;
    public static boolean flag = true;
    public JFrame jf = new JFrame();
    public static Map<String,String> condition = null ;
    public void CreateInputCondGUI() {
        CalResultPane.getInstance().firstShow=1;
        CalLossResultPane.getInstance().firstShow = 1;
        jf.setTitle("Input CAL Condition");
        jf.setSize(1000,1100);
        jf.setLocation(400, 200);
//        jf.setDefaultCloseOperation(3);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//solve Bridge Problem

        jf.setResizable(false);
        CreateMiddlePane mMiddlePane = new CreateMiddlePane(jf.getContentPane());
        CreateBottomPane mBottomPane = new CreateBottomPane(jf.getContentPane());

        jf.setVisible(true);

    }
    public void CreateAutoCalGUI() {

        jf.getContentPane().removeAll();
        CalResultPane.getInstance().firstShow=0;
        CalLossResultPane.getInstance().firstShow = 0;
        jf.setTitle("AUTO CAL TOOL");
        jf.setSize(1000,1100);
        jf.setLocation(400, 200);
//        jf.setDefaultCloseOperation(3);
        jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);//solve Bridge Problem

        jf.setResizable(false);
        addComponentsToPane(jf.getContentPane());
        println("CalResultPane.firstShow :" +CalLossResultPane.getInstance().firstShow);
        jf.setVisible(true);


    }

    public  void addComponentsToPane(Container pane) {
        CreateTopPane mTopPane = new CreateTopPane(pane);
        CreateMiddlePane mMiddlePane = new CreateMiddlePane(pane);
        CreateBottomPane mBottomPane = new CreateBottomPane(pane);
    }




    @Override
    public void execute() {

        // TODO Auto-generated method stub
        jf.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosed(WindowEvent e) {
                BoardLayoutDemo.lock = 1;
            }
            @Override

            public void windowActivated(WindowEvent e) {
                BoardLayoutDemo.lock = 0;
            }
        });

        for(int i=0;i<10;i++) {

            if(i ==0) {
                lock = 0;

                CreateInputCondGUI();

            }
            else if(i==9) {
                BoardLayoutDemo.lock = 0;
                CreateAutoCalGUI();

            }
            while(lock==0) {
                try {
                    Thread.sleep(1000);
                    if(lock==1) {
                        jf.dispose();
                        continue;

                    }

                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }




        }

        System.out.println("Conditon Value : "+condition);

    }

}
