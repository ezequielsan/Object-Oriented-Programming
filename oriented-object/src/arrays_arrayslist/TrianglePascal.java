package arrays_arrayslist;

import java.util.Arrays;
import java.util.Scanner;

public class TrianglePascal {
  private int numeroLinhas;
  private int[][] triangle;

  TrianglePascal(int num) {
    this.numeroLinhas = num;
    this.triangle = new int[num][];

    for (int i = 0; i < num; i++) {
      this.triangle[i] = new int[i + 1];
    }

    initTriangle();
  }

  private void initTriangle() {
    int i, j;

    this.triangle[0][0] = 1;

    for (i = 1; i < this.triangle.length; i++) {

      this.triangle[i][0] = 1;
      this.triangle[i][i] = 1;

      for (j = 1; j < i; j++) {
        this.triangle[i][j] = this.triangle[i - 1][j] + this.triangle[i - 1][j - 1];
      }

    }
  }

  public void printTriangle() {
    for (int i = 0; i < this.numeroLinhas; i++) {
      System.out.println(Arrays.toString(this.triangle[i]));
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Informe a quantidad de linhas que quer ver do triângulo de pascal: ");
    int l = in.nextInt();

    TrianglePascal pascal = new TrianglePascal(l);

    pascal.printTriangle();
  }

}
