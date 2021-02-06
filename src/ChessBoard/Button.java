package ChessBoard;

import javax.swing.*;

public class Button extends JPanel {
    public void ExitButton(JFrame jf) {
        JButton exit = new JButton("EXIT");
        exit.setBounds(0,0,95,30);
        exit.addActionListener(e ->jf.dispose());
        jf.add(exit);
    }

}
