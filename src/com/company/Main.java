package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int size;
	int[] array;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.println("enter a size: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("size does not exceed 20");
            }
        }while(size>20);
            array=new int[size];
            int i=0;
            while(i<array.length){
                System.out.print("enter element"+(i+1)+": ");
                array[i]=scanner.nextInt();
                i++;
            }
        System.out.printf("%-20s%s","element in array: "," ");
            for(int j=0;j<array.length;j++){
                System.out.print(array[j]+"\t");
            }
            for(int j=0;j<array.length/2;j++){
                int temp=array[j];
                array[j]=array[size -1-j];
                array[size-1-j]=temp;
            }
        System.out.printf("%-20s%s","reverse array: "," ");
            for(int j=0;j<array.length;j++){
                System.out.print(array[i]+"\t");
            }
    }
}
