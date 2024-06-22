package vaibhav.systemdesign.questions.tictactoe;

import vaibhav.systemdesign.questions.tictactoe.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        // creating two players
//        Player player1 = new Player("Player1", new PlayingPiece(PieceType.O));
//        Player player2 = new Player("Player2", new PlayingPiece(PieceType.O));
        players = new LinkedList<>();

        Player player1 = new Player("Player1", new PlayingPiece0());
        Player player2 = new Player("Player2", new PlayingPieceX());

        players.add(player1);
        players.add(player2);

        //initialize board
        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            //get the free space from the board
            gameBoard.printBoard();
            List<Pair> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            // read the user input
            System.out.println("Player: " + playerTurn.name + " Enter row, col");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] split = s.split(",");
            int row = Integer.parseInt(split[0]);
            int col = Integer.parseInt(split[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(row, col, playerTurn.playingPiece);
            if (!pieceAddedSuccessfully) {
                System.out.println("Incorrect position chosen. Try again!");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(row, col, playerTurn.playingPiece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int col, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // check in row
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //check in column
        for (int i = 0; i < gameBoard.size; i++) {
            if (gameBoard.board[i][col] == null || gameBoard.board[i][col].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //check in diagonal
        for (int i = 0, j = 0; i < gameBoard.size; i++, j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        // check in anti diagonal
        for (int i = 0, j = gameBoard.size - 1; i < gameBoard.size; i++, j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
