/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6buscaordencao;

/**
 *
 * @author Gabriel_Egydio
 */
public class InsertionSort {
    public static int[] sort(int[] items) {
        if (items == null)
            return new int[0];
        else if (items.length < 2)
            return items;
        
        for(int keyIndex = 1; keyIndex < items.length; keyIndex++) {
            int key = items[keyIndex];            
            int previousItemIndex = keyIndex - 1;
            
            while(previousItemIndex >= 0 && items[previousItemIndex] > key) {
                items[previousItemIndex + 1] = items[previousItemIndex];
                previousItemIndex = previousItemIndex - 1;
            }
            
            items[previousItemIndex + 1] = key;
        }
        
        return items;
    }   
}