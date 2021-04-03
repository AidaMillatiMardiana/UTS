/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class NewClass2 {
//public class Aida {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int pilihan, jumlahBarang, tanggalPinjam, batasPinjam, tanggalKembali, stok1, stok2;
//        double denda;
//        String barang1, jenis1, barang2, jenis2;
        
        static String barang[][] = {
            {"NAMA BARANG   ", "STOK    ", "JENIS BARANG"}, 
            {"Meja  ", "        50", "      Prabotan"}, 
            {"Kursi ", "        100", "     Prabotan"}, 
            {"Karpet", "        20", "      Prabotan"}, 
            {"Lampu", "         20", "      Prabotan"}, 
            {"Kabel", "         10", "      Prabotan"}, 
            {"Keyboard", "      15", "      Alat TIK"}, 
            {"Printer", "       15", "      Alat TIK"}, 
            {"Papan ujian", "   100", "     ATK"}, 
            {"", "              0", "         "}, 
            {"", "              0", "         "}
        };
        
        System.out.println("          SARANA PRASARANA            ");
        System.out.println("========= MENU DATA BARANG =========");
        for (int i = 0; i < barang.length; i++) {
            for (int j = 0; j < barang[0].length; j++) {
                System.out.print(barang[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
//         System.out.print("Masukkan barang tambahan ke 1: ");
//         barang1 = sc.nextLine();
//         System.out.print("Jumlah stok barang 1         : ");
//         stok1 = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Jenis barang 1               : ");
//         jenis1 = sc.nextLine();
//         System.out.print("");
//         System.out.print("Masukkan barang tambahan ke 2: ");
//         barang2 = sc.nextLine();
//         System.out.print("Jumlah stok barang 2         : ");
//         stok2 = sc.nextInt();
//         sc.nextLine();
//         System.out.print("Jenis barang 2               : ");
//         jenis2 = sc.nextLine();
//         System.out.println("");
         
        for (int i = 0; i < barang.length; i++) {
            for (int j = 0; j < barang[0].length; j++) {
                System.out.print(barang[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        
         
        static void menu(){ 
         System.out.println("============ PEMINJAMAN ============");
         System.out.println("PILIHAN");
	 System.out.println("1.) MEJA");
	 System.out.println("2.) KURSI");
	 System.out.println("3.) KARPET");
         System.out.println("4.) LAMPU");
         System.out.println("5.) KABEL");
         System.out.println("6.) KEYBOARD");
         System.out.println("7.) PRINTER");
         System.out.println("8.) PAPAN UJIAN");
         System.out.println("9.) PENSIL");
         System.out.println("10.) PENGHAPUS");
         System.out.println();
         System.out.print("PILIH   -> ");
         int pilihan = sc.nextInt();
         
         
         switch (pilihan){
             case 1:
                 System.out.print("Jumlah Barang  :  ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 2:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 3:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 4:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 5:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;                 
             case 6:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 7:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 8:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 9:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
                break;
             case 10:
                 System.out.print("Jumlah Barang  : ");
                 jumlahBarang = sc.nextInt();
                 System.out.print("Tanggal Pinjam :  ");
                 tanggalPinjam = sc.nextInt();
                 System.out.println();
                 batasPinjam = 3;
                 System.out.println("MAKSIMAL PEMINJAMAN " + batasPinjam + " HARI");
                 System.out.println();
                 System.out.println("========== PENGEMBALIAN ==========");
                 System.out.print("Tanggal Pengembalian : ");
                 tanggalKembali = sc.nextInt();
                 System.out.println("Pengembalian telat " + (tanggalKembali - 3 - tanggalPinjam) + " hari");
                 System.out.println("Denda telat > 1 hari = 5.000");
                 denda = (tanggalKembali - 3 - tanggalPinjam) * 5000;
                 if (tanggalKembali >= tanggalPinjam + batasPinjam) {
                     System.out.println("Denda = Rp." + denda);
                 } else {
                     System.out.println("Denda = Rp." + denda);
                 }
               break;
         }
         

      }
}
    

