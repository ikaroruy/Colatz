/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colatz;



/**
 *
 * @author dunkelheit
 */



public class Colatz {
    public static void collatz(int n) {
        System.out.println(n + " ");
        if (n == 1) return;
        else if (n % 2 == 0) collatz(n / 2);
        else collatz(3*n + 1);
    }
    
    public static void collatzI(int n) {
        int colatz = 0;
        System.out.println(n + " ");
        for(int i = 1; i < n; i++) {
            if(n % 2 == 0) {
                colatz = n/2;
            } else {
                colatz = 3*n+1;
            }
            
            System.out.println(colatz);
        }
    }

    public static void main(String[] args) {
        long v0 = System.currentTimeMillis();
        collatzI(17);
        long v1 = System.currentTimeMillis();
        System.out.println();
        System.out.println("Tempo: " + (v1-v0));
    }

}

    

