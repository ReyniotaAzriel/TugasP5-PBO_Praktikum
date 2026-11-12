/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum5;

import java.util.Scanner;

/**
 *
 * @author rizky
 */
public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int max = 0; 
        int min = 0; 
        
        System.out.println("Masukkan 10 bilangan : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int bil = input.nextInt();
            
            if (i == 1) {
                max = bil;
                min = bil;
            } else {
                if (bil > max) {
                    max = bil;
                }
                if (bil < min) {
                    min = bil;
                }
            }
        }
        
        System.out.println("Bilangan terbesar : " + max);
        System.out.println("Bilangan terkecil : " + min);
    }
}