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
public class pair {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre svp!!!!!!!!");
      int x=sc.nextInt();
    if(x%2==0){
        System.out.println("ce nombre est pair"); 
    }else {
        System.out.println("ce nombre est impair");
        }
    }   
}
