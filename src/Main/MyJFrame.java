package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyJFrame extends JFrame {
    public JButton jbt0 = new JButton("好"),
            jbt1 = new JButton("不好");
    public MyJFrame(){
        super("来自一个帅气的小哥哥");
        this.setSize(800,600);
        this.setLayout(null);
        this.setLocation(400,300);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/image/hello.jpg"));
        JLabel jLabel0 = new JLabel("小姐姐，我观察你很久了");
        JLabel jLabel1 = new JLabel("做我女盆友好不好鸭？");
        JLabel jLabel2 = new JLabel(imageIcon);
        Font font0 = new Font("Dialog",Font.PLAIN,20);
        Font font1 = new Font("Dialog",Font.PLAIN,40);
        Listener listener = new Listener(jbt0,jbt1);

        jLabel0.setSize(400,30);
        jLabel1.setSize(400,50);
        jLabel2.setSize(300,280);
        jbt0.setSize(100,50);
        jbt1.setSize(100,50);
        jLabel0.setFont(font0);
        jLabel1.setFont(font1);
        imageIcon.setImage(imageIcon.getImage().getScaledInstance(277,270,Image.SCALE_DEFAULT));

        jLabel0.setLocation(50,100);
        jLabel1.setLocation(50,150);
        jLabel2.setLocation(450,100);
        jbt0.setLocation(50,400);
        jbt1.setLocation(600,400);
        jbt0.addActionListener(listener);
        jbt1.addActionListener(listener);

        this.add(jLabel0);
        this.add(jLabel1);
        this.add(jLabel2);
        this.add(jbt0);
        this.add(jbt1);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null,"不点好是不可能关的！","诶嘿~",JOptionPane.PLAIN_MESSAGE);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
    }
}
