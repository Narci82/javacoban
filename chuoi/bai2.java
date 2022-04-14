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
public class bai2 {

    //In hoa ky tu dau cua moi tu
    public static void main(String[] args) {
        // TODO code application logic here
        String m;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        m = sc.nextLine();
        String[] arr = m.split(" ");
        m = "";
        for (i = 0; i< arr.length;i++){
            char tu = Character.toUpperCase(arr[i].charAt(0));//Vi tri lay chu in hoa
            m += " "+ tu + arr[i].substring(1);//Vi tri thay
        }
        m = m.trim();
        System.out.println("Chuoi sau ki chuyen doi la: " +m);
    }
    
}
