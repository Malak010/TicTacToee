import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-3
 *
 */
public class TT {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing a Board
		// initialize array with its element
		char[][] gBoard = { { '0', '1', '2' }, { '3', '4', '5' }, { '6', '7', '8' } };

		// Create a Game Board
		printBoard(gBoard);// R.C ==>Ref ==> Ext-Method

		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		for (int a = 0; a < 8; a++) { // Error when

			PlayerTurn(gBoard, input);
			PlayerTurn2(gBoard, input2);
			printBoard(gBoard);
		}
		System.out.println(" ");
		System.out.println(" ");
		printBoard(gBoard);
		checkWinner(gBoard);
	}

	private static void PlayerTurn(char[][] gBoard, Scanner input) {

		System.out.println("Player A..select Number from (0-8): ");

		int number = input.nextInt();

		if (number == 0 && gBoard[0][0] != 'O') {
			gBoard[0][0] = 'X';
		}

		else if (number == 1 && gBoard[0][1] != 'O') {
			gBoard[0][1] = 'X';
		}

		else if (number == 2 && gBoard[0][2] != 'O') {
			gBoard[0][2] = 'X';
		}

		else if (number == 3 && gBoard[1][0] != 'O') {
			gBoard[1][0] = 'X';
		} else if (number == 4 && gBoard[1][1] != 'O') {
			gBoard[1][1] = 'X';
		} else if (number == 5 && gBoard[1][2] != 'O') {
			gBoard[1][2] = 'X';
		}

		else if (number == 6 && gBoard[2][0] != 'O') {
			gBoard[2][0] = 'X';
		} else if (number == 7 && gBoard[2][1] != 'O') {
			gBoard[2][1] = 'X';
		}

		else if (number == 8 && gBoard[2][2] != 'O') {
			gBoard[2][2] = 'X';
		} else {
			System.out.println("This Number is Used..Select another.");
		}
	}

	private static void PlayerTurn2(char[][] gBoard, Scanner input2) {
		System.out.println("Player B..select Number from (0-8): ");
		int number1 = input2.nextInt();

		if (number1 == 0 && gBoard[0][0] != 'X') {
			gBoard[0][0] = 'O';
		}

		else if (number1 == 1 && gBoard[0][1] != 'X') {
			gBoard[0][1] = 'O';
		}

		else if (number1 == 2 && gBoard[0][2] != 'X') {
			gBoard[0][2] = 'O';

		} else if (number1 == 3 && gBoard[1][0] != 'X') {
			gBoard[1][0] = 'O';

		} else if (number1 == 4 && gBoard[1][1] != 'X') {
			gBoard[1][1] = 'O';

		} else if (number1 == 5 && gBoard[1][2] != 'X') {
			gBoard[1][2] = 'O';

		} else if (number1 == 6 && gBoard[2][0] != 'X') {
			gBoard[2][0] = 'O';
		} else if (number1 == 7 && gBoard[2][1] != 'X') {
			gBoard[2][1] = 'O';
		}

		else if (number1 == 8 && gBoard[2][2] != 'X') {
			gBoard[2][2] = 'O';
		} else {
			System.out.println("This Number is Used..Select another.");
		}
	}

	public void CheckWinner(char[][] gBoard, Scanner input) {
		// checking wining condition's using conditional statments
		// Horizontal Check "X"
		checkWinner(gBoard);
	}

	public static void checkWinner(char[][] gBoard) {
		if (gBoard[0][0] == 'X' && gBoard[0][1] == 'X' && gBoard[0][2] == 'X') {
			System.out.println("Game is Over..X is win!");
		} else if (gBoard[1][0] == 'X' && gBoard[1][1] == 'X' && gBoard[1][2] == 'X') {
			System.out.println("Game is Over..X is win!");
		} else if (gBoard[2][0] == 'X' && gBoard[2][1] == 'X' && gBoard[2][2] == 'X') {
			System.out.println("Game is Over..X is win!");
		}
		// Vertical Check "X"
		else if (gBoard[0][0] == 'X' && gBoard[1][0] == 'X' && gBoard[1][0] == 'X') {
			System.out.println("Game is Over..X is win!");
		} else if (gBoard[0][1] == 'X' && gBoard[1][1] == 'X' && gBoard[1][1] == 'X') {
			System.out.println("Game is Over..X is win!");
		} else if (gBoard[0][2] == 'X' && gBoard[1][2] == 'X' && gBoard[2][2] == 'X') {
			System.out.println("Game is Over..X is win!");
		}

		// Diagonal Check "X"
		else if (gBoard[0][0] == 'X' && gBoard[1][1] == 'X' && gBoard[2][2] == 'X') {
			System.out.println("Game is Over..X is win!");
		} else if (gBoard[0][2] == 'X' && gBoard[1][1] == 'X' && gBoard[2][0] == 'X') {
			System.out.println("Game is Over..X is win!");
		}
		// Horizontal Check "O"
		else if (gBoard[0][0] == 'O' && gBoard[0][1] == 'O' && gBoard[0][2] == 'O') {
			System.out.println("Game is Over..O is win!");
		} else if (gBoard[1][0] == 'O' && gBoard[1][1] == 'O' && gBoard[1][2] == 'O') {
			System.out.println("Game is Over..O is win!");
		} else if (gBoard[2][0] == 'O' && gBoard[2][1] == 'O' && gBoard[2][2] == 'O') {
			System.out.println("Game is Over..O is win!");
			// Vertical Check "O"
		} else if (gBoard[0][0] == 'O' && gBoard[1][0] == 'O' && gBoard[2][0] == 'O') {
			System.out.println("Game is Over..O is win!");
		} else if (gBoard[0][1] == 'O' && gBoard[1][1] == 'O' && gBoard[2][1] == 'O') {
			System.out.println("Game is Over..O is win!");
		} else if (gBoard[0][2] == 'O' && gBoard[1][2] == 'O' && gBoard[2][2] == 'O') {
			System.out.println("Game is Over..O is win!");
		}
		// Diagonal Check "O"
		else if (gBoard[0][0] == 'O' && gBoard[1][1] == 'O' && gBoard[2][2] == 'O') {
			System.out.println("Game is Over..O is win!");
		} else if (gBoard[0][2] == 'O' && gBoard[1][1] == 'O' && gBoard[2][0] == 'O') {
			System.out.println("Game is Over..O is win!");
		} else {

			System.out.println("Game is Over!");
		}
	}

	private static void printBoard(char[][] gBoard) {
		System.out.println(gBoard[0][0] + " | " + gBoard[0][1] + " | " + gBoard[0][2]);
		System.out.println("-----------");
		System.out.println(gBoard[1][0] + " | " + gBoard[1][1] + " | " + gBoard[1][2]);
		System.out.println("-----------");
		System.out.println(gBoard[2][0] + " | " + gBoard[2][1] + " | " + gBoard[2][2]);
	}
}
