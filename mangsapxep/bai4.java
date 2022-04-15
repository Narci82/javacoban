/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban.donglenh.mangsapxep;

/**
 *
 * @author 7480
 */

import java.util.Scanner;
import java.util.Random;

public class bai4 {    
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
    
    public static void xuat(int[] arr) {
        for(int i=0; i<arr.length; i++) System.out.print(arr[i] + "; ");
        System.out.println();
    }
    
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
    //Tim vi tri dau tien xuat hien
    public static int find(int[] arr, int n) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==n) return i;
        }
        return -1;
    }
    //tim tat ca vi tri
    public static void findAll(int[] arr, int n) {
        int dem=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==n) {
                System.out.print(i + " ");            
            } 
            dem++;
        }
        if(dem==0) {
            System.out.print("/0");          
        }System.out.println();
        
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
            
            System.out.print("Nhap N can tim kiem trong mang: ");
            int n = input.nextInt();
            System.out.println("Vi tri dau tien cua "+ n + " trong mang la: " + find(arr, n));
            System.out.print("Cac vi tri "+ n +" xuat hien trong mang la: ");
            findAll(arr, n);           
        } catch(Exception e) {
            System.out.println(e);
        }
    }   
}