package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * A class representing the road on which the vehicle is driving on
 */
public class HighWay extends JPanel implements ActionListener {

    private final int obsHeight = 50;
    private Random random;
    private Timer timer;

    // obstacles variables
    private int obs1Width;
    private int obs2Width;
    private int[] obsX;
    private int obsY;
    private final int obstacleSpeed = 4;

    // panel variables
    private final int gapWidth = 100;
    private final int panelWidth = 600;
    private final int panelHeight = 800;
    private boolean stillALive;
    private final int numObs = 2;
    private Color obsColor;


    public HighWay(){
        setBackground(Color.GRAY);
        setLayout(new GridLayout());
        setBounds(100,0, panelWidth,panelHeight);
        random = new Random();
        stillALive = true;
        newObstacle();
        timer = new Timer(10, this);
        timer.start();

    }

    /**
     * Gets values needed for new obstacles
     */
    private void newObstacle(){
        obsY = 0;
        obsX = new int[numObs];
        obsColor = getRandomColor();
        obsX[0] = 0;
        obsX[1] = 600;
        obs1Width = random.nextInt(560);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    /**
     * Draws the obstacle
     */
    private void draw(Graphics g){
        if (stillALive){
            g.setColor(obsColor);
            // obstacle 1
            g.fillRoundRect(obsX[0], obsY, obs1Width, 50, 20, 20);
            // obstacle 2
            obs2Width = (panelWidth- obs1Width -gapWidth);
            g.fillRoundRect((obsX[1]-obs2Width), obsY, obs2Width, obsHeight,20, 20);
        }
    }

    /**
     * Generates a random color
     * @return a random color
     */
    private Color getRandomColor() {
        float hue = random.nextFloat();
        int rgb = Color.HSBtoRGB(hue,(float) 1,(float) 0.7);
        return new Color(rgb);
    }


    /**
     * Moves obstacle when timer calls on it
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (obsY + obsHeight >= panelHeight){
            newObstacle();
        }
        obsY += obstacleSpeed;
        repaint();
    }
}
