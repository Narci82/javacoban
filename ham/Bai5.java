/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.ham;

/**
 *
 * @author 7480
 */
import java.util.Scanner;

public class Bai5 {
    
    public static void giaiPTBac2(double a,double b, double c) {
        
        double delta = b*b - 4*a*c;
        double x1, x2;
        System.out.println("Delta = "+delta);
        if (delta > 0) {
            x1 =  ((-b + Math.sqrt(delta)) / (2*a));
            x2 =  ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
	
	public static void main(String[] args) {
		double a, b, c;
            //float delta, x1, x2;
            Scanner sc= new Scanner(System.in);
            do {
                System.out.print("Nhập a (a # 0): ");
                a = sc.nextDouble();
            } while (a == 0);
            System.out.println("Nhap b: ");
            b= sc.nextDouble();
            System.out.println("Nhap c: ");
            c= sc.nextDouble();	
            giaiPTBac2(a,b,c);

	}

}
