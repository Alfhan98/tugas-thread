/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import static java.lang.Thread.sleep;

/**
 *
 * @author acer
 */
class Mobil extends Thread{
public Mobil(String id){
super(id);
}
@Override
public void run(){
String mobil = getName();
for(int i=0; i<5; i++){
try{
sleep(1000);
}catch(InterruptedException ie){
System.out.println ("Terinterupsi");
}
System.out.println("Thread"+mobil+":Posisi"+i);
}
}
}

