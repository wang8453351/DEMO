package SwingTable;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SpringLayoutDemo extends JFrame{

    public static void main(String[] args) {

        SpringLayoutDemo frame = new SpringLayoutDemo();
        frame.setVisible(true);
    }


    public SpringLayoutDemo() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("SpringLayout");
        this.setBounds(100, 100, 500, 500);

        SpringLayout springLayout = new SpringLayout();
        this.setLayout(springLayout);

        JLabel topicLabel = new JLabel("Topic: ");
        this.getContentPane().add(topicLabel);
        springLayout.putConstraint(SpringLayout.NORTH, topicLabel, 5, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, topicLabel, 5, SpringLayout.WEST, getContentPane());

        JTextField topicTextField = new JTextField();
        this.getContentPane().add(topicTextField);
        springLayout.putConstraint(SpringLayout.NORTH, topicTextField, 5, SpringLayout.NORTH, getContentPane());
        springLayout.putConstraint(SpringLayout.WEST, topicTextField, 5, SpringLayout.EAST, topicLabel);
        springLayout.putConstraint(SpringLayout.EAST, topicTextField, -5, SpringLayout.EAST, getContentPane());

        JLabel contentLabel = new JLabel("Content: ");
        this.getContentPane().add(contentLabel);
        springLayout.putConstraint(SpringLayout.NORTH, contentLabel, 5, SpringLayout.SOUTH, topicTextField);
        springLayout.putConstraint(SpringLayout.WEST, contentLabel, 5, SpringLayout.WEST, getContentPane());


        JScrollPane contentScrollPane = new JScrollPane();
        contentScrollPane.setViewportView(new JTextArea());
        this.getContentPane().add(contentScrollPane);
        springLayout.putConstraint(SpringLayout.NORTH, contentScrollPane, 5, SpringLayout.SOUTH, topicTextField);
        springLayout.putConstraint(SpringLayout.WEST, contentScrollPane, 5, SpringLayout.EAST, contentLabel);
        springLayout.putConstraint(SpringLayout.EAST, contentScrollPane, -5, SpringLayout.EAST, getContentPane());

        JButton resetButton = new JButton("Clear");
        this.getContentPane().add(resetButton);
        springLayout.putConstraint(SpringLayout.SOUTH, resetButton, -5, SpringLayout.SOUTH, getContentPane());

        JButton submitButton = new JButton("Confirm");
        this.getContentPane().add(submitButton);
        springLayout.putConstraint(SpringLayout.SOUTH, submitButton, -5, SpringLayout.SOUTH, getContentPane());
        springLayout.putConstraint(SpringLayout.EAST, submitButton, -5, SpringLayout.EAST, getContentPane());
        springLayout.putConstraint(SpringLayout.SOUTH, contentScrollPane, -5, SpringLayout.NORTH, submitButton);
        springLayout.putConstraint(SpringLayout.EAST, resetButton, -5, SpringLayout.WEST, submitButton);
    }
}
