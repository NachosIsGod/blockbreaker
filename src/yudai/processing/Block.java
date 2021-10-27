package yudai.processing;

import processing.core.PApplet;

public class Block extends DrawObject implements Collision{
    static int WIDTH = 25;
    static int HEIGHT = 10;
    boolean isVisible = true;

    public Block(int x, int y){
        //newされたときのstartXPos、startYPosをsuperする
        super(x, y);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.strokeWeight(1);
        if(isVisible) pApplet.rect(x, y, WIDTH, HEIGHT);
    }

    @Override
    public boolean isHit(int x, int y){
        if(this.x<x && x<(this.x + WIDTH)&&this.y<y&&y<(this.y+HEIGHT)){
            isVisible = false;
            return true;
        }
        return false;
    }

    @Override
    public void onAction(int x, int y) {

    }
}
