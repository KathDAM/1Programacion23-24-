package Matriz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Conecta4Aleatorio {
    static Scanner scanner = new Scanner(System.in);
    private static final int ROWS = 4;
    private static final int COLUMNS = 4;
    private static final char EMPTY = '-';
    private static final char PLAYER1 = 'X';
    private static final char PLAYER2 = 'O';

    private char[][] board;

    public Conecta4Aleatorio() {
        board = new char[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < ROWS; i++) {
            // System.out.print(i + " ");
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.print(" ");
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
                if (board[i][j] == player && board[i][j + 1] == player && board[i][j + 2] == player
                        && board[i][j + 3] == player) {
                    markWinningLine(i, j, i, j + 3);
                    return true;
                }
            }
        }
        // Check vertical
        for (int j = 0; j < COLUMNS; j++) {
            for (int i = 0; i <= ROWS - 4; i++) { //revisar for
                if (board[i][j] == player && board[i + 1][j] == player && board[i + 2][j] == player
                        && board[i + 3][j] == player) {
                    markWinningLine(i, j, i + 3, j);
                    return true;
                }
            }
        }
        // Check diagonal (positive slope)
        for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = 0; j <= COLUMNS - 4; j++) {
                if (board[i][j] == player && board[i + 1][j + 1] == player && board[i + 2][j + 2] == player
                        && board[i + 3][j + 3] == player) {
                    markWinningLine(i, j, i + 3, j + 3);
                    return true;
                }
            }
        }
        // Check diagonal (negative slope)
        for (int i = 0; i <= ROWS - 4; i++) {
            for (int j = COLUMNS - 1; j >= 3; j--) {
                if (board[i][j] == player && board[i + 1][j - 1] == player && board[i + 2][j - 2] == player
                        && board[i + 3][j - 3] == player) {
                    markWinningLine(i, j, i + 3, j - 3);
                    return true;
                }
            }
        }
        return false;
    }

    //EMPATE
    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                board[i][j] = '*';
            }
        }
        return true;
    }

    //MARCA LA LINEA GANADORA
    private void markWinningLine(int rowStart, int colStart, int rowEnd, int colEnd) {
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

    public int getColumn(Random random, char currentPlayer) {
        while (true) {
            try {
                if (currentPlayer == PLAYER1) {
                    System.out.print("Elige una columna (0-3): ");
                    int column = scanner.nextInt();

                    if (column >= 0 && column < COLUMNS) {
                        return column;
                    } else {
                        System.out.println("¡Columna inválida! Debe ser un número entre 0 y 3.");
                    }
                } else {
                    int column = random.nextInt(COLUMNS);
                    System.out.println("El jugador O ha elegido la columna: " + column);
                    return column;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: debes ingresar un número entero del 0 al 3");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Conecta4Aleatorio game = new Conecta4Aleatorio();
        char currentPlayer = PLAYER1;

        System.out.println("¡Bienvenido al juego Conecta 4!");
        while (true) {
            System.out.println("Turno del jugador " + currentPlayer);
            game.printBoard();
        
            int column = game.getColumn(random, currentPlayer);
        
            if (game.dropPiece(column, currentPlayer)) {
                if (game.checkWin(currentPlayer)) {
                    System.out.println("¡El jugador " + currentPlayer + " ha ganado!");
                    game.printBoard();
                    break;
                } else if (checkDraw(game.board)) {
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
