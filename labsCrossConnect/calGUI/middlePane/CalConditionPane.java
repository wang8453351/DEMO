package middlePane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import common.PaneWithFuncModel;
import flowLayout.BoardLayoutDemo;


public class CalConditionPane extends PaneWithFuncModel  {
    public JPanel mCalResultPane = null;
    public int row;
    public int col;
    public CalConditionPane() {}
    private JLabel mMaxCount;
    private JTextField mMaxCountText;

    private static class CalConditionInstance{
        private static final CalConditionPane INSTANCE = new CalConditionPane();
    }
    public static CalConditionPane getInstance() {
        return CalConditionInstance.INSTANCE;
    }

    public JPanel init() {

            mCalResultPane = new JPanel();
            setPanelFuncModel();
            setPanelFrame(mCalResultPane);
//            updateListMap();
            return mCalResultPane;

    }
    public  Map<String,String> updateListMap() {

        Map<String,String> mMap = new LinkedHashMap<>();
      mMap.put(mMaxCount.getText(), mMaxCountText.getText());

      return mMap;


    }

    @Override
    public void setPanelFrame(JPanel mJPane) {
        // TODO Auto-generated method stub

        Box box1 = Box.createHorizontalBox();
//        mJPane.add(box1);
        JLabel mLBID = new JLabel("LBID");
        mLBID.setFont(new Font("Dialog",2,20));
        box1.add(mLBID);
        box1.add(Box.createHorizontalStrut(153));
        JTextField mLBIDText = new JTextField(15);
        mLBIDText.setFont(new Font("Dialog",1,13));
        mLBIDText.setText("2");
        box1.add(mLBIDText);

        Box box1_1 = Box.createVerticalBox();
//        mJPane.add(box1_1);
        box1_1.add(Box.createVerticalStrut(10));

        Box box2 = Box.createHorizontalBox();
//        mJPane.add(box2);
        JLabel mMaxSite = new JLabel("MaxSite");
        mMaxSite.setFont(new Font("Dialog",2,20));
        box2.add(mMaxSite);
        box2.add(Box.createHorizontalStrut(120));
        JTextField mMaxSiteText =new JTextField(15);
        mMaxSiteText.setFont(new Font("Dialog",1,13));
        mMaxSiteText.setText("8");
        box2.add(mMaxSiteText);

        Box box2_1 = Box.createVerticalBox();
//        mJPane.add(box2_1);
        box2_1.add(Box.createVerticalStrut(10));

        Box box3 = Box.createHorizontalBox();
//        mJPane.add(box3);
         mMaxCount = new JLabel("MaxCount");
        mMaxCount.setFont(new Font("Dialog",2,20));
        box3.add(mMaxCount);
        box3.add(Box.createHorizontalStrut(100));
        mMaxCountText =new JTextField(15);
        mMaxCountText.setFont(new Font("Dialog",1,13));
        if(BoardLayoutDemo.condition!=null) {

            mMaxCountText.setText(BoardLayoutDemo.condition.get(mMaxCount.getText()));
        }else {
            mMaxCountText.setText("3");
        }
        box3.add(mMaxCountText);

        Box box3_1 = Box.createVerticalBox();
//        mJPane.add(box3_1);
        box3_1.add(Box.createVerticalStrut(10));

        Box box4 = Box.createHorizontalBox();
//        mJPane.add(box4);
        JLabel mCalFile = new JLabel("CAL PROD ODS");
        mCalFile.setFont(new Font("Dialog",2,20));
        box4.add(mCalFile);
        box4.add(Box.createHorizontalStrut(45));
        JTextField mCalFileText = new JTextField(15);
        mCalFileText.setFont(new Font("Dialog",1,13));
        mCalFileText.setText("/LNA/testtable/files/LNA_Cal_prod.ods");
        box4.add(mCalFileText);

        JPanel jp = new JPanel(new GridLayout(row,col,10,10));
        mJPane.setLayout(new BorderLayout());
        mJPane.add(jp,BorderLayout.NORTH);
        jp.add(mLBID);
        jp.add(mLBIDText);
        jp.add(mMaxSite);
        jp.add(mMaxSiteText);
        jp.add(mMaxCount);
        jp.add(mMaxCountText);
        jp.add(mCalFile);
        jp.add(mCalFileText);



    }

    @Override
    public void setPanelFuncModel() {
        // TODO Auto-generated method stub
        row = 4;
        col = 2;
    }
}
