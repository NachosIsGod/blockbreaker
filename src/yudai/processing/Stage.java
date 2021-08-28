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

    }
}
