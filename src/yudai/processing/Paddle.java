package yudai.processing;

import processing.core.PApplet;

import static processing.core.PConstants.RADIUS;

public class Paddle extends DrawObject implements Collision{

    int width = 100;
    int height = 10;

    public Paddle(){
        super(255, 450);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.strokeWeight(1);
        pApplet.rect(x, y, width, height);
    }

    @Override
    public void update(PApplet pApplet) {
        if(pApplet.keyPressed){
            //System.out.println(pApplet.keyCode); //キー表示
            if(pApplet.keyCode == 39)x = x + 5;
            if(pApplet.keyCode == 37)x = x - 5;
        }
    }

    @Override
    public boolean isHit(int x, int y){
        return this.x<x && x<(this.x + width)&&this.y<y&&y<(this.y+height);
    }

    @Override
    public void onAction(int x, int y){
    }
}
