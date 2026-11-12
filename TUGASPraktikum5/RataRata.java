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

public class RataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah bilangan yang ingin diinput : ");
        int jumlah = input.nextInt();
        int total = 0;
        
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            total += input.nextInt();
        }
        
        float rataRata = total / jumlah;
        
        System.out.println("Total jumlah bilangan : " + total);
        System.out.println("Rata-rata : " + rataRata);
    }
}
