/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan33.userlogin;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan user login
 * 
 */
public class user {
    private String username;
    private String password;
    private boolean status;

    private boolean cekAkun(String parUsername, String parPassword) {
        username = "RizkiAdam";
        password = "terbaikselalu";

        status = parUsername.equals(username) && parPassword.equals(password);
        return status;
    }

    private void hasilLogin(boolean status, String parUsername) {
        if (status == true) {
            System.out.printf("\n-----Hallo -----", parUsername.toUpperCase());
            System.out.println("\n Selamat datang di aplikasi ini");
        } else {
            System.out.println("\n Ooops, username atau password anda salah");
        }
    }
    
    public void pengecekkanLogin(String parUsername, String parPassword){
        cekAkun(parUsername, parPassword);
        hasilLogin(status, parUsername);
    }
}
