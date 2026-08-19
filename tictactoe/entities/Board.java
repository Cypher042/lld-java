package entities;

import enums.Symbol;

public class Board {

    // private static Board instance;   

    private final int n;
    public final Cell[][] grid;    
    public Board(int n) {
        this.n = n;
        this.grid = new Cell[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    // public static Board getInstance(int size) {
    //     if (instance == null) {
    //         instance = new Board(size);
    //     }
    //     return instance;
    // }

    public boolean isEmpty(int x, int y) {
        return grid[x][y].getValue() == Symbol.NONE;
    }
    
    public boolean isWinner(int x, int y) {
        Symbol symbol = grid[x][y].getValue();
        if (symbol == Symbol.NONE) {
            return false;
        }

        boolean rowWin = true;
        boolean colWin = true;
        boolean mainDiagonalWin = (x == y);
        boolean antiDiagonalWin = (x + y == n - 1);

        for (int i = 0; i < n; i++) {
            if (grid[x][i].getValue() != symbol) {
                rowWin = false;
            }
            if (grid[i][y].getValue() != symbol) {
                colWin = false;
            }
            if (mainDiagonalWin && grid[i][i].getValue() != symbol) {
                mainDiagonalWin = false;
            }
            if (antiDiagonalWin && grid[i][n - 1 - i].getValue() != symbol) {
                antiDiagonalWin = false;
            }
        }

        return rowWin || colWin || mainDiagonalWin || antiDiagonalWin;
    }
}