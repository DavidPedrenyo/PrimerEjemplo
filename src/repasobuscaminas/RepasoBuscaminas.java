/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasobuscaminas;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class RepasoBuscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        
        int casos = 0;
        
        casos = sc.nextInt();
        
        for (int u = 0; u < casos; u++) {
            
            System.out.println("CASO " + (u + 1));
            System.out.println("--------");
            
            int[][] matriz = new int[8][8];
        
        for (int o = 0; o < matriz.length; o++) {
            
            for (int p = 0; p < matriz[o].length; p++) {
                
                matriz[o][p] = sc.nextInt();
            }
            
        }
        
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                

                
                if (matriz[i][j] == -1 ) {
                    
                    for (int z = (i-1); z < i+2; z++) {
                        
                        for (int l = (j-1); l < j+2; l++) {
                            
                            
                            if ((z >= 0 && l >= 0 ) && (z < matriz.length && l < matriz[i].length) && (matriz[z][l] != -1)) {
                                
                               
                                 matriz[z][l] = matriz[z][l]+1;
                                
                               
                            }
                            
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
        
        for (int c = 0; c < matriz.length; c++) {
            
            for (int b = 0; b < matriz[c].length; b++) {
                
                System.out.print(matriz[c][b]+"\t");
                
            }
            
            System.out.println("");
        }
        }
        
        
        
        
        
        
    }
    
}
