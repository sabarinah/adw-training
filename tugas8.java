import java.util.Scanner;  
import java.util.HashMap; 
import java.util.Date;

public class tugas8 {
        public static void main(String args[]) {
            Scanner data = new Scanner(System.in);
            HashMap <String, Integer> kodeDict = new HashMap <>();
            Date date = new Date();
            int jumlah, jamKerja;
            String nama;
            int gaji= 25000;
            int totalGaji= 0;

            System.out.println("PT Meriang Gembira");
            System.out.println("Jumlah karyawan: ");
            jumlah = data.nextInt();
            System.out.println("Tanggal input: " + date.toString());

            for(int i = 1; i <= jumlah; i++){
                System.out.println("Data ke- " +i);
                System.out.println("Nama karyawan : ");
                data.nextLine();
                nama = data.nextLine();

                System.out.println("Jumlah jam kerja : ");
                jamKerja = data.nextInt();

                if (jamKerja>8){
                    int lembur = (jamKerja-8) * 1500;
                    System.out.println("Honor lembur: " + lembur);
                    
                    int total = gaji + lembur;
                    System.out.println("Total honor " + total);
                    totalGaji += total;
                }
                else {
                    System.out.println("Total honor " + gaji);
                    totalGaji += gaji;
                }
            System.out.println("Total honor pegawai sebesar: " + totalGaji);

            data.close();
        }
    }
}