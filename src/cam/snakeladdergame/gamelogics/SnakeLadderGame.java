package cam.snakeladdergame.gamelogics;

public class SnakeLadderGame {
	public final static int LADDER = 1;
	public final static int SNAKE = 2;

	public static void main(String[] args) {
		int player1Position = 0;
		int diceNum = (int) (Math.random() * 6 + 1);
		System.out.println("player one position " + player1Position);
		System.out.println("Dice number : " + diceNum);
		double random = Math.random() * 3;
		switch ((int) random) {
		case LADDER:
			System.out.println("player entered ladder position ");
			player1Position += diceNum;
			break;
		case SNAKE:
			System.out.println("player entered snake position ");
			player1Position -= diceNum;
			break;
		default:
			System.out.println("player entered the no play position ");
			break;
		}
	}
}
