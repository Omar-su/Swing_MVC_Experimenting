package View;

import javax.swing.*;
import java.awt.*;

/**
 * A class representing a panel that has buttons for moving the vehicle
 */
public class MovePanel extends JPanel {

    private final int height = 100;
    private final int width = 250;
    private final int y = 670;
    private final int x = 280;

    public MovePanel(){
        setPreferredSize(new Dimension(300,100));
        setLayout(new GridBagLayout());
        setBounds(x, y, width, height);

        JButton[] buttons = createButtons();
        for (JButton button : buttons){
            button.setLayout(new BorderLayout(50,50));


            add(button);
        }
        setOpaque(false);

    }


    /**
     * Creates buttons for moving the vehicle
     * @return a list of buttons
     */
    private JButton[] createButtons() {
        JButton [] buttons = new JButton[3];
        buttons [0] = new JButton("LEFT");
        buttons [1]  = new JButton("SHOOT");
        buttons [2]  = new JButton("RIGHT");
        return buttons;

    }

}
