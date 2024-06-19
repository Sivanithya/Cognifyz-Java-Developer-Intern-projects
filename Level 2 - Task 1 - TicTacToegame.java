package Level2;

import java.util.Scanner;

public class TicTacToegame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my Tic-Tac-Toe game");

        boolean playAgain = true;

        while (playAgain) {
            char[][] board = initializeBoard();
            char currentPlayer = 'X';
            boolean gameEnded = false;

            while (!gameEnded) {
                printBoard(board);
                playerMove(board, currentPlayer);
                gameEnded = checkWinner(board, currentPlayer);

                if (!gameEnded) {
                    currentPlayer = switchPlayer(currentPlayer);
                }
            }

            playAgain = askToPlayAgain(sc);
        }

        System.out.println("Thanks for playing My Tic-Tac-Toe game!!");
        sc.close();
    }

   
    public static char[][] initializeBoard() {
        return new char[][]{
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
    }

    
    public static void printBoard(char[][] board) {
        System.out.println("  0 1 2");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) System.out.print("|");
            }
            System.out.println();
            if (i < board.length - 1) System.out.println("  -----");
        }
    }

    
    public static void playerMove(char[][] board, char player) {
        Scanner sc = new Scanner(System.in);
        int row = -1, col = -1;
        boolean validMove = false;

        while (!validMove) {
            System.out.print("Player " + player + ", enter your move (row and column): ");
            row = sc.nextInt();
            col = sc.nextInt();

            if (isMoveValid(board, row, col)) {
                board[row][col] = player;
                validMove = true;
            } else {
                System.out.println("This move is not valid.");
            }
        }
    }

    
    public static boolean isMoveValid(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    
    public static boolean checkWinner(char[][] board, char player) {
        if (hasPlayerWon(board, player)) {
            printBoard(board);
            System.out.println("Player " + player + " wins!");
            return true;
        }

        if (isBoardFull(board)) {
            printBoard(board);
            System.out.println("The game is a draw!");
            return true;
        }

        return false;
    }

   
    public static boolean hasPlayerWon(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    
    public static char switchPlayer(char currentPlayer) {
        return (currentPlayer == 'X') ? 'O' : 'X';
    }

    
    public static boolean askToPlayAgain(Scanner sc) {
        System.out.print("Do you want to play again? (yes/no): ");
        String response = sc.nextLine().toLowerCase();
        return response.equals("yes");
    }
}
