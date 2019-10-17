/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan user login
 * 
 */
public class IF0110118029Latihan33Userlogin {

    private static String uName;
    private static String password;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        user user = new user();
        
        System.out.print("Masukkan Usernama anda\t= ");
        uName = scanner.next();
        System.out.print("Masukkan Password\t= ");
        password = scanner.next();
        
        user.pengecekkanLogin(uName, password);
    }
    
}
