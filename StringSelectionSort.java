package com.sortingalgorithms.code;

/**
 * This Java class sorts a set of strings
 * using Selection Sort algorithm
 */

public class StringSelectionSort {

    public static void main(String args[]){
        String[] strings=new String[]{"Hello","Geeks","Welcome","To","Java","Coding"};
        System.out.println("Before Sorting:-");
        printStrings(strings,strings.length);
        sort(strings,strings.length);
        System.out.println("After Sorting:-");
        printStrings(strings,strings.length);
    }

    public static void sort(String[] strings , int n){
        for(int i=0;i<n-1;i++){
            int min_idx=i;
            for(int j=i+1;j<n;j++){
                if(strings[j].compareTo(strings[min_idx])<0)
                    min_idx=j;
            }
            String temp=strings[min_idx];
            strings[min_idx]=strings[i];
            strings[i]=temp;
        }
    }

    public static void printStrings(String[] strings , int n){
        for(int i=0;i<n;i++) {
            System.out.print(strings[i] + " ");
        }
        System.out.println("\n");
    }
}
