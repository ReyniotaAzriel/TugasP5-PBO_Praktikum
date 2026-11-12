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

public class AngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();
        
        int total = 0;
        int angkaGanjil = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(angkaGanjil + " ");
            total += angkaGanjil;
            angkaGanjil += 2;
        }
        
        System.out.println("");
        System.out.println("Total penjumlahan : " + total);
    }
}