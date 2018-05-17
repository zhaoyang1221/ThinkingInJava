package exercise_17;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
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

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new CoinsGame();
        }
    };
}

class DiceThrow implements Game {
    Random rand = new Random();
    public void play() {
        System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new DiceThrow();
        }
    };
}
public class Ex17 {
    public static void playGame (GameFactory gameFactory) {
            Game game = gameFactory.getGame();
            game.play();
    }
    public static void main(String[] args) {
        playGame(CoinsGame.factory);
        playGame(DiceThrow.factory);
    }
}