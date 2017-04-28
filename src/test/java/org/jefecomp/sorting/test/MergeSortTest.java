/**
 * 
 */
package org.jefecomp.sorting.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.jefecomp.sorting.impl.MergeSort;
import org.junit.Test;

/**
 * @author jefecomp
 *
 */
public class MergeSortTest {

	
	private MergeSort instance;
	
	
	public MergeSortTest(){
		
		this.instance = new MergeSort();
	}
	
	/**
	 * Test method for {@link org.jefecomp.sorting.impl.MergeSort#sort(java.lang.Number[])}.
	 */
	@Test
	public void testSort() {
		
		Integer[] array = {2,1,5,21,16,10,45,20,31};
		
		Integer[] expected = {1,2,5,10,16,20,21,31,45};
		
		this.instance.sort((Object[])array);
		
		for(int i = 0; i < array.length; i++){
			
			assertEquals(expected[i], array[i]);
		}
		
		
		Float[] arrayF = {3.5F,1.2F,4.7F,45.6F,32.1F,21.3F,0.4F,46.1F,23.3F,30.1F};
		
		Float[] expectedF = {0.4F,1.2F,3.5F,4.7F,21.3F,23.3F,30.1F,32.1F,45.6F,46.1F};
		
		this.instance.sort((Object[])arrayF);
		
		for(int i = 0; i < arrayF.length; i++){
			
			assertEquals(expectedF[i], arrayF[i]);
		}
		
	}

	/**
	 * Test method for {@link org.jefecomp.sorting.impl.MergeSort#setParameter(java.lang.String, java.lang.Number)}.
	 */
	@Test
	public void testSetParameter() {
	
		this.instance.setParameter("l", 1);
		
	}

	/**
	 * Test method for {@link org.jefecomp.sorting.impl.MergeSort#getParameter(java.lang.String)}.
	 */
	@Test
	public void testGetParameter() {
		
		
		assertNull(this.instance.getParameter("l"));
		
		assertNull(this.instance.getParameter("r"));
		
		assertNull(this.instance.getParameter("m"));
		
		assertNull(this.instance.getParameter("blablabla"));
		
	}

}
