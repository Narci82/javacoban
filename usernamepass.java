/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacban;

import java.util.Scanner;

/**
 *
 * @author 7480
 */
public class usernamepass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String username = new String("HuyHoang");
        String password = new String("2021");
        String guessUser, guessPass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào username: ");
            guessUser = sc.nextLine();
            System.out.println("Nhập vào password: ");
            guessPass = sc.nextLine();        
        if((guessUser.equals(username)) && (guessPass.equals(password))) {
            System.out.println("Username: " +username);
            System.out.println("Password " + password);    
        }else {
        System.out.println("Nhập sai, nhập lại: ");
    }
    }  
}
