package com.packages.joe.shapes;

/**
 * Created by Joe on 10/27/2016.
 */

import android.graphics.Color;
import java.util.Random;

public abstract class Shape {
    public static final int PURPLE = 0xFF9400D3;
    public static final int DKGREEN = 0xFF006400;
    public static final int INDRED = 0xFFCD5C5C;
    /*The color is for the purpose of drawing using a Paint object with the corresponding color of
    the shape in conjunction with whatever variant of canvas.draw()*/
    protected int color;
    public Shape(int color){
        this.color = color;
    }
    public Shape(){
        Random rand = new Random();
        rand.setSeed(System.nanoTime());
        int c = rand.nextInt(9);
        switch(c){
            case 0: this.color = Color.BLUE;
                break;
            case 1: this.color = Color.CYAN;
                break;
            case 2: this.color = Color.GREEN;
                break;
            case 3: this.color = PURPLE;
                break;
            case 4: this.color = DKGREEN;
                break;
            case 5: this.color = Color.MAGENTA;
                break;
            case 6: this.color = Color.RED;
                break;
            case 7: this.color = INDRED;
                break;
            default: this.color = Color.YELLOW;
                break;
        }
    }
    public int getColor(){
        return color;
    }
}
