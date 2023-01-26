import java.util.Scanner;  
import java.util.HashMap; 

public class tugas9 {
        public static void main(String args[]) {
            Scanner data = new Scanner(System.in);
            HashMap <String, Integer> namaDict = new HashMap <>();
            String namaBuku;
            int banyak;

            String[] nama = {"Sukses Belajar Borland C++", "Kunci Pribadi Sukses", "Mencari Mutiara Di Dasar Hati"};
            int[] harga = {50000, 35000, 45000};
        
            for (int i = 0; i < nama.length; i++) {
            namaDict.put(nama[i], harga[i]);
            }
            System.out.println("TOKO BUKU SEJAHTERA");
            System.out.println("List buku yang tersedia");
            System.out.println("Sukses Belajar Borland C++");
            System.out.println("Kunci Pribadi Sukses");
            System.out.println("Mencari Mutiara Di Dasar Hati");
            System.out.println("Nama buku yang anda beli : ");
            namaBuku = data.nextLine();

            int hargaSatuan = namaDict.get(namaBuku);
            System.out.println("Harga buku yang anda beli : " + hargaSatuan);

            System.out.println("Jumlah buku yang anda beli : ");
            banyak = data.nextInt();

            int total = banyak * namaDict.get(namaBuku);
            System.out.println("Total harga buku yang anda beli : " + total);
            
            if(banyak>=3){
                int potongan = total * 10/100;
                System.out.println("Anda mendapatkan potongan sebesar: " + potongan);
                int ppn = total * 2/100;
                System.out.println("Anda mendapatkan bonus: Buku saku");
                System.out.println("Anda harus membayar ppn sebesar: " + ppn);
                int totalBayar = total - potongan + ppn;
                System.out.println("Total yang harus dibayar sebesar: " + totalBayar);
            }
            else{
                System.out.println("Maaf tidak dapat bonus");
                int ppn = total * 2/100;
                System.out.println("Anda harus membayar ppn sebesar: " + ppn);
                int totalBayar = total + ppn;
                System.out.println("Total yang harus dibayar sebesar: " + totalBayar);
            }

            data.close();
    }
}