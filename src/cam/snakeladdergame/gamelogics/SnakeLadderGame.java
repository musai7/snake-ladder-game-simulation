package cam.snakeladdergame.gamelogics;

public class SnakeLadderGame {
	public final static int LADDER = 1;
	public final static int SNAKE = 2;

	public static void main(String[] args) {
		int player1Position = 0, temp = 0, diceRollTimes = 0;
		while (true) {
			int diceNum = (int) (Math.random() * 6 + 1);
			diceRollTimes++;
			System.out.println("dice value " + diceNum);
			temp = player1Position;
			player1Position += diceNum;
			if (player1Position > 100) {
				player1Position = temp;
			}
			if (player1Position == 100) {
				break;
			}
			System.out.println("player one position " + player1Position);
			double random = Math.random() * 3;
			switch ((int) random) {
			case LADDER:
				System.out.println("player entered ladder position ");
				player1Position += diceNum;
				if (player1Position > 100) {
					player1Position = temp;
				}
				break;
			case SNAKE:
				System.out.println("player entered snake position ");
				player1Position -= diceNum;
				temp = player1Position;
				if (player1Position < 0) {
					player1Position = 0;
				}
				break;
			default:
				System.out.println("player entered the no play position ");
				break;
			}
			System.out.println("player one position " + player1Position);
			if (player1Position == 100) {
				break;
			}
		}
		System.out.println("number of times player one roll the die : " + diceRollTimes);
		System.out.println("player one win and position : " + player1Position);
	}

}
