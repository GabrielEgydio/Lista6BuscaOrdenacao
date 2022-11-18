/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6buscaordencao;

/**
 *
 * @author Gabriel_Egydio
 */
public class SequentialSearch {
    public static int countEquals(int desiredItem, int[] items) {
        int occurrences = 0;
        
        for (int i = 0; i < items.length; i++)
            if (desiredItem == items[i])
                occurrences++;
        
        return occurrences;
    }
}
