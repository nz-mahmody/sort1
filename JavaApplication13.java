/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author pasargad
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int a=d.nextInt();
        int []b=new int [a];
        int t;
        for(int i=0;i<b.length;i++)
        {
            b[i]=d.nextInt();
        }
     for(int j=0;j<b.length;j++)
     {
         int m=j;
         for(int i=j+1;i<b.length;i++)
         {
             if(b[i]<b[m])
                 m=i;
         }
         t=b[j];
         b[j]=b[m];
         b[m]=t;
     }
     for(int i=0;i<b.length;i++)
     {
         System.out.print(b[i]);
     }
    
    }
    
    
}
