
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Raisya Ramadhani
 */
public class TokoOnline {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan Jumlah Item yang Dibeli :");
        int jumlahitem = input.nextInt ();
        
        int i = 1;
        int harga = 0;
        int jumlahBarang = 0;
        int totalPembelian = 0;
        while (jumlahitem >= i){
            System.out.println(i+ "." + "Nama Barang : ");
            String namaBarang = input.next();
            
            System.out.println(i + "." + "Harga :");
            harga = input.nextInt();
            
            System.out.println(i + "." + "Jumlah : ");
            int JumlahBarang = input.nextInt();
            System.out.println("==============");
            
            totalPembelian += harga * jumlahBarang;
            i++;
            
            System.out.println("Jumlah item yang dibeli :" + jumlahitem);
            System.out.println("Total pembelian :" + totalPembelian);
        }
    }
    
}
