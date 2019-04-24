package middlePane;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import common.IPaneSet;

public class CreateMiddlePane implements IPaneSet{

    public JSplitPane mMiddlePane;

    public CreateMiddlePane(Container pane) {
        mMiddlePane = new JSplitPane();
        addHSplitPane(pane);
        addVSplitPane();

    }

    private void addHSplitPane(Container pane){

        mMiddlePane.setOrientation(1);
        mMiddlePane.setDividerLocation(500);
        mMiddlePane.setDividerSize(10);
        mMiddlePane.setLeftComponent(createCalResult(CalResultPane.getInstance().init()));//add Function model
        mMiddlePane.setOneTouchExpandable(true);
        mMiddlePane.setContinuousLayout(true);
        mMiddlePane.setEnabled(false);
        pane.add(mMiddlePane,BorderLayout.CENTER);

    }
    private void addVSplitPane() {
        JSplitPane vSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        vSplitPane.setDividerLocation(500);
        vSplitPane.setDividerSize(10);
        vSplitPane.setOneTouchExpandable(true);
        vSplitPane.setContinuousLayout(true);
        vSplitPane.setLeftComponent(createCalCondition(CalConditionPane.getInstance().init()));
        vSplitPane.setRightComponent(createLossResultPane(CalLossResultPane.getInstance().init()));
        vSplitPane.setEnabled(false);
        mMiddlePane.setRightComponent(vSplitPane);


    }

    private JPanel createCalResult(JPanel mSiteResultPane) {
        JPanel mTotalPane = new JPanel();
        mTotalPane.setLayout(new BorderLayout());
        JPanel mTopPane = new JPanel(new BorderLayout());
        JLabel mLabel = new JLabel("CAL RESULT",JLabel.CENTER);
        mLabel.setFont(new Font("Arial",Font.BOLD,30));
        mTopPane.add(mLabel,BorderLayout.CENTER);
        mTotalPane.add(mTopPane,BorderLayout.NORTH);
        mTotalPane.add(mSiteResultPane,BorderLayout.CENTER);
        return mTotalPane;
    }

    private JPanel createCalCondition(JPanel mCalConditionPane) {
        JPanel mTotalPane = new JPanel(new BorderLayout());
        JPanel mTopPane = new JPanel(new BorderLayout());
        JLabel mLabel = new JLabel("CAL CONDITION",JLabel.CENTER);
        mLabel.setFont(new Font("Arial",Font.BOLD,30));
        mTopPane.add(mLabel,BorderLayout.CENTER);
        mTotalPane.add(mTopPane,BorderLayout.NORTH);
        mTotalPane.add(mCalConditionPane,BorderLayout.CENTER);
        return mTotalPane;
    }

    private JPanel createLossResultPane(JPanel mLossResultPane ) {
        JPanel mTotalPane = new JPanel(new BorderLayout());
        JPanel mTopPane = new JPanel(new BorderLayout());
        JLabel mLabel = new JLabel("LOSS RESULT",JLabel.CENTER);
        mLabel.setFont(new Font("Arial",Font.BOLD,30));
        mTopPane.add(mLabel,BorderLayout.CENTER);
        mTotalPane.add(mTopPane,BorderLayout.NORTH);
        mTotalPane.add(mLossResultPane,BorderLayout.CENTER);
        return mTotalPane;
    }

    @Override
    public void setPaneLayout() {
        // TODO Auto-generated method stub

    }



}
