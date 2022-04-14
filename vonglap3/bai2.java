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
public class bai2 {

    /**
     * @param args the command line arguments
     */
    // Bai 1.2 : S = 1 + 3 + 5 + ⋯ + N với N là số nguyên dương lẻ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so N: ");
        int n = sc.nextInt();
        int s = 0;
        for (int i =0; i<=n;i++){
            s = s+(2*i+1);
            //System.out.println("Tong la: " +s);    
        }
        System.out.println("S = " +s);       
    }
    
}
