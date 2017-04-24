/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg24.pkg17.sortarrays;

/**
 *
 * @author Michael Juarez
 */
public class SortArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Three ways to declare arrays
        /*
            String stringArray[] = {"test"};
            String stringArray[] = new String[1];  // 1 is the size of the array
            
            String[] stringArray = {"test"};
            String[] stringArray = new String[1];
        
            String []stringArray = {"test"};
            String []stringArray = new String[1];
        */
        
        String stringArray[] = {"Michael", "Florida", "Computer", "Mouse", "Alpha", "Beta", "Omega", "Zeta"};
        int[] intArray = {46, 23, 34, 1, 6, 90, 17};
        
        stringArraySorter stringSorter = new stringArraySorter(stringArray);
        intArraySorter intSorter = new intArraySorter(intArray);        
        
        stringSorter.sortArray();
        intSorter.sortArray();
        
        String[] sortedStringArray =  stringSorter.getSortedArray();
        int[] sortedIntArray = intSorter.getSortedArray();
        
        /*
        Three ways to iterate through loops
        
        First way:

        for (int i = 0; i < collection.length; i++) {
            type array_element = collection.get(index);
        }

        Second way
        The Iterator hasNext()/next():

        for (Iterator iterator = collection.iterator(); iterator.hasNext();) {
            type type = (type) iterator.next();   
        }
        
        Third way
        for (iterable_type iterable_element : collection) {}
        
        */
        
        
        //For the string array: Print to console the sorted array
        
        System.out.println("String Array (Sorted): ");
        for(String item : sortedStringArray)
        {
            System.out.println(item);
        }
        
        System.out.println();
        System.out.println("Numerical(int) Array (Sorted): ");
        for(int item: sortedIntArray)
        {
            System.out.println(item);
        }
    }
    
}
