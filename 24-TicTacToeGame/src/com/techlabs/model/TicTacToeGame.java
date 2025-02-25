package com.techlabs.model;

public class TicTacToeGame {
    private IGameBoard gameBoard;
    private IGameLogic gameLogic;
    private IPlayer playerX;
    private IPlayer playerO;
    private IPlayer currentPlayer;

    public TicTacToeGame(IGameBoard gameBoard, IGameLogic gameLogic, IPlayer playerX, IPlayer playerO) {
        this.gameBoard = gameBoard;
        this.gameLogic = gameLogic;
        this.playerX = playerX;
        this.playerO = playerO;
        this.currentPlayer = playerX; 
    }

    public void startGame() {
        gameBoard.initializeBoard();
        System.out.println("Game started!");
    }

    public void makeMove(int x, int y) {
        if (gameBoard.isCellEmpty(x, y)) {
            gameBoard.placeMark(x, y, currentPlayer.getMark());
            if (gameLogic.checkWin(gameBoard, currentPlayer.getMark())) {
                System.out.println(currentPlayer.getName() + " wins!");
                return; 
            } else if (gameLogic.checkDraw(gameBoard)) {
                System.out.println("The game is a draw!");
                return; 
            }
            
            currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
        } else {
            System.out.println("Cell is already occupied!");
        }
    }

    public void resetGame() {
        gameBoard.initializeBoard();
        currentPlayer = playerX; 
        System.out.println("Game reset!");
    }

    public IPlayer getCurrentPlayer() {
        return currentPlayer;
    }
}
