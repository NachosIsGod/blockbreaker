package yudai.processing;

public class Block {
    int bx;
    int by;
    int bw = 25;
    int bh = 10;
    boolean isShow = true;

    public void draw(Main main) {
        main.strokeWeight(1);
        if(isShow)main.rect(bx, by, bw, bh);
    }

    boolean isHit(int x, int y, int s){
        if(isShow) {
            isShow = !(y + s / 2 > by && y - s / 2 < by + bh && x + s / 2 > bx && x - s / 2 < bx + bw);//当たってたらfalseいなかったらtrue
            return isShow;
        }
        return true;
    }
}
