package arrays_arrayslist;

import java.util.Scanner;

public class MatrixManipulations {
  private static Scanner in = new Scanner(System.in);

  public static void main(String[] args) {

    int n = in.nextInt();
    int[][] matriz = new int[n][n];

    preencheMatrix(matriz);
    printMatrix(matriz);

    System.out.println("Quantidade de Negativos: " + qntNegativos(matriz));
    System.out.print("Diagonal principal: ");
    printDiagonalPrincipal(matriz);

    System.out.println("================================");

    // Matriz irregular
    int[][] m2 = { { 6, 8, 1, 4 }, { 5 }, { 6, 7 }, { 7, 1, 0 } };

    printMatrix(m2);

  }

  public static void preencheMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = in.nextInt();
      }
    }
  }

  public static void printMatrix(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        System.out.print(m[i][j] + " ");
      }

      System.out.print("\n");
    }
  }

  public static int qntNegativos(int[][] m) {
    int qnt = 0;

    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (m[i][j] < 0) {
          qnt++;
        }
      }
    }

    return qnt;
  }

  public static void printDiagonalPrincipal(int[][] m) {
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        if (i == j) {
          System.out.printf("%d ", m[i][j]);
        }
      }
    }

    System.out.println();
  }
}