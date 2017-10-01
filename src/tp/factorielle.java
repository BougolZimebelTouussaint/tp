/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.Scanner;

/**
 *
 * @author TOUSAINT
 */
public class factorielle {
public static void main(String[] args ){
 Scanner trois = new Scanner(System.in);
         System.out.println("Entrer un nombre svp!!!!!!!!");
 int x=trois.nextInt();
 if(x<0){
              System.out.println("Erreur");

 }else if(x==0){
              System.out.println(" Factoriel "+ x + " est 1");

 }else{
     int s=1;
     for(int i=1;i<=x;i++){
          s=s*i;
     }
              System.out.println("Factoriel de "  + x + " est " + s);

 }
 
}
 
    
}


