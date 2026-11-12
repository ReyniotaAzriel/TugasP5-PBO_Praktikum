/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum5;

/**
 *
 * @author rizky
 */
public class PerbedaanIncrement {
    public static void main(String[] args) {
        System.out.println("i++ : ");
        int i = 0;
        while (i < 3) {
            // Nilai i dicetak terlebih dahulu, baru weh ditambah 1 
            System.out.println("Nilai i: " + (i++)); 
        }
        
        System.out.println("");
        System.out.println("++i : ");
        int j = 0;
        while (j < 3) {
            // Nilai j ditambah 1 dulu, baru deh dicetak
            System.out.println("Nilai j: " + (++j)); 
        }
    }
}