package com.packages.joe.shapes;

/**
 * Created by Joe on 10/27/2016.
 */
public class Circle extends Shape{
    /*X coordinate of the center*/
    int x;
    /*Y coordinate of the center*/
    int y;
    /*Radius of the circle*/
    int r;
    /*Use this constructor if you want a circle with a certain color*/
    public Circle(int color, int x, int y, int r){
        super(color);
        this.x = x;
        this.y = y;
        this.r = r;
    }
    /*Use this constructor if you want a circle with a random color or if you don't care*/
    public Circle(int x, int y, int r){
        super();
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setR(int r) {
        this.r = r;
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }
    /*Call this when moving the center of the circle*/
    public void setNewCoordinates(int x, int y){
        setX(x);
        setY(y);
    }
}
