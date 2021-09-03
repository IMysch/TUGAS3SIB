package com.company;

import java.util.Scanner;

public class JualBuah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa banyak macam buah yang akan dibeli ? ");int barang= input.nextInt();
        String Buah []= new String[barang];
        int harga[]= new int[barang];
        int jumlah[]= new int[barang];
        int total[]= new int[barang];
        int tot=0;
        for (int b=0; b<barang; b++){
            System.out.print("Buah yang ke "+(b+1)+" = ");Buah[b]=input.next();
            System.out.print("Harga "+Buah[b]+" = "); harga[b]=input.nextInt();
            System.out.print("Jumlah "+Buah[b]+" = "); jumlah[b]=input.nextInt();
            total[b]=harga[b]*jumlah[b];
            System.out.println("Total bayar = "+total[b]);
            System.out.println(" ");
            tot=tot+total[b];
        }
        System.out.println("==================================================");
        System.out.println("NO ||   BUAH   || JUMLAH ||   HARGA   ||   TOTAL");
        System.out.println("==================================================");
        for (int c=0; c<barang; c++){
            System.out.println((c+1)+"       "+Buah[c]+"         "+jumlah[c]+"      Rp."+harga[c]+"    Rp."+(jumlah[c]*harga[c]));
        }
        System.out.println("__________________________________________________+");
        System.out.println("Total belanja = Rp."+tot+",-");
    }
}
