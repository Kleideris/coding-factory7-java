package gr.aueb.cf.projects;

import java.util.Scanner;

/**
 * Game of tic-tac-toe.
 *
 * @author klei
 */
public class Project4 {
    public static String[][] board = new String[3][3];
    public static Scanner in = new Scanner(System.in);
    public static int round = 0;
    public static int players = 2;

    public static void main(String[] args) {
        boolean gameOver = false;
        String moveInput = " ";


        emptyBoard();
        System.out.println("Game Start\n");
        displayRound();
        loadBoardGraphics();

        while (!gameOver) {
            players = decidePlayer(players);
            System.out.printf("Player %d: ", players);

            System.out.println("Choose a square:");
            String chosenSquare = getPosition();

            if (round == 1) {
                System.out.println("Choose: X or O\n");
                moveInput = getMoveInput();
            } else {
                moveInput = moveInput.equals("X") ? "O" : "X";
            }

            updateBoard(chosenSquare, moveInput);
            displayRound();
            loadBoardGraphics();

            if (checkWinCondition()) {
                printWinMessage(round);
                System.out.println("Thanks for playing!");
                gameOver = true;
            } else if (round == 10) {
                System.out.println("The game ended in a stalemate.\n");
                System.out.println("Thanks for playing!");
                gameOver = true;
            }
        }
    }

    public static void emptyBoard() {

        //empties board of null symbols.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }
    }

    public static void displayRound() {
        System.out.print("ROUND: " + round);
        System.out.println();
        round++;
    }

    public static void loadBoardGraphics() {
        System.out.printf(
                """
                             1     2     3
                                |     |
                        A    %s  |  %s  |  %s
                           _____|_____|_____
                                |     |
                        B    %s  |  %s  |  %s
                           _____|_____|_____
                                |     |
                        C    %s  |  %s  |  %s
                        
                        """,
                board[0][0], board[0][1], board[0][2],
                board[1][0], board[1][1], board[1][2],
                board[2][0], board[2][1], board[2][2]
                );
    }

    public static int decidePlayer(int players) {
        return (players == 2) ? 1 : 2;
    }

    public static String getPosition() {
        while (true) {
            String chosenSquare = in.nextLine();
            if (chosenSquare.length() != 2) {
                System.out.println("Square position must be one of: \"A1\"-\"C3\" squares");
                continue;
            }

            char xPosition = chosenSquare.charAt(0);

            if ((xPosition - 'A') < 0 || (xPosition - 'A') > 3) {
                System.out.println("Row coordinates must be either \"A\", \"B\" or \"C\"");
                continue;
            }

            int yPosition = chosenSquare.charAt(1);

            if ((yPosition - '1') < 0 || (yPosition - '1') > 3) {
                System.out.println(yPosition - '1');
                System.out.println("Column coordinates must be either \"1\", \"2\" or \"3\"");
                continue;
            }

            if (!board[xPosition - 'A'][yPosition - '1'].equals(" ")) {
                System.out.println("The square " + chosenSquare + " is full.. Please choose an empty square:");
                continue;
            }
            return chosenSquare;
        }
    }

    public static String getMoveInput() {
        while (true) {
            String playerMove = in.nextLine();

            if (playerMove.length() != 1) {
                System.out.println("Please insert a single character: Either X or O");
                continue;
            }

            if (!playerMove.equals("X") && !playerMove.equals("O")) {
                System.out.println("You must choose either X or O");
                continue;
            }

            return playerMove;
        }
    }

    public static void updateBoard(String chosenSquare, String playerMove) {
        int xPosition = chosenSquare.charAt(0);
        int yPosition = chosenSquare.charAt(1);

        //Array index conversion of x and y
        xPosition = xPosition - 'A';
        yPosition = yPosition - '1';

        board[xPosition][yPosition] = playerMove;
    }

    public static boolean checkWinCondition() {
        int xSymbols; int oSymbols;
        boolean isGameWon = false;

        //horizontal win check:
        for (int i = 0; i < 3; i++) {
            xSymbols = 0; oSymbols = 0;

            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals("X")) {
                    xSymbols++;
                } else if (board[i][j].equals("O")) {
                    oSymbols++;
                }

                if (xSymbols == 3 || oSymbols == 3) {
                    isGameWon = true;
                }
            }
        }

        //vertical win check:
        for (int j = 0; j < 3; j++) {
            xSymbols = 0; oSymbols = 0;

            for (int i = 0; i < 3; i++) {
                if (board[i][j].equals("X")) {
                    xSymbols++;
                } else if (board[i][j].equals("O")) {
                    oSymbols++;
                }
                if (xSymbols == 3 || oSymbols == 3) {
                    isGameWon = true;
                }
            }
        }

        //diagonal win checks:
        xSymbols = 0; oSymbols = 0;
        for (int i = 0; i < 3; i++) {
            if (board[i][i].equals("X")) {
                xSymbols++;
            } else if (board[i][i].equals("O")) {
                oSymbols++;
            }
            if (xSymbols == 3 || oSymbols == 3) {
                isGameWon = true;
            }
        }

        xSymbols = 0; oSymbols = 0;
        for (int i = 0; i < 3; i++) {
            if (board[2 - i][i].equals("X")) {
                xSymbols++;
            } else if (board[2 - i][i].equals("O")) {
                oSymbols++;
            }
            if (xSymbols == 3 || oSymbols == 3) {
                isGameWon = true;
            }
        }

        return isGameWon;
    }

    public static void printWinMessage(int round) {
        int player = (round + 1) % 2;
        System.out.printf("Player: %d, Won the game!!\n\n", player);
    }
}

//todo: add option to surrender with q.