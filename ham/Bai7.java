/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.ham;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class Bai7 {
    private double a,b,c;
    Scanner sc= new Scanner(System.in);
     void GiaiPT() {
        
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
    void giaiPTBac2() {       
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
    void nhapB1(){
       
        System.out.println("Nhập vào số a: ");
        a = sc.nextInt();
        System.out.println("Nhập vào số b: ");
        b = sc.nextInt();
        System.out.println("Phương trình bạn vừa nhập vào là: " + a + "x + " + b + " = 0.");
    }
    void nhapB2(){
        do {
            System.out.print("Nhập a (a # 0): ");
            a = sc.nextDouble();
        } while (a == 0);
        System.out.println("Nhap b: ");
        b= sc.nextDouble();
        System.out.println("Nhap c: ");
        c= sc.nextDouble();	
    }
    void chonGiai(){
        System.out.println("Nhập 1 hoặc 2 để giải phương trình tương ứng");
        int f= sc.nextInt();         
            if (f == 1) {
                Bai7 bai7 = new Bai7();
                bai7.nhapB1();
                bai7.GiaiPT();
            }
            if (f == 2) {
                Bai7 bai7 = new Bai7();
                bai7.nhapB2();
                bai7.giaiPTBac2();
            }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
            Bai7 bai7 = new Bai7();
            bai7.chonGiai();
            int n;
            for (;;){
                do{
                System.out.println("Vui lòng nhập 1 để tiếp tục chương trình, 0 để kết thúc chương trình ");
            
                n = sc.nextInt();
            }    while ((n < 0) || (n > 1));    
           
            switch(n){
                case 1:                  
                    bai7.chonGiai();
                    break;
        
                case 2:
                    System.out.println("Ðã thoát!");
                    System.exit(0);
                    break;
        
            } 
        }
    }
}

    
    