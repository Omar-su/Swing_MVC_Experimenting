package View;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JFrame {
    public StartWindow(){


        this.setTitle("RACING CAR");
        this.setSize(new Dimension(800,800));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(new ScoreLabel());
        this.add(new MovePanel());

        this.add(new HighWay());



        this.setVisible(true);

//        JFrame frame = new JFrame("RACING CAR");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(800,800);
//        frame.setVisible(true);


    }



}
