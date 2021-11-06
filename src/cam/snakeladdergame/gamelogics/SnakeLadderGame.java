package cam.snakeladdergame.gamelogics;

public class SnakeLadderGame {
	public final static int LADDER = 1;
	public final static int SNAKE = 2;

	public int snakeLadderGame(int playerPosition, int player) {
		int previousPosition = 0;
		int diceNum = (int) (Math.random() * 6 + 1);//getting random dice number
		System.out.println("now player " + player + " turn");
		System.out.println("dice number " + diceNum);
		playerPosition += diceNum;
		if (playerPosition > 100) {
			playerPosition -= diceNum;
		}
		if (playerPosition == 100) {
			return playerPosition;
		}
		double random = Math.random() * 3;
		previousPosition = playerPosition;
		switch ((int) random) {
		case LADDER:
			System.out.println("player entered ladder position ");
			playerPosition += diceNum;
			if (playerPosition > 100) {
				playerPosition = previousPosition;
			}
			System.out.println("player get another chance to roll dice ");
			SnakeLadderGame game = new SnakeLadderGame();
			playerPosition = game.snakeLadderGame(playerPosition, player);
			return playerPosition;
		case SNAKE:
			System.out.println("player entered snake position ");
			playerPosition -= diceNum;
			previousPosition = playerPosition;
			if (playerPosition < 0) {
				playerPosition = 0;
			}
			break;
		default:
			System.out.println("player entered the no play position ");
			break;
		}
		System.out.println("player" + player + "position " + playerPosition);
		return playerPosition;
	}

	public static void main(String[] args) {
		int player1Position = 0, player2Position = 0, player1 = 1, player2 = 2;

		SnakeLadderGame game = new SnakeLadderGame();//creating object of this class

		while (true) {
			player1Position = game.snakeLadderGame(player1Position, player1);
			if (player1Position == 100) {
				System.out.println("player one win the game lets celabrate ");
				break;
			}
			player2Position = game.snakeLadderGame(player2Position, player2);
			if (player2Position == 100) {
				System.out.println("player two win the game lets celabrate ");
				break;
			}

		}
		System.out.println("player one position " + player1Position);
		System.out.println("player two position " + player2Position);
	}

}
