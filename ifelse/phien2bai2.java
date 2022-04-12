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
public class phien2bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ky tu: ");
        
        String c = sc.next();
           //Xet mot ky tu
        if (c.length() == 1 && Character.isAlphabetic(c.charAt(0))){
            char d = Character.toLowerCase(c.charAt(0));
            if (d == 'a'||d == 'e' || d == 'i'||d == 'o' || d == 'u'){
            System.out.println(c + " la nguyen am");            
            }else {
            System.out.println(c + " la phu am");
            }
              
        }else {
            System.out.println("Nhap sai, nhap lai");
        }
   }   
}
