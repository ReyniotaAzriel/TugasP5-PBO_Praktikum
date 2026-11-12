/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPraktikum5;

/**
 *
 * @author rizky
 */
public class ArrayForeach {
    public static void main(String[] args) {
        String[] bahasaPemrograman = {"Java", "Python", "C++", "PHP", "JavaScript"};
        
        System.out.println("Isi array foreach:");
        
        for (String bahasa : bahasaPemrograman) {
            System.out.print(bahasa + " ");
        }
    }
}