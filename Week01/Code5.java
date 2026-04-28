/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana01_miguelalvarado;

/**
 *
 * @author mikel
 */
public class Code5 {
    public static void main(String[] args) {

        System.out.println("Loop 2:");
        int x=15;
        while(x<22)
        {
            x++;
            if(x % 2 == 0)
                continue;
            System.out.println("Bye!");
        }
        System.out.println(x);
    }
}
