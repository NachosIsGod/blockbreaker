package yudai.processing;

import processing.core.PApplet;

public abstract class DrawObject {
    int x;
    int y;

    public DrawObject(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract void draw(PApplet pApplet);

    public void update(PApplet pApplet){
    }

    void onAction(int x, int y){
    }
}