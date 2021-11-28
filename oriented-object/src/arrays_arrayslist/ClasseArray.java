package arrays_arrayslist;

import java.util.Arrays;

public class ClasseArray {
  public static void main(String[] args) {
    int[] array = new int[10];
    int[] array2 = new int[5];

    initArray(array);
    System.out.println(Arrays.toString(array));

    /**
     * @method sort() ordena uma array em ordem crescente
     * @params um array (por referência)
     * @return void
     */
    Arrays.sort(array);
    
    /**
     * @method toString() imprime os elementos do array
     * @params o array a ser impresso os elementos
     * @return Uma string dos elementos do array
     */
    System.out.println(Arrays.toString(array));

    /**
     * @method binarySearch() busca um valor especifico no array
     * @params o array a ser pesquisado e o valor a ser encontrado
     * @return o indice
     */
    Integer i = Arrays.binarySearch(array, 3);
    if (i >= 0)
      System.out.println("indice: " + i);
    else
      System.out.println("Valor nao encontrado.");
    
    /**
     * @method copyOff copia os valores de uma arrya para outro
     * @params array que sera copiado e quantidade de elementos que sera copiado
     * @return um novo array com todos os elementos copiados
     */
    array2 = Arrays.copyOf(array, array.length);
    
    /**
     * @method fill preenche um array partindo de um determinado ponto, 
     * até determinado ponto, com um valor especifico.
     * @params array ser preenchido(por referência), indice do ponto de partida, 
     * indice do ponto de parada e elemento que sera preenchido no array.
     * @return void
     */
    Arrays.fill(array2, array2.length - 1, array2.length, 7);
    
    System.out.println(Arrays.equals(array, array2));
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(array2));
   
  }

  // Iniaciliza um array com valores aleatórios
  public static void initArray(int[] array) {
    for (int i = 0; i < array.length; i++)
      array[i] = (int) Math.floor(Math.random() * 10);
  }

}
