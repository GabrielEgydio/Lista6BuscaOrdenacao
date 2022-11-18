/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista6buscaordencao;

import java.util.Random;
import java.util.stream.IntStream;

/**
 *
 * @author Gabriel_Egydio
 */
public class Lista6BuscaOrdenacao {

    public static void main(String[] args) {
        //Elabore um Vetor com 500 elementos que deverá ser preenchida com elementos do tipo inteiro sorteados aleatoriamente, na faixa de 1 a 10.000 (Utilize a Classe Randon)
        int[] vector = IntStream.generate(() -> new Random().nextInt(1, 10000)).limit(500).toArray();
        
        //1) Ordene o vetor pelo método Insertion Sort
        int[] orderedVector = InsertionSort.sort(vector);
                
        //2) Faça a busca, pelo método binário, de um elemento sorteado , indicando a posição em que ele se encontra;
        int n1 = randomElement(orderedVector);            
        long startBinary = System.currentTimeMillis();
        Integer n1Position = BinarySearch.findIndex(n1, orderedVector);   
        
        //4) Comente no código o percentual de tempo gasto para cada busca. Em média 0ms gasto
        long timeBinary = System.currentTimeMillis() - startBinary;
        
        System.out.println("O primeiro número encontrado foi: " + n1 + ", na posição: " + n1Position + ", e o tempo para encontrar foi: " + timeBinary + "ms");
        
        //3) Faça a busca, pelo metodo sequencial, de um elemento sorteado, e indique a quantidade de elementos iguais a este presente na matriz.
        int n2 = randomElement(orderedVector);       
        
        long startSequential = System.currentTimeMillis();       
        int n2Count = SequentialSearch.countEquals(n2, orderedVector);
        
        //4) Comente no código o percentual de tempo gasto para cada busca. Em média 1ms gasto
        long timeSequential = System.currentTimeMillis() - startSequential;
        
        System.out.println("O segundo número encontrado foi: " + n2 + ", e foi encontrado: " + n2Count + " vezes, e o tempo para encontrar foi: " + timeSequential + "ms");
    }
    
    private static int randomElement(int[] elements) {
        int randomIten = new Random().nextInt(0, elements.length - 1);
        return elements[randomIten];
    } 
}
