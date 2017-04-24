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
public class stringArraySorter {
    
    private String[] stringArray;
    
    public stringArraySorter(String[] array)
    {
        stringArray = array;
    }
    
    public void sortArray()
    {
        Arrays.sort(stringArray);
    }
    
    public String[] getSortedArray()
    {
        return stringArray;
    }
}
