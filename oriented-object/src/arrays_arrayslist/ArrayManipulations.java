package arrays_arrayslist;

public class ArrayManipulations {

  public static void main(String[] args) {

    // Declarando e inicializando um array
    int[] arr = new int[100];

    // chamando método que atribui valores ao array
    arr = init(arr);

    // Usando método que recebe parâmetros variados
    numeros("V1", 1);
    numeros("V2", 3, 5, 7);
    numeros("V3", 5, 7, 9, 11, 13);
    numeros("V4", 7, 9, 11, 13, 15, 17, 19);
    numeros("V4", 9, 11, 13, 15, 17, 19, 21, 23, 25);
  }

  public static int[] init(int[] arr) {
    int[] arr2 = new int[arr.length];

    for (int i = 0; i < arr2.length; i++) {
      arr2[i] = (int) Math.floor(Math.random() * 10);
    }

    return arr2;
  }

  public static void print(int[] arr) {
    for (double i : arr) {
      System.out.println(i);
    }
  }

  public static void numeros(String s, int... numeros) {
    System.out.printf("%s: [ ", s);

    for (int i : numeros) {
      System.out.printf("%d ", i);
    }

    System.out.printf("]\n");
  }
}
