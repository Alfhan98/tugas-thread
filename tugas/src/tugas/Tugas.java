/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author acer
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */

       int a=100;

    public Tugas (){

        System.out.println("NILAI AKHIR");
      
    }
    public void hello (){
        System.out.println("TUGAS JAVA LANJUT ");
     }
      public void KLS (){
        System.out.println ("KELAS C2");
      }
public static void main(String[] args) {
Tugas objeck1 = new Tugas();
        System.out.println(objeck1.a);
     objeck1.hello();
     objeck1.KLS();
    }
}
