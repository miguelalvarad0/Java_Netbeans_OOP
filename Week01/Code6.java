/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana01_miguelalvarado;

/**
 *
 * @author mikel
 */
public class Code6 {
    public static void main(String[] args) {
        System.out.println("Loop 1:");
        int c = 4;
        int d = 5;
        for(int p = c + d; p > 1; p--)
        {
            System.out.println(p);
            if(p == 5)
                break;
            d = d + p;
        }
        System.out.println(d);
    }
}
