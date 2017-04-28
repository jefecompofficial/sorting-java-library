package org.jefecomp.sorting.test;

import org.jefecomp.sorting.impl.BubbleSort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	private BubbleSort instance;
	
	private DataSetTest dataSet;
	
	
	@Before
	public void setUp(){
		
		this.instance = new BubbleSort();
		
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
}
