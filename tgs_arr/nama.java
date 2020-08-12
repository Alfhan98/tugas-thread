/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgs_arr;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class nama {
    public static void main(String[] args) {

        String[] nama = new String[5];

        Scanner scan = new Scanner(System.in);

        for( int i = 0; i < nama.length; i++ ){
            System.out.print("Nama ke-" + i + ": ");
            nama[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        for( String b : nama ){
            System.out.println(b);
        }

    }
}
