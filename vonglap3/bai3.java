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
public class bai3 {

    /**
     * @param args the command line arguments
     */
    //Bai 1.3 : S = 1 + 1/2 + 1/3 +...+1/n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so N: ");
        int n = sc.nextInt();
        double s = 0;
        for (int i =1; i<=n;i++){
            s = s+(1.0/i);
            //System.out.println("Tong la: " +s);    
        }
        System.out.println("S = " +s);     
    }
    
}
