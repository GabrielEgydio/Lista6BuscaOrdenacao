/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista6buscaordencao;

/**
 *
 * @author Gabriel_Egydio
 */
public class BinarySearch {
    public static Integer findIndex(int desiredItem, int[] items) {
        int left = 0;
        int right = items.length - 1;
        int mid;
        
        while (left <= right) {
            mid = (left + right) / 2;
            
            if (desiredItem == items[mid])
                return mid;
            
            if (desiredItem < items[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        
        return null;
    }
}
