/**
 * 
 */
package org.jefecomp.sorting.impl;

import org.jefecomp.sorting.Sorting;

/**
 * @author jefecomp
 * 
 * Implementation of the BubbleSort algorithm for any type of number in Java Language, i.e. Integer, Float, Double, Long. 
 * The length of the input array is limited by maximum number of elements allowed by an array in Java. 
 *
 */
public class BubbleSort implements Sorting {

	/**
	 * Not implemented in MergeSort Algorithm
	 */
	@Override
	public void setParameter(String name, Object value) {}

	/**
	 * Not implemented in MergeSort Algorithm
	 */
	@Override
	public Object getParameter(String name) {
		
		return null;
	}

	/* (non-Javadoc)
	 * @see org.jefecomp.sorting.Sorting#sort(java.lang.Object[])
	 */
	@Override
	public void sort(Object... array) {
		
		
		for(int i = 0; i < array.length; i++){
			
			boolean hasSwap = false;
			
			for(int j = 0; j < array.length -i -1; j++){
				
				if(((Number)array[j]).doubleValue() > ((Number)array[j+1]).doubleValue()){
					
					Object temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					hasSwap = true;
				}
			}
			
			if(!hasSwap){
				break;
			}
		}
	}
}