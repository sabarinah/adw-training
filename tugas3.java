import java.util.Scanner;  

public class tugas3 {
  public static void main(String[] args) {
    Scanner data = new Scanner(System.in);  
    String nama_kasir, kode_kasir;
    int kode_paket, jumlah_beli;
    
    System.out.println("Nama kasir: ");
    nama_kasir = data.nextLine();
    
    System.out.println("Kode kasir: ");
    kode_kasir = data.nextLine();
    
    System.out.println("Kode paket (1, 2, 3): ");
    kode_paket = data.nextInt();

    System.out.println("Jumlah beli: ");
    jumlah_beli = data.nextInt();
    
    String[] nama_paket = {"Paket hemat", "Paket nasi", "Paket spesial"};
    int[] harga_paket = {7500, 10000, 15000};
    System.out.println(nama_paket[kode_paket -1]);
    System.out.println(harga_paket[kode_paket -1]);
    
    int total=harga_paket[kode_paket -1] * jumlah_beli;
    int ppn = total * 10/100;
    int totalbayar = total + ppn;
    
    System.out.println("--------------------");
    System.out.println("Kode paket " + kode_paket);
    System.out.println("Jumlah beli " + jumlah_beli);
    System.out.println("Total " + total);
    System.out.println("Ppn 10% " + ppn);
    System.out.println("Total bayar " + totalbayar);
    System.out.println("--------------------");
    System.out.println("Nama kasir " + nama_kasir);
    System.out.println("Kode kasir " + kode_kasir);

    data.close();
  }
}