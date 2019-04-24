package SwingTable;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CardLayOutDemo extends JFrame{

    private JPanel cardPanel;
    private CardLayout cardLayout;
    public static void main(String[] args) {
        CardLayOutDemo frame = new CardLayOutDemo();
        frame.setVisible(true);
    }

    public CardLayOutDemo(){
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("CardLayOut");
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);//need add cardLayout into Panel
        this.getContentPane().add(cardPanel,BorderLayout.CENTER);
        String[] labelNames = {"CardB","CardA","CardC"};

        for(int i=0;i<labelNames.length;i++) {

            final JLabel label = new JLabel(labelNames[i]);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setFont(new Font("",Font.BOLD,16));
            label.setForeground(new Color(255,0,0));
            cardPanel.add(label,labelNames[i]);
        }
        final JPanel buttonPanel = new JPanel();
        this.getContentPane().add(buttonPanel,BorderLayout.SOUTH);
        String[] buttonName = {"Fist","Previous","CardA","CardB","CardC","next","last"};
        for(int i=0;i<buttonName.length;i++) {

            final Button button = new Button(buttonName[i]);
            button.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    String buttonText = button.getLabel();
                    switch (buttonText){
                        case "First":
                            cardLayout.first(cardPanel);
                            break;
                        case "Previous":
                            cardLayout.previous(cardPanel);
                            break;
                        case "CardA":
                            cardLayout.show(cardPanel, "CardA");
                            break;
                        case "CardB":
                            cardLayout.show(cardPanel, "CardB");
                            break;
                        case "CardC":
                            cardLayout.show(cardPanel, "CardC");
                            break;
                        case "next":
                            cardLayout.next(cardPanel);
                            break;
                        case "last":
                            cardLayout.last(cardPanel);
                            break;
                        default:
                            break;


                    }
                }
            });
            buttonPanel.add(button);
        }

    }
}
