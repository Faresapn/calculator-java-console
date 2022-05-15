import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int varone, vartwo, opt, result= 0;
        System.out.println("Selamat Datang Di Program Kalkulator Sederhana");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Pembagian");
        System.out.println("4. Perkalian");
        System.out.println("5. Sisa Bagi");
        System.out.println("-----------------------------");
 
        System.out.print("Masukan Angka Pertama: ");
        varone = sc.nextInt();
        System.out.print("Masukan Angka Kedua: ");
        vartwo = sc.nextInt();
 
        System.out.print("Masukan Operasi: ");
        opt = sc.nextInt();
 
        switch (opt)
        {
            case 1 : 
                result = varone + vartwo;
                break;
            case 2 : 
                result = varone - vartwo; 
                break;
            case 3 : 
                result = varone / vartwo; 
                break;
            case 4 : 
                result = varone * vartwo; 
                break;
            case 5 : 
                result = varone % vartwo; 
                break;
            default : System.out.println("Maaf Menu Tidak Ada , Silahkan Ulangi Pilihan Anda");
        }
        System.out.println("Hasil Perhitungan: " + result);
    }
}