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

public class Bai4 { 
    static void GiaiPT(int a, int b) {
        double nghiem;
            if (a == 0) {
        if (b == 0) {
            System.out.println("Phương trình này có vô số nghiệm.");
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    } else {
        nghiem = (double) -b/ a;   // ép kiểu để cho ra kết quả chính xác
        System.out.println("Phương trình có nghiệm x = " + nghiem + ".");
    }
}

    public static void main(String[] args) {
        int a, b;   
        Scanner sc = new Scanner(System.in);
         /*
        Phuong trinh ax +b = 0
        */
        System.out.println("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b = sc.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");

        GiaiPT(a,b);
        }

}
