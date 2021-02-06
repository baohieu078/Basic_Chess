package ChessBoard;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JPanel{

    public void paint(Graphics gp) {
        gp.fillRect(50, 50, 600, 600);
        for (int x = 50; x <= 600; x += 150) {
            for (int y = 50; y <= 600; y += 150) {
                gp.clearRect(x, y, 75, 75);
            }
        }
        for (int x = 125; x <= 600; x += 150) {
            for (int y = 125; y <= 600; y += 150) {
                gp.clearRect(x, y, 75, 75);
            }
        }
    }

    public static void main(String[] args) {

        JFrame jf = new JFrame("Chess written by Hieu");
        jf.setSize(720,750);
        jf.getContentPane().add(new ChessBoard());
        jf.setLocationRelativeTo(null);
        jf.setBackground(Color.pink);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setVisible(true);

        /*JInternalFrame jif = new JInternalFrame();
        jif.setSize(20, 20);
        jif.setLocation(0,0);
        jif.setVisible(true);
        jif.setClosable(true);
        jif.setResizable(false);
        jf.add(jif);
        jf.repaint();*/

        Button exit = new Button();
        exit.ExitButton(jf);

        /*JButton resize = new JButton();
        resize.setText("Minimize");
        resize.setSize(150,50);
        resize.setLocation(280,820);
        resize.setVisible(true);*/


        //jf.add(resize);

        boolean fullscreen = true;
        boolean minimal = false;

        /*resize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (fullscreen && !minimal)
                    jf.setSize(800,800);
                else if(!fullscreen && minimal)
                    jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });*/
    }
}
