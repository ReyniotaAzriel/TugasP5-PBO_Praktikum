/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum5;

/**
 *
 * @author rizky
 */
public class TriangleBintang {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("Half Triangle : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Full Triangle : ");
        int m = 3;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) 
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) 
                System.out.print("*");
            
            System.out.println();
        }
        for (int i = m - 1; i >= 1; i--) {
            for (int j = 1; j <= m - i; j++) 
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++) 
                System.out.print("*");
            
            
            System.out.println();
        }
    }
}