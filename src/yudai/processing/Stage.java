package yudai.processing;

public class Stage {
    Ball ball;
    Paddle paddle;
    Block[] blocks = new Block[16*3];
    //↑クラス ↑オブジェクト

    public Stage(){

        //コンストラクタ　newしたときに呼ばれる
        ball = new Ball();
        paddle = new Paddle();
        for(int i = 0; i < blocks.length/16; i++) {
            for(int j = 0; j < blocks.length/3; j++) {
                blocks[i*16+j] = new Block();
                blocks[i*16+j].bx = j *30 +25/2;
                blocks[i*16+j].by = (i*16+j) /16*25 +5;
            }
        }
    }

    //メソッド
    public void draw(Main main) {
        //　↑戻り値 返さないからvoid

        ball.update(main);
        paddle.update(main);
        //block.update(main);

        ball.draw(main);
        paddle.draw(main);
        for(int i = 0; i < blocks.length; i++) {
            blocks[i].draw(main);
        }

        //パドルの当たり判定
        if (ball.y + ball.size/2 > paddle.py && ball.y - ball.size/2 < paddle.py + paddle.ph && ball.x + ball.size/2 > paddle.px && ball.x - ball.size/2 < paddle.px + paddle.pw){
            ball.moveY= ball.moveY* -1;
        }
    }
}
