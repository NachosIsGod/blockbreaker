package yudai.processing;

import processing.core.PApplet;

public class Paddle {
    int px = 500/2;
    int py = 500-40;
    int pw = 40;
    int ph = 10;


    public void draw(Main main) {
        main.strokeWeight(1);
        main.rect(px, py, pw, ph);
    }

    public void update(Main main) {
    if(main.keyPressed){
        System.out.println(main.keyCode);
        if(main.keyCode == 39)px = px + 5;
        if(main.keyCode == 37)px = px - 5;
        }
    }
}
