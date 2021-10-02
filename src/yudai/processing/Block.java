package yudai.processing;

public class Block {
    int bx;
    int by;
    int bw = 25;
    int bh = 10;

    public void draw(Main main) {
        main.strokeWeight(1);
        main.rect(bx, by, bw, bh);
    }
}
