package yudai.processing;

import processing.core.PApplet;

public class Paddle {
    int x = 500/2;
    int y = 500-40;
    int width = 40;
    int height = 10;


    public void draw(Main main) {
        main.strokeWeight(1);
        main.rect(x, y, width, height);
    }

    public void update(Main main) {
    if(main.keyPressed){
        System.out.println(main.keyCode);
        if(main.keyCode == 39)x = x + 5;
        if(main.keyCode == 37)x = x - 5;
        }
    }
}
