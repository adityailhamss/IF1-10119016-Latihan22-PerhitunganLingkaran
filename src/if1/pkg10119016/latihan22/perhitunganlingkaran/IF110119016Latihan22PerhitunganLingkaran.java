/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan cara 
 * melakukan penghitungan lingkaran
 */
public class IF110119016Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double diameter, jarijari, luas, keliling;
        final double PHI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while(true) {
            try {
                diameter = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                System.out.print("Masukkan nilai diameter lingkaran : ");
                continue;
            }
        }
        jarijari = diameter /2 ;
        luas = PHI * jarijari * jarijari;
        keliling = PHI * diameter;
        System.out.println();
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran\t= %.2f%n", jarijari);
        System.out.printf("Luas Lingkaran\t\t= %.2f%n", luas);
        System.out.printf("Keliling lingkaran\t= %.2f%n", keliling);
    }
}