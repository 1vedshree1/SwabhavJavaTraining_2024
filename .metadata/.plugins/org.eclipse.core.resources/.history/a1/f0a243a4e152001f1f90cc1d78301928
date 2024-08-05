package com.techlabs.test;

import com.techlabs.model.*;
import java.util.Scanner;

public class TicTacToeGameTest {
    public static void main(String[] args) {
       
        IGameBoard gameBoard = new GameBoard();
        IGameLogic gameLogic = new GameLogic();
        IPlayer playerX = new Player("Player X", 'X');
        IPlayer playerO = new Player("Player O", 'O');

        
        TicTacToeGame game = new TicTacToeGame(gameBoard, gameLogic, playerX, playerO);
        Scanner scanner = new Scanner(System.in);

        while (true) {
           
            game.startGame();
            gameBoard.printBoard();
            boolean isGameRunning = true;

            while (isGameRunning) {
                IPlayer currentPlayer = game.getCurrentPlayer();
                System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (0, 1, or 2) separated by a space:");
                int row = scanner.nextInt();
                int col = scanner.nextInt();

               
                game.makeMove(row, col);
                gameBoard.printBoard();

               
                if (gameLogic.checkWin(gameBoard, currentPlayer.getMark())) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    isGameRunning = false;
                } else if (gameLogic.checkDraw(gameBoard)) {
                    System.out.println("The game is a draw!");
                    isGameRunning = false;
                } else {
                    
                    game.getCurrentPlayer(); 
                }
            }

           
            System.out.println("Game over. Do you want to play again? (yes/no)");
            String playAgain = scanner.next();
            if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing!");
                break;
            } else {
               
                game.resetGame();
                gameBoard.printBoard();
            }
        }

        
    }
}
