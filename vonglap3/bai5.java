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
public class bai5 {

    /**
     * @param args the command line arguments
     */
    // Bai 2.2: P = 1x3x ... xN với N là số nguyên dương lẻ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so N: ");
        int n = sc.nextInt();
        int p = 1;
        for (int i =0; i<=n;i++){
            p = p*(2*i+1);
            //System.out.print("Tong la: " +p);    
        }
        System.out.println("P = " +p);
    }
    
}
