/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.vonglap.vonglap3;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class bai4 {

    /**
     * @param args the command line arguments
     */
    //Bai 2.1 : P = 2x4x6x ... x2N
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so N: ");
        int n = sc.nextInt();
        int p = 1;
        for (int i =1; i<=n;i++){
            p = p*(2*i);
            System.out.println("Tong la: " +p);    
        }
        System.out.println("P = " +p);       
    }
    
}
