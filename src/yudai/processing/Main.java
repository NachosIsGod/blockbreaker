package yudai.processing;

import processing.core.PApplet;
import sun.net.util.IPAddressUtil;

public class Main extends PApplet {
    //public static PApplet pApplet;

    Stage stage;

    @Override
    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup(){
        stage = new Stage();

        size(500,500);
    }

    @Override
    public void draw(){
        background(128);
        stage.draw(this);
    }

    public static void main(String[] args){
        PApplet.main(Main.class);
    }
}
