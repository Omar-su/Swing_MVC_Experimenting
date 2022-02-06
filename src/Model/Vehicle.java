package Model;

public abstract class Vehicle {
    private int xPos;
    private int yPos;


    public Vehicle(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }


    public void moveRight(int amount){
        this.xPos += amount;
    }


    public void moveLeft(int amount){
        this.xPos -= amount;
    }


    public void moveUp(int amount){
        this.xPos -= amount;
    }


    public void moveDown(int amount){
        this.xPos += amount;
    }


}
