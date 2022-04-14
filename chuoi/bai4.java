/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.chuoi;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        int i;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        String[] arr = str.split(" ");
        
        for (String tu : arr){           
            System.out.println("Cac tu la: "+tu);
        }
    }
    
}
