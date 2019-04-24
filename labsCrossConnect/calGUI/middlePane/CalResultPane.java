package middlePane;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import common.PaneWithFuncModel;
import mainTestMethod.ReadAutoCalLoss;

public class CalResultPane extends PaneWithFuncModel {

    public JPanel mCalResultPane = null;
    public int row;
    public int col;
    public Boolean[] rslt;
    public CalResultPane() {}
    public int firstShow=0;

    private static class CalResultInstance{
        private static final CalResultPane INSTANCE = new CalResultPane();
    }
    public static CalResultPane getInstance() {
        return CalResultInstance.INSTANCE;
    }

    public JPanel init() {

            mCalResultPane = new JPanel();
            setPanelFuncModel();
            setPanelFrame(mCalResultPane);
            return mCalResultPane;

    }




    @Override
    public void setPanelFrame(JPanel mJPanel) {
        // TODO Auto-generated method stub

        mJPanel.setLayout(new GridLayout(row,col));
//        mJPanel.setPreferredSize(new Dimension(200,600));
        for(int i = 1;i<row+1;i++) {
            JLabel mLabel = new JLabel("SITE "+i+"  ",JLabel.CENTER);
            mLabel.setFont(new Font("Dialog",2,30));
            mJPanel.add(mLabel);
            JButton mButton = new JButton();
            ImageIcon iconPass = new ImageIcon("./image/PASS_JPG.jpg");
            ImageIcon iconFail = new ImageIcon("./image/FAIL_JPG.jpg");
            iconPass = new ImageIcon(iconPass.getImage().getScaledInstance(245, 120, Image.SCALE_DEFAULT));
            iconFail = new ImageIcon(iconFail.getImage().getScaledInstance(245, 120, Image.SCALE_DEFAULT));

            if(firstShow==0) {
                if(rslt[i-1]) {
                    mButton.setIcon(iconPass);
                    mButton.setBackground(Color.GREEN);
                }else {
                    mButton.setIcon(iconFail);
                    mButton.setBackground(Color.RED);
                }
            }else {
                mButton.setBackground(Color.YELLOW);
            }

            mJPanel.add(mButton);
        }
    }

    @Override
    public void setPanelFuncModel() {
        // TODO Auto-generated method stub
        row = 8;
        col = 2;
        rslt = new Boolean[8];
        rslt = ReadAutoCalLoss.mJudgeResult;
        System.out.println("CalResultPane Set JudgeResult Finish!!!!!");
    }



}
