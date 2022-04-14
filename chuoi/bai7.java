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
public class bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        int i, count = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        System.out.print("Chuoi sau dao nguoc: ");
        i = str.length();
        while(i>0){
            
            System.out.print(str.charAt(i-1));
            i--;
        }System.out.print("\n");
    }
    
}
