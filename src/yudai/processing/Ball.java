package yudai.processing;

public class Ball {
    int x = 250;
    int y = 50;
    int moveX = 4;
    int moveY = 4;
    int size = 10;

    public void draw(Main main){
        main.strokeWeight(size);
        main.point(x,y);
    }

    public void update(Main main) {
        x= x+ moveX;
        y= y+ moveY;

        if(500<x || x<0)moveX= moveX* -1;
        if(500<y || y<0)moveY= moveY* -1;

    }
}