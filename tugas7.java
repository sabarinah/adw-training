import java.util.Scanner;  
import java.util.HashMap; 

public class tugas7 {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        HashMap <String, Integer> kodeDict = new HashMap <>();

        String nama, kodebuku, jenis;
        int banyak;
        int gaji = 700000;

        String[] kode = {"C", "K", "N"};
        int[] tarif = {500, 700, 1000};

        System.out.println("Perpustakaan Kecil Kecilan");
        System.out.println("Nama penyewa buku: ");
        nama = data.nextLine();
        
        System.out.println("Kode jenis buku (C, K, N): ");
        kodebuku = data.nextLine();
        
        switch (kodebuku) {
            case "C":
            jenis = "Cerpen";
            System.out.println("Jenis buku: " + jenis);
            System.out.println("Harga satuan: " + tarif[0]);
            break;
            case "K":
            jenis = "Komik";
            System.out.println("Jenis buku: " + jenis);
            System.out.println("Harga satuan: " + tarif[1]);
            break;
            case "N":
            jenis = "Novel";
            System.out.println("Jenis buku: " + jenis);
            System.out.println("Harga satuan: " + tarif[2]);
            break;
        }
        
        System.out.println("Banyak buku: ");
        banyak = data.nextInt();
        
        for (int i = 0; i < kode.length; i++) {
            kodeDict.put(kode[i], tarif[i]);
        }
        int tarifsewa= banyak * kodeDict.get(kodebuku);
        System.out.println("Tarif sewa buku: " + tarifsewa);

        data.close();
    }
}