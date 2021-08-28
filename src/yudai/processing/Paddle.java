package yudai.processing;

public class Paddle {
    int x = 500/2;
    int y = 500-20;

    public void draw(Main main) {

        if(main.keyPressed){
            System.out.println(main.keyCode);
            if(main.keyCode == 39)x = x + 4;
            if(main.keyCode == 37)x = x - 4;
      }
        main.strokeWeight(1);
        main.rect(x, y, 40, 10);
    }
}
