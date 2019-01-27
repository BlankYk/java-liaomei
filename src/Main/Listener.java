package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Listener implements ActionListener {
    JButton jbt0,jbt1;
    String noInfo[] = {"我妈会游泳","生孩子保大","房子写你名字","出轨净身出户","万事你做主"};
    public Listener(JButton jbt0,JButton jbt1){
        this.jbt0 = jbt0;
        this.jbt1 = jbt1;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbt0){
            JOptionPane.showMessageDialog(null,"所谓世间，该不会就是你吧？","把你宠到天上去",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);
        }else if (e.getSource() == jbt1){
            int ram = new Random().nextInt(5);
            JOptionPane.showMessageDialog(null,noInfo[ram]);
        }
    }
}
