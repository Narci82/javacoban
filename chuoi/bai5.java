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
public class bai5 {
    /**
     * @param args the command line arguments
     */
    //Thong ke so lan xuat hien tung ky tu trong chuoi
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        str = sc.nextLine();
        int count[] = new int[256];
 
        int len = str.length();
 
        // Initialize count array index
        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;
 
        // Create an array of given String size
        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
 
            if (find == 1)
                System.out.println(
                    "So lan xuat hien cua "
                    + str.charAt(i)
                    + " la:" + count[str.charAt(i)]);
        
    }
}
}

