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
public class phien2bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao nam: ");
        y = sc.nextInt();        
        if(y<1){
            System.out.println("Nhap lai");            
        }if(y%400 == 0 || (y% 4 == 0 && y %100!= 0)){
            System.out.println(y + " la nam nhuan");//Nam nhuan 2004
        }
        else {System.out.println( y +" la nam khong nhuan");}//nam khong nhuan   
    }
    
}
