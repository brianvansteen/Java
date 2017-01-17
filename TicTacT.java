import java.util.Scanner;

class TicTacT {
	
	// Array to hold X or O in each space; default value '_'
	public static char[] place = { '_', '_', '_', '_', '_', '_', '_', '_', '_' };
	
	public static char team = '_';
	public static char opp = '_';
		
	// Variable to hold user input
	public static String usrStr;
	
	public static void main (String[] args) {
		
		System.out.println("Welcom to Tic Tac Toe!\n");
		
		setup();
	
	}
	
	public static void drawBoard() {
		
		// Drawing the game board
		System.out.println("\t    A   B   C");
		System.out.println("\t .-----------.\n");
		System.out.println("\t1 |_"+TicTacT.place[0]+"_|_"+TicTacT.place[1]+"_|_"+TicTacT.place[2]+"_|\n");
		System.out.println("\t2 |_"+TicTacT.place[3]+"_|_"+TicTacT.place[4]+"_|_"+TicTacT.place[5]+"_|\n");
		System.out.println("\t3 |_"+TicTacT.place[6]+"_|_"+TicTacT.place[7]+"_|_"+TicTacT.place[8]+"_|\n");
		System.out.println("\t '-----------'");
		
	}
	
	public static void setup() {
		
		for ( int i = 0; i < 9; i++) {
			
			TicTacT.place[i] = '_';
			
		}
		
		drawBoard();
		
		while ( (TicTacT.team != 'X') && (TicTacT.team != 'O') ) {
			
			System.out.println("\n\nSelect Your Team! Enter 'X' or 'O' below...");
			System.out.println("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			TicTacT.usrStr = input.next();
			
			if (TicTacT.usrStr.toUpperCase().equals("X")) {
				
				TicTacT.team = 'X';
				TicTacT.opp = 'O';
				
			} else if (TicTacT.usrStr.toUpperCase().equals("O")) {
				
				TicTacT.team = 'O';
				TicTacT.opp = 'X';
				
			} else {
				
				System.out.println("You entered: " + usrStr);
				System.out.println("This is not a valid option.");
				System.out.println("Please enter either an X or an O to continue.");
				
			}
		}
		
		System.out.println("You are team: " + TicTacT.team + "!");
		
		// Ryun the game method.
		game();
	}
	
	public static void game() {
		
		boolean loop = true;
		
		System.out.println("It is your turn!");
		
		drawBoard();
		
		do {
			
			System.out.println("\n\nChoose a column and row to place an " + TicTacT.team + ".");
			System.out.println("For example, A1\n");
			
			System.out.print("Enter your selection: ");
			Scanner input = new Scanner(System.in);
			TicTacT.usrStr = input.next().toUpperCase();
			
			switch (TicTacT.usrStr)
			{
				case "A1" : if(TicTacT.place[0] == '_') {
					
					TicTacT.place[0] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in A1");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[0] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[0] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "B1" : if(TicTacT.place[1] == '_') {
					
					TicTacT.place[1] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in B1");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[1] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[1] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "C1" : if(TicTacT.place[2] == '_') {
					
					TicTacT.place[2] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in C1");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[2] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[2] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "A2" : if(TicTacT.place[3] == '_') {
					
					TicTacT.place[3] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in A2");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[3] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[3] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "B2" : if(TicTacT.place[4] == '_') {
					
					TicTacT.place[4] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in B2");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[4] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[4] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "C2" : if(TicTacT.place[5] == '_') {
					
					TicTacT.place[5] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in C2");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[5] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[5] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "A3" : if(TicTacT.place[6] == '_') {
					
					TicTacT.place[6] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in A3");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[6] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[6] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "B3" : if(TicTacT.place[7] == '_') {
					
					TicTacT.place[7] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in B3");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[7] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[7] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				case "C3" : if(TicTacT.place[8] == '_') {
					
					TicTacT.place[8] = TicTacT.team;
					System.out.println("\nYou placed an " + TicTacT.team + " in C3");
					oppMove();
					loop = false;
					
				} else if (TicTacT.place[8] == TicTacT.team) {
					
					System.out.println("\nThere is an " + TicTacT.team + " there already!");
					
				} else if (TicTacT.place[8] == TicTacT.opp) {
					
					System.out.println("\nThis space is already taken!");
					
				}; break;

				
			}
			
		} while (loop);
		
		checkWin();
	}
	
	public static void oppMove() {
		
		while (true) {
			
			if ( (TicTacT.place[0] == '_') || (TicTacT.place[1] == '_') || (TicTacT.place[2] == '_') || (TicTacT.place[3] == '_') || (TicTacT.place[4] == '_') || (TicTacT.place[5] == '_') || (TicTacT.place[6] == '_') || (TicTacT.place[7] == '_') || (TicTacT.place[8] == '_') ) {
				
				float rn = (float) Math.random();
				float m = rn * 8;
				int x = Math.round(m);
				
				if (TicTacT.place[x] == '_') {
					
					TicTacT.place[x] = TicTacT.opp;
					break;
					
				}
				
			} else { checkWin(); break; }
			
		}
		
	}
	
	public static void checkWin() {
		
		if ( (TicTacT.place[0] == 'X') && (TicTacT.place[1] == 'X') && (TicTacT.place[2] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[3] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[5] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[6] == 'X') && (TicTacT.place[7] == 'X') && (TicTacT.place[8] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[0] == 'X') && (TicTacT.place[3] == 'X') && (TicTacT.place[6] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[1] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[7] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[2] == 'X') && (TicTacT.place[5] == 'X') && (TicTacT.place[8] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[0] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[8] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[2] == 'X') && (TicTacT.place[4] == 'X') && (TicTacT.place[6] == 'X') ){
			
			System.out.println("\n\n\n\tX WINS!!!"); drawBoard(); playAgain();
			
		}
		
		if ( (TicTacT.place[0] == 'O') && (TicTacT.place[1] == 'O') && (TicTacT.place[2] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[3] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[5] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[6] == 'O') && (TicTacT.place[7] == 'O') && (TicTacT.place[8] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[0] == 'O') && (TicTacT.place[3] == 'O') && (TicTacT.place[6] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[1] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[7] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[2] == 'O') && (TicTacT.place[5] == 'O') && (TicTacT.place[8] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[0] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[8] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[2] == 'O') && (TicTacT.place[4] == 'O') && (TicTacT.place[6] == 'O') ){
			
			System.out.println("\n\n\n\tO WINS!!!"); drawBoard(); playAgain();
			
		} else if ( (TicTacT.place[0] != '_') && (TicTacT.place[1] != '_') && (TicTacT.place[2] != '_') && (TicTacT.place[3] != '_') && (TicTacT.place[4] != '_') && (TicTacT.place[5] != '_') && (TicTacT.place[6] != '_') && (TicTacT.place[7] != '_') && (TicTacT.place[8] != '_') ) {
			
			System.out.println("\n\n\n\tTIE GAME!!!!"); drawBoard(); playAgain(); System.out.println("\n\n");
			
		} else { game(); }
		
	}
	
	
	public static void playAgain() {
		
		System.out.print("\n\nPlay again? [y/n]: ");
		Scanner input = new Scanner(System.in);
		TicTacT.usrStr = input.next().toLowerCase();
		
		if (usrStr.equals("y")) {
			
			TicTacT.team = '_';
			TicTacT.opp = '_';
			setup();
			
		} else {
			
			System.exit(0);
			
		}
	}
	
}