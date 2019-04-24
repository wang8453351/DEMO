package middlePane;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import common.PaneWithFuncModel;
import mainTestMethod.ReadAutoCalLoss;

public class CalLossResultPane extends PaneWithFuncModel{

    public JPanel mCalLossResultPane = null;
    public int row;
    public int col;
    public  JTextArea mInLossText = new JTextArea(500,500);
    public JTextArea mOutLossText =  new JTextArea(500,500);
    public JTextArea mOutLossLText = new JTextArea(500,500);
    public JTextArea mTotalLossG0Text =  new JTextArea(500,500);
    public JTextArea mTotalLossG2Text =  new JTextArea(500,500);
    public JTextArea mTotalLossG4Text =  new JTextArea(500,500);
    public int firstShow = 0;

    public CalLossResultPane() {}

    private static class CalLossResultInstance{
        private static final CalLossResultPane INSTANCE = new CalLossResultPane();
    }
    public static CalLossResultPane getInstance() {
        return CalLossResultInstance.INSTANCE;
    }

    public JPanel init() {

            mCalLossResultPane = new JPanel();
            setPanelFuncModel();
            setPanelFrame(mCalLossResultPane);
            return mCalLossResultPane;

    }





    @Override
    public void setPanelFrame(JPanel mJPane) {
        // TODO Auto-generated method stub
        mJPane.setLayout(new BorderLayout());
        JTabbedPane mJTabPane = new JTabbedPane();
//        JTextArea mInLossText = new JTextArea(500,500);
//        JTextArea mOutLossText =  new JTextArea(500,500);
//        JTextArea mOutLossLText = new JTextArea(500,500);
//        JTextArea mTotalLossG0Text =  new JTextArea(500,500);
//        JTextArea mTotalLossG2Text =  new JTextArea(500,500);
//        JTextArea mTotalLossG4Text =  new JTextArea(500,500);
//        mInLossText.setLineWrap(true);
//        mOutLossText.setLineWrap(true);
//        mOutLossLText.setLineWrap(true);
//        mTotalLossG0Text.setLineWrap(true);
//        mTotalLossG2Text.setLineWrap(true);
//        mTotalLossG4Text.setLineWrap(true);


        JPanel jp1 = new JPanel(new BorderLayout());
        JPanel jp2 = new JPanel(new BorderLayout());
        JPanel jp3 = new JPanel(new BorderLayout());
        JPanel jp4 = new JPanel(new BorderLayout());
        JPanel jp5 = new JPanel(new BorderLayout());
        JPanel jp6 = new JPanel(new BorderLayout());



        JScrollPane mInLossPane = new JScrollPane();
        mInLossPane.setViewportView(mInLossText);
        JScrollPane mOutLossPane = new JScrollPane(mOutLossText);
        JScrollPane mOutLossLPane = new JScrollPane(mOutLossLText);
        JScrollPane mTotalLossG0 = new JScrollPane(mTotalLossG0Text);
        JScrollPane mTotalLossG2 = new JScrollPane(mTotalLossG2Text);
        JScrollPane mTotalLossG4 = new JScrollPane(mTotalLossG4Text);

        mInLossPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mInLossPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mOutLossPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mOutLossPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mOutLossLPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mOutLossLPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mTotalLossG0.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mTotalLossG0.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mTotalLossG2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mTotalLossG2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mTotalLossG4.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        mTotalLossG4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jp1.add(mInLossPane);
        jp2.add(mOutLossPane);
        jp3.add(mOutLossLPane);
        jp4.add(mTotalLossG0);
        jp5.add(mTotalLossG2);
        jp6.add(mTotalLossG4);

//        jp1.setSize(100, 100);
//        mOutLossPane.setPreferredSize(new Dimension(200,200));
//        mOutLossLPane.setPreferredSize(new Dimension(200,200));
//        mTotalLossG0.setPreferredSize(new Dimension(200,200));
//        mTotalLossG2.setPreferredSize(new Dimension(200,200));
//        mTotalLossG4.setPreferredSize(new Dimension(200,200));

        mJTabPane.add("Cal_InLoss",jp1);
        mJTabPane.add("Cal_OutLoss",jp2);
        mJTabPane.add("Cal_OutLossL",jp3);
        mJTabPane.add("Cal_TotalLossG0",jp4);
        mJTabPane.add("Cal_TotalLossG2",jp5);
        mJTabPane.add("Cal_TotalLossG4",jp6);
        mJPane.add(mJTabPane,BorderLayout.CENTER);

    }

    @Override
    public void setPanelFuncModel() {
        // TODO Auto-generated method stub
//        mInLossText.setLineWrap(true);
//        mOutLossText.setLineWrap(true);
//        mOutLossLText.setLineWrap(true);
//        mTotalLossG0Text.setLineWrap(true);
//        mTotalLossG2Text.setLineWrap(true);
//        mTotalLossG4Text.setLineWrap(true);
        if(firstShow==1) {
            mInLossText.setText("Wait ....");
            mOutLossText.setText("Wait ....");
            mOutLossLText.setText("Wait ...");
            mTotalLossG0Text.setText("Wait ...");
            mTotalLossG2Text.setText("Wait ...");
            mTotalLossG4Text.setText("Wait ...");
        }else {

            mInLossText.setText(ReadAutoCalLoss.calInLossText);
            mOutLossText.setText(ReadAutoCalLoss.calOutLossText);
            mOutLossLText.setText(ReadAutoCalLoss.calOutLossLText);
            mTotalLossG0Text.setText(ReadAutoCalLoss.calTotalLossG0Text);
            mTotalLossG2Text.setText(ReadAutoCalLoss.calTotalLossG2Text);
            mTotalLossG4Text.setText(ReadAutoCalLoss.calTotalLossG4Text);
            System.out.println("CalLossResultPane set TestText finish");
        }



    }

}
