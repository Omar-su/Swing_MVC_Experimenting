package View;

import javax.swing.*;
import java.awt.*;

public class StartWindow extends JFrame {
    public StartWindow(){


        setTitle("RACING CAR");
        setSize(new Dimension(800,800));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(new ScoreLabel());
        add(new MovePanel());

        add(new HighWay());



        setVisible(true);



    }



}
