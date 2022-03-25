
package javacban.donglenh;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class pheptoan {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");       
        int a = sc.nextInt();
        System.out.print("Nhap a: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Phep tinh "+ a +"+" + b +" = " + c);
         c = a - b;
        System.out.println("Phep tinh "+ a +"-" + b +" = " + c);
         c = a * b;
        System.out.println("Phep tinh "+ a +"*" + b +" = " + c);
         c = a / b;
        System.out.println("Phep tinh "+ a +"/" + b +" = " + c);
         c = a % b;
        System.out.println("Phep tinh "+ a +"%" + b +" = " + c);
         long d =1;
        for (int i = 1; i<= b;i++){
            d *= a;
        }
        System.out.println("Phep tinh "+ a +"^" + b +" = " + d);
    }
}
