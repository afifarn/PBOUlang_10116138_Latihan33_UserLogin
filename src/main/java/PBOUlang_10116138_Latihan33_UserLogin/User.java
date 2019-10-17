/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOUlang_10116138_Latihan33_UserLogin;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan User Login
 * NoRunning
 */
public class User {
    private String username = "afif";
    private String password = "raditya";
    private boolean statusAkun;
    
    private boolean cekAkun(String userName,String password){
        if (userName.equals(username)){
            statusAkun = true;           
        }
        else if ( password.equals(password)){
             statusAkun = false;  
        } 
        else{
            statusAkun = false;
        }
         return statusAkun;
        
    }

private void hasilLogin(boolean statusAkun, String userName){
        if(statusAkun){
            System.out.println("*****Hallo " + userName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
            System.out.println("Ooops,Username atau Password Anda salah");
        }
        }
    

    public void pengecekanLogin(String userName, String password){
        System.out.println(cekAkun(userName, password));
        hasilLogin(statusAkun, userName);
    }
}

    

