import java.util.Scanner;
public class tugas2 {
     public static void main(String[] args) {
        String nama, alamat, telepon;
        int waktu;
        int hargaawal = 200000;
        
        Scanner data = new Scanner(System.in);
        System.out.println("Studio Al Izzah");
        System.out.println("Nama pelanggan: ");
        nama = data.nextLine();
        System.out.println("Alamat: ");
        alamat = data.nextLine();
        System.out.println("telepon: ");
        telepon = data.nextLine();
        
        System.out.println("waktu: ");
        waktu = data.nextInt();
        
        int afterHour = waktu-1;
        int diskon = 25*hargaawal/100;  
        int total = hargaawal + (afterHour*diskon);

        System.out.println("--------------------");
        System.out.println("Nama pelanggan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Telepon: " + telepon);
        System.out.println("Waktu:" + waktu);
        System.out.println("Total:" + total);
        
        data.close();
    }
}