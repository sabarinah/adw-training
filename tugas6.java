import java.util.Scanner;  
import java.util.HashMap; 

public class tugas6 {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        HashMap <String, Integer> golDict = new HashMap <>();

        String nama, golongan;
        int jam_kerja, jumlah_karyawan;
        int gaji = 700000;
        int totalGaji = 0;
        
        String[] gol = {"1", "2", "3"};
        int[] persen_gol = {5, 10, 15};
        
        System.out.println("Jumlah karyawan: ");
        jumlah_karyawan = data.nextInt();

        for (int i = 0; i < gol.length; i++) {
            golDict.put(gol[i], persen_gol[i]);
        }
        
        for(int i = 1; i <= jumlah_karyawan; i++){

            System.out.println("karyawan ke-" +i);
            System.out.println("Nama karyawan: ");
            data.nextLine();
            nama = data.nextLine();

            System.out.println("Golongan (1, 2, 3): ");
            golongan = data.nextLine();
            
            int tunjangan_gol = gaji * golDict.get(golongan)/100;
            System.out.println("Tunjangan golongan: " + tunjangan_gol);
            
            System.out.println("Jumlah jam kerja: ");
            jam_kerja = data.nextInt();
            
            if (jam_kerja>240){
                int honor_lembur = (jam_kerja-240) * 2500;
                System.out.println("Honor lembur: " + honor_lembur);
                
                int total = gaji + tunjangan_gol + honor_lembur;
                int pajak = total * 10 / 100;
                System.out.println("Pajak: " + pajak);
                int pendapatan = total - pajak;
                System.out.println("Pendapatan bersih: " + pendapatan);
                totalGaji += pendapatan;
            }
            
            else {
                int total = gaji + tunjangan_gol;
                int pajak = total * 10 / 100;
                System.out.println("Pajak: " + pajak);
                int pendapatan = total - pajak;
                System.out.println("Pendapatan bersih: " + pendapatan);
                totalGaji += pendapatan;
            }
        }
        System.out.println("Total pengeluaran gaji: " + totalGaji);

        data.close();
    }
}