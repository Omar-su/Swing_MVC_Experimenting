package View;

import javax.swing.*;
import java.awt.*;

public class ScoreLabel extends JPanel {

    public ScoreLabel(){
        this.setBounds(250,50,300,300);
        this.setOpaque(false);
        JLabel label = new JLabel("SCORE : 0");
        label.setFont(new Font("Serif", Font.PLAIN, 18));
        label.setForeground(Color.GREEN);
        this.add(label);


    }

    private void updateLabel(int score, JLabel label){
        label.setText("SCORE : " + score);
    }




}
