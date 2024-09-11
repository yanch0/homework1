package org.example.task3;

public class Point implements Movable {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void moveUp() {
        x = this.getX();
        y = this.getY() + 1;
        System.out.println("New position: " + x + ";" + y);
    }

    @Override
    public void moveDown() {
        x = this.getX();
        y = this.getY() - 1;
        System.out.println("New position: " + x + ";" + y);
    }

    @Override
    public void moveLeft() {
        x = this.getX() - 1;
        y = this.getY();
        System.out.println("New position: " + x + ";" + y);
    }

    @Override
    public void moveRight() {
        x = this.getX() + 1;
        y = this.getY();
        System.out.println("New position: " + x + ";" + y);
    }
}
