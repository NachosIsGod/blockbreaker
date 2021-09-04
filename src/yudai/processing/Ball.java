package yudai.processing;

public class Ball {
    int x = 250;
    int y = 50;
    int movex = 3;
    int movey = 3;

    public void draw(Main main){
        main.strokeWeight(10);
        main.point(x,y);
    }

    public void update(Main main) {
        x= x+ movex;
        y= y+ movey;

        if(500<x || x<0)movex= movex* -1;
        if(500<y || y<0)movey= movey* -1;

    }
}