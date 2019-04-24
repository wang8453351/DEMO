package manuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import common.IJMenuBar;

public class JMenuFile implements IJMenuBar {

    JMenu   mFileJMenu;
    JMenuBar mJMenuBar;

    public JMenuFile(JMenuBar mJMenuBar) {
        this.mJMenuBar = mJMenuBar;
        this.addJMenuItemToJMenu();
        this.addJMenuToJMenuBar();


    }

    @Override
    public void addJMenuToJMenuBar() {
        // TODO Auto-generated method stub
        mFileJMenu.setMnemonic('F');
        mJMenuBar.add(mFileJMenu);

    }
    @Override
    public void addJMenuItemToJMenu() {
        // TODO Auto-generated method stub
        mFileJMenu = new JMenu("File(F)");
        JMenuItem mJMenuItem1 = new JMenuItem("open");
        JMenuItem mJMenuItem2 = new JMenuItem("save");

        addOpenMenuItemListener(mJMenuItem1);
        addSaveMenuItemListener(mJMenuItem2, "WangPing@20190413");
        mFileJMenu.add(mJMenuItem1);
        mFileJMenu.add(mJMenuItem2);
    }


    public void addOpenMenuItemListener(JMenuItem mJMenuItem1) {
        mJMenuItem1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                Thread worker = new Thread() {
                    @Override
                    public void run() {
                        JFileChooser jf = new JFileChooser();
                        jf.setDialogTitle("Open CAL SOP");
                        int result = jf.showOpenDialog(jf);
                        if(result == JFileChooser.APPROVE_OPTION) {
                            File file = jf.getSelectedFile();
                            if(!file.exists()) {
                                JOptionPane.showMessageDialog(jf, "Not Found File","No File",JOptionPane.OK_OPTION);

                            }else {
                                openFile(file);
                            }
                        }
                    }
                };
                worker.start();

            }
        });

    }

    public void addSaveMenuItemListener(JMenuItem mJMenuItem2,final String mCalLoss) {
        mJMenuItem2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JFileChooser jf = new JFileChooser();
                JOptionPane.showMessageDialog(null, "SAVE CAL LOSS");
                jf.setDialogTitle("SAVE CAL LOSS");
                int result = jf.showSaveDialog(jf);
                if(result == JFileChooser.APPROVE_OPTION) {
                    File file = jf.getSelectedFile();
                    if(file.exists()) {
                        int opt = JOptionPane.showConfirmDialog(jf, file+"File is already exist, OverWrite?","File exists",JOptionPane.YES_NO_OPTION);
                        if(JOptionPane.YES_OPTION !=opt) {
                            return;
                        }
                    }
                    saveFile(file,mCalLoss);
                }

            }
        });
    }

    private void openFile(File file) {
        try {
//            InputStream inputStream = new FileInputStream(file);
//            byte[] b = new byte[(int)file.length()];
//            inputStream.read(b);
            java.awt.Desktop.getDesktop().open(file);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();

        }
    }
    private void saveFile(File file, String mCalLoss) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            os.write(mCalLoss.getBytes("UTF-8"));
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }






}
