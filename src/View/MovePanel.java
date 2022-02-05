package View;

import javax.swing.*;
import java.awt.*;

public class MovePanel extends JPanel {
    public MovePanel(){
        this.setPreferredSize(new Dimension(300,100));
        this.setLayout(new GridBagLayout());
        this.setBounds(280,670,250,100);



        JButton[] buttons = addButtons();
        for (JButton button : buttons){
            button.setLayout(new BorderLayout(50,50));


            this.add(button);
        }
        this.setOpaque(false);

    }




    private JButton[] addButtons() {
        JButton [] buttons = new JButton[3];
        buttons [0] = new JButton("LEFT");
        buttons [1]  = new JButton("SHOOT");
        buttons [2]  = new JButton("RIGHT");
        return buttons;

    }

}
