package gr.aueb.cf.projects;

/**
 * Game of tic-tac-toe.
 */
public class Project4 {
    public static char[][] board = new char[3][3];
    public static int round;
    public static int numberOfTurns = 0;

    public static void main(String[] args) {

        //emptys array of null symbols.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        displayRound();
        loadBoardGraphics();
        playerTurn();

        displayRound();
        loadBoardGraphics();
        playerTurn();

        displayRound();
        loadBoardGraphics();
        playerTurn();

        //Ask player to move
//        printPlayerMessage();
        //insert move to array.
        //check for win (after total move 5 or player move 3)
            //horizontal check
            //vertical check
            //diagonal check
            //ending of game check
        //write message.
    }

    public static void displayRound() {
        round++;
        System.out.print("ROUND: " + round);
        System.out.println();

    }

    public static void loadBoardGraphics() {
        char c = ' ';
        System.out.printf(
                "     1     2     3   \n" +
                "        |     |      \n" +
                "A    %c  |  %c  |  %c\n" +
                "   _____|_____|_____ \n" +
                "        |     |      \n" +
                "B    %c  |  %c  |  %c\n" +
                "   _____|_____|_____ \n" +
                "        |     |      \n" +
                "C    %c  |  %c  |  %c\n\n",
                board[0][0], board[0][1], board[0][2],
                board[1][0], board[1][1], board[1][2],
                board[2][0], board[2][1], board[2][2]
                );
    }

    public static void playerTurn() {
        numberOfTurns++;
        if (numberOfTurns % 2 != 0) {
            System.out.println("Player1, move: " + numberOfTurns);

        } else {
            System.out.println("Player2, move: " + numberOfTurns);
        }
        System.out.println("Choose a square:");
//        getBoardInput;
        System.out.println("Choose: X or O\n");
        //getMoveInput;
    }
}
