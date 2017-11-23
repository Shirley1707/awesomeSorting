/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingstuff;

import java.util.*;

/**
 *
 * @author 340745868
 */
public class SortingStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random numbers= new Random();
        int[] data= new int[10];
        for(int i=0;i<data.length; i++){
            data[i]= numbers.nextInt(20);
        }
        System.out.println(Arrays.toString(data));
    }
    
    private int[] swap(int[] initial, int i, int j){
        int temp=initial[i];
        initial[i]=initial[j];
        initial[j]=temp;
        return initial;
    }
    
}
