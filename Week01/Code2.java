/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana01_miguelalvarado;

/**
 *
 * @author mikel
 */
public class Code2 {
    public static void main(String[] args) {

        System.out.println("\nLoop 2:");
        int a=25;
        while(a<50) {
            a++;
            if(a % 3 == 0)
                continue;
            System.out.println("Oh my!");
        }
    

        System.out.println(a);
    }
}
