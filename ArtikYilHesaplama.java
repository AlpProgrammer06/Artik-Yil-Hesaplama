package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int yil;
        boolean artik = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen hesaplatmak istediðiniz yýlý giriniz : ");
        yil = scanner.nextInt();

        if (yil % 4 == 0) {
            if (yil == 100) {
                if (yil == 400) {
                    artik = true;
                } else
                    artik = false;
            } else
                artik = true;

        } else
            artik = false;
        if (artik)
            System.out.print("Girmiþ olduðunuz " + yil +"' i artik yýldýr " );
        else
            System.out.print("Girmiþ olduðunuz yil artik yýl deðildir " );
    }
}