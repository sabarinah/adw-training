import java.util.Scanner;  
import java.util.HashMap; 

public class tugas4 {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        HashMap <String, Integer> kodeDict = new HashMap <>();

        String kode_potong, jenis_potong;
        int jenis, jumlahBeli;
        int total = 0;
        
        String[] kode = {"D", "P", "S"};
        int[] harga = {2500, 2000, 1500};
        
        System.out.println("Gerobak Fried Chicken");
        System.out.println("Banyak jenis: ");
        jenis = data.nextInt();
        
        for (int i = 0; i < kode.length; i++) {
            kodeDict.put(kode[i], harga[i]);
        }
        
        for(int i = 1; i <= jenis; i++){

            System.out.println("Jenis ke-" +i);

            System.out.println("Kode potong (D, P, S): ");
            data.nextLine();
            kode_potong = data.nextLine();
           
            switch (kode_potong) {
                case "D":
                jenis_potong = "Dada";
                System.out.println("Jenis potong: " + jenis_potong);
                break;
                case "P":
                jenis_potong = "Paha";
                System.out.println("Jenis potong: " + jenis_potong);
                break;
                case "S":
                jenis_potong = "Sayap";
                System.out.println("Jenis potong: " + jenis_potong);
                break;
            }
            
            System.out.println("Jumlah beli: ");
            jumlahBeli = data.nextInt();
            
            int jumlahHarga= jumlahBeli * kodeDict.get(kode_potong);
            System.out.println("Jumlah harga: " + jumlahHarga);
            total += jumlahHarga ;
        }
        
        System.out.println("Jumlah bayar: " + total);
        
        int pajak = total * 10 / 100;
        System.out.println("Pajak 10% : " + pajak);
        int totalBayar = total + pajak;
        
        System.out.println("Total Bayar : " + totalBayar);

        data.close();
    }
}