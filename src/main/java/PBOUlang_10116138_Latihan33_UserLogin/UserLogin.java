/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan33_UserLogin;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan User Login
 * NoRunning
 */
public class UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User login = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String user = scanner.next();
        System.out.println("Masukan Password: ");
        String password = scanner.next();
        System.out.println("");
        
        
        login.pengecekanLogin(user, password);
        
    }
    
}
