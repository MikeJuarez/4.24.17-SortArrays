/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4.pkg24.pkg17.sortarrays;

import java.util.Arrays;

/**
 *
 * @author Michael Juarez
 */
public class intArraySorter {
    
    private int intArray[];
    
    //Constructor
    public intArraySorter(int array[])
    {
        intArray = array;
    }
    
    //Processes and returns the sorted array.
    public void sortArray()
    {
        Arrays.sort(intArray);
    }
    
    public int[] getSortedArray()
    {
        return intArray;
    }
}
