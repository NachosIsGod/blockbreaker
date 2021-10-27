package yudai.processing;

import processing.core.PApplet;

public class Ball extends DrawObject {
    int moveX;
    int moveY;
    int size = 10;

    Ball() {
        super(250, 50);
        x = 250;
        y = 80;
        moveX = 4;
        moveY = 4;
    }

    @Override
    public void update(PApplet pApplet) {
        x= x+ moveX;
        y= y+ moveY;

        //端に当たる
        if(500<x || x<0)moveX *= -1;
        if(500<y || y<0)moveY *= -1;
    }

    @Override
    public void draw(PApplet pApplet){
        pApplet.strokeWeight(size);
        pApplet.point(x,y);
    }

    @Override
    public void onAction(int x, int y) {
        this.moveY = this.moveY*-1;
    }
}