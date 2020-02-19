import java.util.Random;

public class Dice {
String game;

    public Dice(String pickGame) {
        this.game = pickGame;
    }



    public Integer tossAndSum() {
        Random random = new Random();
        Integer sum = 0;
        int toss;
        int randNum;
        if (game.equals("c")) {
            toss = 2;
            randNum = random.nextInt(42);
        }
        else{
            toss = 5;
            randNum = random.nextInt(105);
        }
         int i = 1;
        while(i <= toss){
            sum+=randNum;
            i++;
        }
        return sum;

    }

}
