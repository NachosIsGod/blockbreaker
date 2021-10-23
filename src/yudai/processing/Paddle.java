package yudai.processing;

import processing.core.PApplet;

import static processing.core.PConstants.RADIUS;

public class Paddle extends DrawObject implements Collision{

    int width = 40;
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
            System.out.println(pApplet.keyCode);
            if(pApplet.keyCode == 39)x = x + 5;
            if(pApplet.keyCode == 37)x = x - 5;
        }
    }

    @Override
    public boolean isHit(int x, int y){
        return y/2 > y && y/2 < y+height && x/2 > x && x/ 2 < x+width;
    }

    @Override
    public void onAction(int x, int y){

    }
}
