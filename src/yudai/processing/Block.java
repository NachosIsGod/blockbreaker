package yudai.processing;

import processing.core.PApplet;

public class Block extends DrawObject implements Collision{
    int width = 25;
    int height = 10;
    boolean isVisible = true;

    public Block(int x, int y){
        //newされたときのstartXPos、startYPosをsuperする
        super(x, y);
    }

    @Override
    public void draw(PApplet pApplet) {
        pApplet.strokeWeight(1);
        if(isVisible)pApplet.rect(x, y, width, height);
    }

    @Override
    public boolean isHit(int x, int y){
        if(isVisible) {
            isVisible = !(y/2 > y && y/2 < y+height && x/2 > x && x/2 < x+width);//当たってたらfalseいなかったらtrue
            return isVisible;
        }
        return true;
    }

    @Override
    public void onAction(int x, int y) {

    }
}
