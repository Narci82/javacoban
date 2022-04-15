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
public class bai3 {
    public static void createRandomArray(int[] arr, int lengthArray) {
        Random rand = new Random();
        System.out.print("Mang ngau nhien : ");
        for(int i=0; i<lengthArray; i++) {
            int value = rand.nextInt();
            arr[i] = value;
            System.out.print(arr[i] + "; ");
        }
        System.out.println();
    }
    //Xuat mang 
    public static void xuat(int[] arr) {
        for(int i=0; i<arr.length; i++) 
            System.out.print(arr[i] + "; ");
            System.out.println();
    }
    //Sap xep tang dan
    public static void tangDan(int[] arr) {
        System.out.println("Mang theo chieu tang dan : ");
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        xuat(arr);
    }
    //Chuong trinh chinh
    public static void giamDan(int[] arr) {
        System.out.println("Mang theo chieu giam dan : ");
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        xuat(arr);
    }
    //Chuong trinh chinh
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Nhap so phan tu cua mang : ");
            int lengthArray = input.nextInt();
            int[] arr = new int [lengthArray];
            createRandomArray(arr ,lengthArray);
            
            tangDan(arr);           
            giamDan(arr);
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
}
