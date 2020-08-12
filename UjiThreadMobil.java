/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author acer
 */
public class UjiThreadMobil {
public static void main (String[] args) {
Mobil m1 = new Mobil("M-1");
Mobil m2 = new Mobil ("M-2");
m1.start();
m2.start();

boolean m1Berakhir = false;
boolean m2Berakhir = false;

do{
if(!m1Berakhir && !m1.isAlive()){
m1Berakhir = true;
System.out.println("Thread m1 berakhir");
}
if(!m2Berakhir && !m2.isAlive()){
m2Berakhir = true;
System.out.println("Thread m2 berakhir");
}
}while (!m1Berakhir || m2Berakhir);

}
}