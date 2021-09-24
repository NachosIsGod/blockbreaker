package yudai.processing;

public class Stage {
    Ball ball;
    Paddle paddle;
    //↑クラス ↑オブジェクト

    public Stage(){
        //コンストラクタ　newしたときに呼ばれる
        ball = new Ball();
        paddle = new Paddle();
    }

    //メソッド
    public void draw(Main main) {
        //　↑戻り値 返さないからvoid

        ball.update(main);
        paddle.update(main);

        ball.draw(main);
        paddle.draw(main);

        if (ball.y + ball.size/2 > paddle.y - paddle.height/2 && ball.y - ball.size/2 < paddle.y + paddle.height/2){
            if (ball.x + ball.size/2 > paddle.x - paddle.width/2 && ball.x - ball.size/2 < paddle.x + paddle.width/2) {
                ball.moveY= ball.moveY* -1;
                ball.y= ball.y+ ball.moveY/2;
            }
        }
    }
}
