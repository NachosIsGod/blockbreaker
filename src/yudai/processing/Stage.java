package yudai.processing;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Stage {
    DrawObject ball;
    List<DrawObject> drawableObject = new ArrayList<>();

    public Stage(PApplet pApplet){
        ball = new Ball();
        drawableObject.add(ball);

        Paddle paddle = new Paddle();
        drawableObject.add(paddle);

        //ブロック個数計算
        int width = pApplet.width;
        int height = pApplet.height;

        int bw = Block.WIDTH;
        int bh = Block.HEIGHT;
        int bg = 5; //間のスペースの数

        int n = width / (bg + bw); //横方向の数
        int m = 3; //縦方向の数
        int space = width - n * (bg + bw) + bg; //あまりのスペース

        int startXPos = space/2;
        int startYPos = bg;

        for(int i = 0; i < m; i++) {    //縦方向
            startXPos = bg;
            for(int j = 0; j < n; j++) {    //横方向
                Block block = new Block(startXPos,startYPos);
                block.x = startXPos;
                block.y = startYPos;
                startXPos = startXPos + (bw+bg);
                drawableObject.add(block);
            }
            startYPos = startYPos + (bh+bg);
        }
    }

    public void update(PApplet pApplet) {
        for(int i = 0; i< drawableObject.size(); i++){
            //全てのupdateを実行
            DrawObject o = drawableObject.get(i);
            o.update(pApplet);

            if(o instanceof Collision){
                Collision collision = (Collision) o;

                //当たり判定
                if(collision.isHit(ball.x, ball.y)){
                    System.out.println("当たったぜ");
                    ball.onAction(o.x, o.y);
                }
            }
        }
    }

    //メソッド
    public void draw(PApplet pApplet) {
        update(pApplet); //NEW

        pApplet.background(128);

        for(int i = 0; i < drawableObject.size(); i++) {
            //全部のdrawを実行
            DrawObject o = drawableObject.get(i);
            o.draw(pApplet);
        }
    }
}
