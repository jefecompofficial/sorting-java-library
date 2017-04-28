/**
 * 
 */
package org.jefecomp.sorting.impl;

import org.jefecomp.sorting.Sorting;

/**
 * @author jefecomp
 * 
 * 
 * Implementation of the MergeSort algorithm for any type of number in Java Language, i.e. Integer, Float, Double, Long. 
 * The length of the input array is limited by maximum number of elements allowed by an array in Java. 
 *
 */
public class MergeSort implements Sorting {
	
	
	/**
	 * 
	 * @param l the left index
	 * @param r the right index
	 * @return an integer representing the middle of l and r indexes.
	 */
	private Integer getMiddle(Integer l, Integer r){
		
		return (l+r)/2;
	}
	
	/**
	 * Implements the subarray division strategy of the MergeSort algorithm.
	 * 
	 * @param l the left index of the array
	 * @param r the right index of the array
	 * @param array the array to be sorted
	 */
	private void mergeSort(Integer l, Integer r, Object ... array){
		
		
		if(r > l){
			
			Integer m = this.getMiddle(l, r);
			
			this.mergeSort(l, m, array);
			
			this.mergeSort(m+1, r, array);
			
			this.merge(l, m, r,array);
		}
	}
	
	/**
	 * Implements the merge strategy of the Mergesort algorithm
	 * 
	 * @param l the left index of the array
	 * @param m the middle index between left index l and right index r
	 * @param r the right index of the suarray array
	 * @param array the array to be sorted
	 */
	private void merge(Integer l, Integer m, Integer r, Object ... array){
		
		
		int lengthL = m-l +1;
		
		int lengthR = r-m;
		
		Object[] arrayL = new Object[lengthL];
		Object[] arrayR = new Object[lengthR];
		
		
		System.arraycopy(array, l, arrayL, 0, lengthL);
		System.arraycopy(array, m+1, arrayR, 0, lengthR);
		
		int li = 0;
		
		int ri = 0;
		
		for(int i = l; i < r+1; i++){
			
			
			if(li == lengthL && ri < lengthR){
				
				array[i] = arrayR[ri++];
			}
			if(ri == lengthR && li < lengthL){
				array[i] = arrayL[li++];
				
			}
			
			if(li < lengthL && ri < lengthR){
				
				
				if(((Number)arrayL[li]).doubleValue() > ((Number)arrayR[ri]).doubleValue()){
					
					array[i] = arrayR[ri++];
				}
				else{
					
					array[i] = arrayL[li++];
				}
			}
			
		}
	}
	
	public MergeSort() { }
	
	/* (non-Javadoc)
	 * @see org.jefecomp.sorting.Sorting#sort(java.lang.Class, java.lang.Object[])
	 */
	public void sort(Object ... array) {
		
		
		if(array != null && array.length >1){
		
			this.mergeSort(0, array.length-1, array);
			
		}
		

	}
	

	/**
	 * Not implemented in MergeSort Algorithm
	 */
	public void setParameter(String name, Object value) {}


	
	/**
	 * Not implemented in MergeSort ALgorithm
	 */
	public Object getParameter(String name) {
		
		return null;
		
	}

}