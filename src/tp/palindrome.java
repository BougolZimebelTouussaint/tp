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
public class palindrome {
    
    
    
    
    public static void main(String[] args){
        
    Scanner re = new Scanner(System.in);
    System.out.println("Entrer le mot a verifié");
    String nom=re.nextLine();
   String renverse="" ;
  for(int i=nom.length()-1;i>=0;i--){   
    
      renverse=renverse+nom.charAt(i);
  }
  System.out.println(renverse);
  if(renverse.equals(nom)){
      System.out.println("Ceci est un palindrome");
  } else System.out.println("Ceci n'est pas un palindrome");
    }  
}
