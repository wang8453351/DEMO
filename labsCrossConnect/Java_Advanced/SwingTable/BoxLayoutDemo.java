package SwingTable;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BoxLayoutDemo extends JFrame {

    public BoxLayoutDemo() {

        super();
        this.setTitle("BoxLayout");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100,100,500,500);

        Box topicBox = Box.createHorizontalBox();
        this.getContentPane().add(topicBox,BorderLayout.NORTH);
        topicBox.add(Box.createHorizontalStrut(10));
        JLabel topicLabel = new JLabel("Topic: ");
        topicBox.add(topicLabel);
        topicBox.add(Box.createHorizontalStrut(24));
        JTextField topicTextField = new JTextField(30);
        topicBox.add(topicTextField);

        Box box = Box.createVerticalBox();
        this.getContentPane().add(box,BorderLayout.CENTER);
        box.add(Box.createVerticalStrut(5));

        Box contentBox = Box.createHorizontalBox();
        contentBox.setAlignmentX(1);//Right format
        box.add(contentBox);
        contentBox.add(Box.createHorizontalStrut(10));
        JLabel contentLabel = new JLabel("Content: ");
        contentLabel.setAlignmentY(0);//Up format
        contentBox.add(contentLabel);

        contentBox.add(Box.createHorizontalStrut(5));

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setAlignmentY(0);//Up format
        JTextArea contentTextArea = new JTextArea("WangPing");
        contentTextArea.setLineWrap(true);
        scrollPane.setViewportView(contentTextArea);//Only this API, we can view and edit textArea. --> new JScrollPane(textArea)
//        scrollPane.add(contentTextArea);//doesn't work
        contentBox.add(scrollPane);

        box.add(Box.createVerticalStrut(10));
        JButton submitButton = new JButton("Confirm");
        submitButton.setAlignmentX(1);
        box.add(submitButton);

    }

    public static void main(String[] args) {
        BoxLayoutDemo frame = new BoxLayoutDemo();
        frame.setVisible(true);
    }


}
