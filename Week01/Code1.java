/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana01_miguelalvarado;

/**
 *
 * @author mikel
 */
public class Code1 {
    public static void main(String[] args) {

        System.out.println("Loop 1:");
        int x = 9;
        int y = 7;

        for(int z = x + y; z > 1; z--) {
            System.out.println(z);
            if(z == 5)
                break;
            y = y + z;
        }

        System.out.println(y);
    }
}