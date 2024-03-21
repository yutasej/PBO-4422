/** 
Yutase Jordan Amrullah 
A11.2022.14505
Tugas Kalkulator Sederhana PBO / A11.4422
**/
import java.util.Scanner;

public class kalkulator {
    static void kalku(){
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Keluar");
    }
    public static void main(String[] args) {
        System.out.println("Kalkulator Sederhana");
        System.out.println("==========================");
        
        int pilih;
        String ya="Y";
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        while (ya.equals("Y") || (ya.equals("y"))) {
            kalku();

            System.out.println("==========================");
            System.out.print("Pilih Operasi Perhitungan: ");
            pilih = sc.nextInt();

            if(pilih==1){
                System.out.print("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.print("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                int hasilTambah = angka1 + angka2;
                System.out.println("Hasilnya Adalah: " +hasilTambah);
                System.out.println("==========================");

            } else if (pilih==2) {
                System.out.print("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.print("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                int hasilKurang = angka1 - angka2;
                System.out.println("Hasilnya Adalah: " +hasilKurang);
                System.out.println("==========================");

            } else if (pilih==3) {
                System.out.print("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.print("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                int hasilKali = angka1 * angka2;
                System.out.println("Hasilnya Adalah: " +hasilKali);
                System.out.println("==========================");

            } else if (pilih==4) {
                System.out.print("Bilangan Pertama: ");
                int angka1 = sc.nextInt();
                System.out.print("Bilangan Kedua: ");
                int angka2 = sc.nextInt();
                float hasilBagi = (float) angka1 / angka2;
                System.out.println("Hasilnya Adalah: " +hasilBagi);
                System.out.println("==========================");

            } else if (pilih==5) {
                break;
            }

            System.out.print("Pilih Lagi Y/N ? ");
            ya = sc1.nextLine();
        }
    }
}
