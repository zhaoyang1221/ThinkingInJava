package exercise_19;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/3 0003
 * To change this template use File | Settings | File Templates.
 * Description:
 */
interface Game {
    void play();
}
interface GameFactory {
    Game getGame();
}
class CoinsGame implements Game {
    Random random = new Random();
    @Override
    public void play() {
        System.out.print("Coin is ");
        int res = random.nextInt(2);
        switch (res) {
            case 0:
                System.out.print("Head\n");
                return;
            case 1:
                System.out.print("Tails\n");
                return;
            default:
                System.out.print("Edge\n");

        }

    }
}

class CoinsGameFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new CoinsGame();
    }
}

class DiceThrow implements Game {
    Random rand = new Random();
    public void play() {
        System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
    }
}

class DiceThrowFactory implements GameFactory {
    public Game getGame() {
        return new DiceThrow();
    }
}
public class Ex19 {
    public static void playGame (GameFactory gameFactory) {
        Game game = gameFactory.getGame();
        game.play();
    }
    public static void main(String[] args) {
        playGame(new CoinsGameFactory());
        playGame(new DiceThrowFactory());
    }
}