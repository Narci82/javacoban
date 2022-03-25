/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacban.donglenh;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class pheptoansothuc {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");       
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        double c = a + b;
        System.out.println("Phep tinh "+ a +"+" + b +" = " + c);
         c = a - b;
        System.out.println("Phep tinh "+ a +"-" + b +" = " + c);
         c = a * b;
        System.out.println("Phep tinh "+ a +"*" + b +" = " + c);
        if(b!=0){ 
            c = a / b;
            System.out.println("Phep tinh "+ a +"/" + b +" = " + c);
             c = a % b;
            System.out.println("Phep tinh "+ a +"%" + b +" = " + c);
        }
    }
}
