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
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner
        long detik, hari = 0, jam = 0, menit = 0, detikKedua = 0;
        System.out.println("Input");
        detik = sc.nextLong();
        System.out.println();
        System.out.println("Output");
        hari = detik/86400;
        jam = (detik%86400)/3600;
        menit = ((detik%86400)%3600)/60;
        detikKedua = (((detik%86400)%3600)%60);
        System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detikKedua + " detik");
        
        
    }
}


    

