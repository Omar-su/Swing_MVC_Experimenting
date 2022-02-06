package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/**
 * A class representing the road on which the vehicle is driving on
 */
public class HighWay extends JPanel {

    Random random;
    int[] obsX;
    int obsY;

    // number of obstacles
    int numObs;
    boolean stillALive;

    public HighWay(){
        setPreferredSize(new Dimension(500,800));
        setBackground(Color.GRAY);
        setLayout(new GridLayout());
        setBounds(100,0, 600,800);
        random = new Random();
        stillALive = true;
        newObstacles();


    }

    /**
     * Gets values needed for new obstacles
     */
    private void newObstacles(){
        obsY = 0;
        numObs = random.nextInt(3,7);
        obsX = new int[numObs];
        for (int i = 0; i < numObs ; i++){
            obsX[i] = random.nextInt(500);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    /**
     * Draws obstacles
     * @param g
     */
    private void draw(Graphics g){
        if (stillALive){
            for (int x : obsX) {
                g.setColor(Color.BLUE);
                g.fillRoundRect(x, obsY, 140, 50, 20, 20);
                System.out.println("x value : " + x + " y Value : " + obsY);
                System.out.println(numObs);
            }

        }
    }



}
