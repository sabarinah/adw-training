import java.util.Scanner;  
import java.util.HashMap; 

public class tugas5 {
    public static void main(String args[]) {
        Scanner data = new Scanner(System.in);
        HashMap <String, Integer> golDict = new HashMap <>();
        HashMap <String, Integer> pendDict = new HashMap <>();
        String nama, golongan, pendidikan;
        int jam_kerja;
        int gaji = 300000;
        
        System.out.println("Nama karyawan: ");
        nama = data.nextLine();
        
        String[] gol = {"1", "2", "3"};
        int[] persen_gol = {5, 10, 15};
        
        String[] pend = {"SMA", "D1", "D3", "S1"};
        int[] persen_pend = {25/10, 5, 20, 30};
        
        for (int i = 0; i < gol.length; i++) {
            golDict.put(gol[i], persen_gol[i]);
        }
        for (int i = 0; i < pend.length; i++) {
            pendDict.put(pend[i], persen_pend[i]);
        }
        
        System.out.println("Golongan (1, 2, 3): ");
        golongan = data.nextLine();
        
        int tunjangan_gol = gaji * golDict.get(golongan)/100;
        System.out.println("Tunjangan golongan: " + tunjangan_gol);
        
        System.out.println("Pendidikan (SMA, D1, D3, S1): ");
        pendidikan = data.nextLine();
        
        int tunjangan_pend = gaji * pendDict.get(pendidikan)/100;
        System.out.println("Tunjangan pendidikan: " + tunjangan_pend);
        
        System.out.println("Jumlah jam kerja: ");
        jam_kerja = data.nextInt();
        
        if (jam_kerja>8){
            int honor_lembur = (jam_kerja-8) * 3500;
            System.out.println("Honor lembur: " + honor_lembur);
            
            int total = gaji + tunjangan_gol + tunjangan_pend + honor_lembur;
            System.out.println("Total gaji: " + total);
        }
        
        else {
            int total = gaji + tunjangan_gol + tunjangan_pend;
            System.out.println("Total gaji: " + total);
        }

        data.close();
    }
}