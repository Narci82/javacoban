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
public class bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        int d, count = 0;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        System.out.println("Nhap ky tu: ");
        ch = sc.next().charAt(0);
        for (int i = 0; i< str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
                System.out.println("Vi tri xuat hien: " +i);
            }           
        }
        System.out.println("So lan xuat hien cua "+ch+ " la: "+count);
    }
    
}
