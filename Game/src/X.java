import java.security.PublicKey;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-3
 *
 */
public class X {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Printing a gBoard
		// initialize array with its element
		char[][] gBoard = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };
int i;
int j;
		// Create a Game gBoard
		printBoard(gBoard);// R.C ==>Ref ==> Ext-Method
		Scanner input = new Scanner(System.in);
		
		while (true) {

			for (i=0; i<gBoard.length; i++) {
				for (j=0; j<gBoard[i].length;j++) {
					if (playerTurn(gBoard, 'X', i, j);{
						printBoard(gBoard);
					}
				}
			}
			
		}
		
	}
	
	private static void playerTurn(char[][] gBoard, int input, int rowIndex, int colIndex) {
		playerTurn(gBoard, input, rowIndex, colIndex);

//		else if (num == 1 && gBoard[0][1] == ' ') {
//			gBoard[0][1] = 'X';
//		}
//
//		else if (num == 2 && gBoard[0][2] == ' ') {
//			gBoard[0][2] = 'X';
//		}
//
//		else if (num == 3 && gBoard[1][0] == ' ') {
//			gBoard[1][0] = 'X';
//		}
//		else if (num == 4 && gBoard[1][1] == ' ') {
//			gBoard[1][1] = 'X';
//		} 
//		else if (num == 5 && gBoard[1][2] == ' ') {
//			gBoard[1][2] = 'X';
//		}
//
//		else if (num == 6 && gBoard[2][0] == ' ') {
//			gBoard[2][0] = 'X';
//		} 
//		else if (num == 7 && gBoard[2][1] == ' ') {
//			gBoard[2][1] = 'X';
//		}
//
//		else if (num == 8 && gBoard[2][2] == ' ') {
//			gBoard[2][2] = 'X';
//		} 
//		else {
//			
//			System.out.println("In Valid Number");
//		}
	}

	private static void playerTurn(char[][] gBoard, int input, int rowIndex, int colIndex) {
		System.out.println("Select Number from (0-8): ");

		int num = input.nextLine();
		
   
		if (num == 0 && gBoard[rowIndex][colIndex] == ' ') {
			gBoard[rowIndex][colIndex] = 'X';
		}
	}
	private static boolean move(char[][] gBoard, char place) {
		if (place == '1') {
		return (gBoard[0][0] == ' ');
		}
		else if (place == '2') {
			return (gBoard[0][1] == ' ');
		}
		
		else if (place == '3') {
		return (gBoard[0][2] == ' ');
		}
		else if (place == '4') {
		return (gBoard[1][0] == ' ');
		}
		else if (place == '5') {
		return (gBoard[1][1] == ' ');
		}
		else if (place == '6') {
		return (gBoard[1][2] == ' ');
		}
		else if (place == '7') {
		return (gBoard[2][0] == ' ');
		}
		else if (place == '8') {
		return (gBoard[2][1] == ' ');
		}
		else if (place == '9') {
		return (gBoard[2][2] == ' ');
		}
		else {
		return false;
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