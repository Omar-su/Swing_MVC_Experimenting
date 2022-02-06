package View;

import javax.swing.*;
import java.awt.*;

/**
 * A class representing a panel that shows the current score
 */
public class ScoreLabel extends JPanel {

    public ScoreLabel(){
        setBounds(250,50,300,300);
        setOpaque(false);
        JLabel label = new JLabel("SCORE : 0");
        label.setFont(new Font("Serif", Font.PLAIN, 18));
        label.setForeground(Color.GREEN);
        add(label);


    }

    /**
     * Updates the score label
     * @param score the current score
     * @param label The label that needs updating
     */
    private void updateLabel(int score, JLabel label){
        label.setText("SCORE : " + score);
    }




}
