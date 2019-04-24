package SwingTable;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class ProgressBar extends JFrame{

    class Progress extends Thread{
        private final int[] progressValue = {6,18,27,39,51,66,81,100};
        private JProgressBar progressBar;
        private JButton button;
        public Progress(JProgressBar progressBar, JButton button) {
            this.progressBar = progressBar;
            this.button = button;
        }
        @Override
        public void run(){
            for(int i=0;i<progressValue.length;i++) {
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar.setValue(progressValue[i]);
            }
            progressBar.setIndeterminate(false);
            progressBar.setString("Finished");
            button.setEnabled(true);
        }

    }
    public ProgressBar() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("Progress");
        final JPanel jp = new JPanel();
        final JProgressBar progressBar = new JProgressBar();
        progressBar.setStringPainted(true);
        progressBar.setIndeterminate(false);
//        progressBar.setString("Upgrade...");
        final JButton button = new JButton("Finished");
        new Progress(progressBar,button).start();
        jp.add(progressBar);
        jp.add(button,BorderLayout.SOUTH);
        this.getContentPane().add(jp,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        ProgressBar frame = new ProgressBar();
        frame.setVisible(true);
    }
}
