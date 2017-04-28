/**
 * 
 */
package org.jefecomp.sorting.test;

import static org.junit.Assert.assertEquals;

/**
 * @author jefecomp
 *
 */
public class DataSetTest {
	
	
	private Integer[] arrayI = {2,1,5,21,16,10,45,20,31};
	
	private Integer[] expectedI = {1,2,5,10,16,20,21,31,45};
	
	private Float[] arrayF = {3.5F,1.2F,4.7F,45.6F,32.1F,21.3F,0.4F,46.1F,23.3F,30.1F};
	
	private Float[] expectedF = {0.4F,1.2F,3.5F,4.7F,21.3F,23.3F,30.1F,32.1F,45.6F,46.1F};
	
	
	public Integer[] getUnsortedArrayI(){
		
		return this.arrayI;
	}
	
	public Float[] getUnsortedArrayF(){
		
		return this.arrayF;
	}
	
	public void checkIntegerSorting(Integer... sortedArray){
		
		for(int i = 0; i < sortedArray.length; i++){
			
			assertEquals(this.expectedI[i], sortedArray[i]);
		}
	}
	
	public void checkFloatSorting(Float... sortedArray){
		
		for(int i = 0; i < sortedArray.length; i++){
			
			assertEquals(this.expectedF[i], sortedArray[i]);
		}
	}
}
