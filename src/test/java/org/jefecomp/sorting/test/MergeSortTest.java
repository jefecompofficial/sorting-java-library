/**
 * 
 */
package org.jefecomp.sorting.test;

import static org.junit.Assert.assertNull;

import org.jefecomp.sorting.impl.MergeSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jefecomp
 *
 */
public class MergeSortTest {

	
	private MergeSort instance;
	
	private DataSetTest dataSet;
	
	
	
	@Before
	public void setUp(){
		
		this.instance = new MergeSort();
		
		this.dataSet = new DataSetTest();
	}
	
	@After
	public void tearDown(){
		
		this.instance = null;
		
		this.dataSet = null;
	}
	
	
	@Test
	public void testSort() {
		
		Integer[] arrayI = this.dataSet.getUnsortedArrayI();
		
		this.instance.sort((Object[])arrayI);
		
		this.dataSet.checkIntegerSorting(arrayI);
		
		Float[] arrayF = this.dataSet.getUnsortedArrayF();
		
		this.instance.sort((Object[])arrayF);
		
		this.dataSet.checkFloatSorting(arrayF);
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
