package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int yil;
        boolean artik = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("L�tfen hesaplatmak istedi�iniz y�l� giriniz : ");
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
            System.out.print("Girmi� oldu�unuz " + yil +"' i artik y�ld�r " );
        else
            System.out.print("Girmi� oldu�unuz yil artik y�l de�ildir " );
    }
}