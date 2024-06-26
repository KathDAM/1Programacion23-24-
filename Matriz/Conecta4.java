package Matriz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Conecta4 {
    private static final int ROWS = 4;
    private static final int COLUMNS = 4;
    private static final char EMPTY = '-';
    private static final char PLAYER1 = 'X';
    private static final char PLAYER2 = 'O';

    private char[][] board;

    public Conecta4() {
        board = new char[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            //System.out.print(i + " ");
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
   
        //System.out.print("  ");
        for (int j = 0; j < COLUMNS; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public boolean dropPiece(int column, char player) {
        if (column < 0 || column >= COLUMNS) {
            return false;
        }
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][column] == EMPTY) {
                board[i][column] = player;
                return true;
            }
        }
        return false;
    }

    public boolean checkWin(char player) {
        // Check horizontal
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= COLUMNS - 4; j++) {
                if (board[i][j] == player && board[i][j+1] == player && board[i][j+2] == player && board[i][j+3] == player) {
                    marcarLineaGanadora(i, j, i, j + 3);
                    return true;
                }
            }
        }
        // Check vertical
        for (int j = 0; j < COLUMNS; j++) {
            for (int i = 0; i <= ROWS - 4; i++) {
                if (board[i][j] == player && board[i+1][j] == player && board[i+2][j] == player && board[i+3][j] == player) {
                    marcarLineaGanadora(i, j, i + 3, j);
                    return true;
                }
            }
        }
        // Check diagonal (positive slope)
        for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = 0; j <= COLUMNS - 4; j++) {
                if (board[i][j] == player && board[i+1][j+1] == player && board[i+2][j+2] == player && board[i+3][j+3] == player) {
                    marcarLineaGanadora(i, j, i + 3, j + 3);
                    return true;
                }
            }
        }
        // Check diagonal (negative slope)
        for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = COLUMNS - 1; j >= 3; j--) {
                if (board[i][j] == player && board[i+1][j-1] == player && board[i+2][j-2] == player && board[i+3][j-3] == player) {
                    marcarLineaGanadora(i, j, i + 3, j - 3);
                    return true;
                }
            }
        }
        return false;
    }

    //Verifica si hay un empate en el juego
    public static boolean checkearLinea(char[][] board) { //checkDraw
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] == EMPTY) {
                    return false; 
                }
            }
        }
        return true; 
    }

    //Verifica cual es la linea ganadora en el juego y sustituye la linea por *
    private void marcarLineaGanadora(int rowStart, int colStart, int rowEnd, int colEnd) {
        // Mark diagonal (+ slope)
        int rowDelta = (rowEnd - rowStart) / 3;
        int colDelta = (colEnd - colStart) / 3;
        for (int i = rowStart, j = colStart; i <= rowEnd && j <= colEnd; i += rowDelta, j += colDelta) {
            board[i][j] = '*';
        }

        // Mark diagonal (- slope)
        rowDelta = (rowEnd - rowStart) / 3;
        colDelta = (colStart - colEnd) / 3;
        for (int i = rowStart, j = colStart; i <= rowEnd && j >= colEnd; i += rowDelta, j -= colDelta) {
            board[i][j] = '*';
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conecta4 game = new Conecta4();
        char currentPlayer = PLAYER1;

        System.out.println("¡Bienvenido al juego Conecta 4!");
        
        while (true) {
            System.out.println("Turno del jugador " + currentPlayer);
            game.printBoard();
            
            int column;
            while (true) {
                System.out.print("Elige una columna (0-3): ");
                try {
                    column = scanner.nextInt();

                    if (column >= 0 && column < COLUMNS) {
                        break;
                    } else {
                        System.out.println("¡Columna inválida! Debe ser un número entre 0 y 3.");
                    }
                } catch (InputMismatchException e){
                    System.out.println("Error: debes ingresar un número entero del 0 al 3");
                    scanner.nextLine();
                }
            }

            if (game.dropPiece(column, currentPlayer)) {
                if (game.checkWin(currentPlayer)) {
                    System.out.println("¡El jugador " + currentPlayer + " ha ganado!");
                    game.printBoard();
                    break;
                } else if (checkearLinea(game.board)) {
                    System.out.println("¡Empate!");
                    game.printBoard();
                    break;
                }
                currentPlayer = (currentPlayer == PLAYER1) ? PLAYER2 : PLAYER1;
            } else {
                System.out.println("¡Columna llena! Intenta de nuevo.");
            }
        }
       
        scanner.close();
        
    } 
}
