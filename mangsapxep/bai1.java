/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.mangsapxep;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class bai1 {
    public static void createRandomArray(int[] arr, int lengthArray) {
        Random rand = new Random();
        System.out.print("Mang ngau nhien: ");
        for(int i=0; i<lengthArray; i++) {
            int value = rand.nextInt();
            arr[i] = value;
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }
    
    public static int find(int[] arr, int n) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==n) return i;
        }
        return -1;
    }
    //Chuong trinh chinh
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Nhap so phan tu cua mang: ");
            int lengthArray = input.nextInt();
            int[] arr = new int [lengthArray];
            createRandomArray(arr ,lengthArray);

            System.out.print("Nhap so N can tim kiem trong mang: ");
            int n = input.nextInt();
            System.out.println("Vi tri dau tien cua "+ n +" trong mang la: " + find(arr, n));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
    
