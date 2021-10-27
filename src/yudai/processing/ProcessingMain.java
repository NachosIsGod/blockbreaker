package yudai.processing;

import processing.core.PApplet;

public class ProcessingMain extends PApplet {
    Stage stage;

    @Override
    public void settings() {
        size(500, 500);
        stage = new Stage(this);
    }

    @Override
    public void setup(){
    }

    @Override
    public void draw() {
        stage.draw(this);
        stage.update(this);
    }
}
