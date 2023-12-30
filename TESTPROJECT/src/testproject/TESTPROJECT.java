/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproject;

import java.util.Scanner;

/**
 *
 * @author tabah
 */
public class TESTPROJECT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Xin chào ");
        Scanner Sc= new Scanner(System.in);
        int n=Sc.nextInt();
        if(n % 2==0){
            System.out.println(n+" là số chẵn");
        } else System.out.println(n+" là số lẻ");
    }
    
}
