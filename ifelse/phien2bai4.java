/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donglenh.ifelse;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class phien2bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = new int[5];
        int i, sum = 0;
        double avg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 5 so: ");
         for(i = 0; i<arr.length; i++)
         {
             arr[i] = sc.nextInt();
             sum += arr[i];               
             
         } 
         System.out.println("Tong 5 so la: " +sum);
         avg = sum/5;
         System.out.println("Trung binh cong cua 5 so la "+sum+ " : 5 la: " +avg);
    }
    
}
