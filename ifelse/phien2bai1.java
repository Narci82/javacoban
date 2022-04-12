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
public class phien2bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao thang: ");
        m = sc.nextInt();
        System.out.println("Nhap vao nam: ");
        y = sc.nextInt();
        if(m<1 ||m>12 || y<1){
            System.out.println("Nhap sai thang, nhap lai");
        }
        if(m ==4 || m ==6 || m== 9|| m==11){
            System.out.println("Thang "+ m +" nam " + y + " co 30 ngay");
        }else if(m == 1 || m == 3 || m== 5|| m==8 ||m == 10 || m == 12){
            System.out.println("Thang "+ m +" nam " + y + " co 31 ngay");
        }else if (m == 2){
            if(y%400 == 0 || (y% 4 == 0 && y %100!= 0)){
            System.out.println("Thang "+ m +" nam " + y + " co 29 ngay");//Nam nhuan 2004
            }
        else {System.out.println("Thang "+ m +" nam " + y +" co 28 ngay");}//nam khong nhuan
        
        }
    }
    
}
